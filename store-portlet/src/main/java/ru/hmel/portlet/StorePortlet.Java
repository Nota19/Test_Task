package ru.hmel.portlet;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import ru.hmel.model.Electronics;
import ru.hmel.model.Employee;
import ru.hmel.model.Purchase;

import ru.hmel.model.impl.ElectronicsImpl;
import ru.hmel.model.impl.EmployeeImpl;
import ru.hmel.model.impl.PurchaseImpl;
import ru.hmel.service.ElectronicsLocalServiceUtil;
import ru.hmel.service.EmployeeLocalServiceUtil;
import ru.hmel.service.PurchaseLocalServiceUtil;

import java.io.*;
import java.io.BufferedReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class StorePortlet extends MVCPortlet{

    public static List<String[]> readLineByLine(Path filePath) throws Exception {
        List<String[]> list = new ArrayList<>();

        CSVParser parser = new CSVParserBuilder()
                .withSeparator(',')
                .withIgnoreQuotations(true)
                .build();

        try (Reader reader = Files.newBufferedReader(filePath)) {

            CSVReaderBuilder csvReaderBuilder = new CSVReaderBuilder(reader)
                    .withSkipLines(0)
                    .withCSVParser(parser);

            try (CSVReader csvReader = csvReaderBuilder.build()) {
                String[] line;
                while ((line = csvReader.readNext()) != null) {
                    list.add(line);
                }
            }

        }
        return list;
    }

    public void addEmployee(ActionRequest request, ActionResponse response) throws SystemException {
        Employee Employee = new EmployeeImpl();
        try {
            Employee.setEmployee_id(EmployeeLocalServiceUtil.getEmployeesCount()+1);
            Employee.setFirstname(ParamUtil.getString(request, "First name"));
            Employee.setLastname(ParamUtil.getString(request, "Last name"));
            Employee.setPatronymic(ParamUtil.getString(request, "Patronymic"));
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            if (!(ParamUtil.getString(request, "birthdate")).equals("")) {
                Employee.setBirthdate(format.parse
                        (ParamUtil.getString(request, "Birthdate")));
            } else Employee.setBirthdate(null);
            Employee.setPosition(ParamUtil.getLong(request, "Position"));
            Employee.setGender(ParamUtil.getBoolean(request, "Gender"));
            EmployeeLocalServiceUtil.addEmployee(Employee);
            response.setRenderParameter("jspPage", "/jsp/Employee/add.jsp");
        } catch (Exception e) {
            System.out.println("Exception"+e+"was caught");
            e.printStackTrace();
        }

    }

    public void updateEmployee(ActionRequest request, ActionResponse response) throws SystemException {
        Employee Employee = new EmployeeImpl();
        Employee.setEmployee_id(ParamUtil.getLong(request, "key"));
        Employee.setFirstname(ParamUtil.getString(request, "First name"));
        Employee.setLastname(ParamUtil.getString(request, "Last name"));
        Employee.setPatronymic(ParamUtil.getString(request, "Patronymic"));
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Employee.setBirthdate(format.parse(ParamUtil.getString(request, "Birthdate")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Employee.setPosition(ParamUtil.getLong(request, "Position"));
        Employee.setGender(ParamUtil.getBoolean(request, "Gender"));
        Employee.setFirstname(ParamUtil.getString(request, "First name"));

        EmployeeLocalServiceUtil.updateEmployee(Employee);
        response.setRenderParameter("jspPage", "/jsp/Employee/edit.jsp");
    }

    public void addPurchase(ActionRequest request, ActionResponse response) throws SystemException {
        try {
            Purchase Purchase = new PurchaseImpl();
            Purchase.setPurchase_id(PurchaseLocalServiceUtil.getPurchasesCount() + 1);
            Purchase.setElectro_id(ParamUtil.getLong(request, "Electro id"));
            Purchase.setEmployee_id(ParamUtil.getLong(request, "Employee id"));
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
            if (!(ParamUtil.getString(request, "purchase Date")).equals("")) {
                Purchase.setPurchaseDate(format.parse
                        (ParamUtil.getString(request, "Purchase Date")));
            } else Purchase.setPurchaseDate(null);
            Purchase.setType(ParamUtil.getLong(request, "Type"));

            PurchaseLocalServiceUtil.addPurchase(Purchase);
            response.setRenderParameter("jspPage", "/jsp/Purchase/add.jsp");
        } catch (Exception e) {
            System.out.println("Exception" + e + " was caught");
            e.printStackTrace();
        }
    }

    public void updatePurchase(ActionRequest request, ActionResponse response) throws SystemException {
        Purchase Purchase = new PurchaseImpl();
        Purchase.setPurchase_id(ParamUtil.getLong(request, "key"));
        Purchase.setElectro_id(ParamUtil.getLong(request, "Electro id"));
        Purchase.setEmployee_id(ParamUtil.getLong(request, "Employee id"));
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        try {
            Purchase.setPurchaseDate(format.parse(ParamUtil.getString(request, "Purchase Date")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Purchase.setType(ParamUtil.getLong(request, "Type"));

        PurchaseLocalServiceUtil.updatePurchase(Purchase);
        response.setRenderParameter("jspPage", "/jsp/Purchase/edit.jsp");
    }

    public void addElectronics(ActionRequest request, ActionResponse response) {
        try {
            Electronics Electronics = new ElectronicsImpl();
            Electronics.setElectronics_id(ElectronicsLocalServiceUtil.getElectronicsesCount()+1);
            Electronics.setName(ParamUtil.getString(request, "Name"));
            Electronics.setEtype(ParamUtil.getLong(request, "Etype"));
            Electronics.setPrice(ParamUtil.getLong(request, "Price"));
            Electronics.setCount(ParamUtil.getLong(request, "Count"));
            Electronics.setInStock(ParamUtil.getBoolean(request, "In stock"));
            Electronics.setArchive(ParamUtil.getBoolean(request, "Archive"));
            Electronics.setDescription(ParamUtil.getString(request, "Description"));

            ElectronicsLocalServiceUtil.addElectronics(Electronics);
            response.setRenderParameter("jspPage", "/jsp/Electronics/add.jsp");

        } catch (Exception e) {
            System.out.println("Exception" + e + " was caught");
            e.printStackTrace();
        }
    }

    public void updateElectronics(ActionRequest request, ActionResponse response) throws SystemException {
        Electronics Electronics = new ElectronicsImpl();
        Electronics.setElectronics_id(ParamUtil.getLong(request, "key"));
        Electronics.setName(ParamUtil.getString(request, "Name"));
        Electronics.setEtype(ParamUtil.getLong(request, "Etype"));
        Electronics.setPrice(ParamUtil.getLong(request, "Price"));
        Electronics.setCount(ParamUtil.getLong(request, "Count"));
        Electronics.setInStock(ParamUtil.getBoolean(request, "In stock"));
        Electronics.setArchive(ParamUtil.getBoolean(request, "Archive"));
        Electronics.setDescription(ParamUtil.getString(request, "Description"));

        ElectronicsLocalServiceUtil.updateElectronics(Electronics);
        response.setRenderParameter("jspPage", "/jsp/Electronics/edit.jsp");

    }

    public void bestEmployee(ActionRequest request, ActionResponse response) throws SystemException {

        List<Employee> employess =  EmployeeLocalServiceUtil.getEmployees(0,-1);
        List<Purchase> purchases =  PurchaseLocalServiceUtil.getPurchases(0, -1);


        for (int i = 0; i < employess.size(); i++) {
            employess.get(i).getEmployee_id();
            for (int j = 0; j < purchases.size(); j++) {
                if (employess.get(i).getEmployee_id() == purchases.get(i).getEmployee_id()) {

                }

            }

        }


    }

    public void AmountOfMoney(ActionRequest request, ActionResponse response) throws SystemException {


        //long sum = 0;
        //(if etype == (fridge || kettle || water heater)
        //long [] prices = ParamUtil.getParameterValues(request, "price");



    }

    public void AllSalesEmployees(ActionRequest request, ActionResponse response) {


    }

}

