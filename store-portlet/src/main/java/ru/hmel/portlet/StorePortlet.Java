package ru.hmel.portlet;

import com.liferay.portal.kernel.dao.orm.*;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.SimpleDateFormat;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import org.w3c.dom.ls.LSOutput;
import ru.hmel.model.*;
import ru.hmel.model.impl.*;
import ru.hmel.service.*;
import ru.hmel.util.CsvImporter;

import java.text.ParseException;
import java.util.*;

public class StorePortlet extends MVCPortlet {

    public void addEmployee(ActionRequest request, ActionResponse response) {
        Employee Employee = new EmployeeImpl();
        try {
            Employee.setEmployee_id(EmployeeLocalServiceUtil.getEmployeesCount()+1);
            Employee.setFirstname(ParamUtil.getString(request, "First name"));
            Employee.setLastname(ParamUtil.getString(request, "Last name"));
            Employee.setPatronymic(ParamUtil.getString(request, "Patronymic"));

            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            String date = ParamUtil.getString(request, "Birthdate");

            if (!date.equals("")) {
                Employee.setBirthdate(format.parse(date));
            }

            Employee.setPosition(ParamUtil.getLong(request, "Position"));
            Employee.setGender(ParamUtil.getBoolean(request, "Gender"));
            EmployeeLocalServiceUtil.addEmployee(Employee);
            response.setRenderParameter("jspPage", "/jsp/Employee/all.jsp");
        } catch (Exception e) {
            System.out.println("Exception"+e+"was caught");
            e.printStackTrace();
        }
    }

    public void getCurrentEmployee(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Employee currentEmployee = EmployeeLocalServiceUtil.
                getEmployee(Long.parseLong(request.getParameter("currentEmployeeID")));

        request.setAttribute("currentEmployee", currentEmployee);

        response.setRenderParameter("jspPage", "/jsp/Employee/edit.jsp");
    }

    public void updateEmployee(ActionRequest request, ActionResponse response) throws SystemException {
        Employee Employee = new EmployeeImpl();
        try {

            Employee.setEmployee_id(ParamUtil.getLong(request, "Employee id"));
            Employee.setLastname(ParamUtil.getString(request, "Last name"));
            Employee.setFirstname(ParamUtil.getString(request, "First name"));
            Employee.setPatronymic(ParamUtil.getString(request, "Patronymic"));

            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            String date = ParamUtil.getString(request, "Birthdate");

            if (!date.equals("")) {
                Employee.setBirthdate(format.parse(date));
            }
            Employee.setPosition(ParamUtil.getLong(request, "Position"));
            Employee.setGender(ParamUtil.getBoolean(request, "Gender"));

            EmployeeLocalServiceUtil.updateEmployee(Employee);
            response.setRenderParameter("jspPage", "/jsp/Employee/all.jsp");
        } catch (Exception e) {
            System.out.println("Exception"+e+"was caught");
            e.printStackTrace();
        }
    }

    public void importEmployee(String[] employeeData, ActionResponse response) {
        Employee Employee = new EmployeeImpl();
        try {
            Employee.setEmployee_id(Long.parseLong(employeeData[0]));
            Employee.setLastname(employeeData[1]);
            Employee.setFirstname(employeeData[2]);
            Employee.setPatronymic(employeeData[3]);

            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

            if (!employeeData[4].equals("")) {
                Employee.setBirthdate(format.parse(employeeData[4]));
            }
            Employee.setPosition(Long.parseLong(employeeData[5]));
            Employee.setGender(Boolean.parseBoolean(employeeData[6]));

            EmployeeLocalServiceUtil.addEmployee(Employee);
            response.setRenderParameter("jspPage", "/jsp/Employee/all.jsp");
        } catch (Exception e) {
            System.out.println("Exception"+e+"was caught");
            e.printStackTrace();
        }

    }

    // Electronics
    public void addElectronics(ActionRequest request, ActionResponse response) {
        try {
            Electronics Electronics = new ElectronicsImpl();
            Electronics.setElectronics_id(ElectronicsLocalServiceUtil.getElectronicsesCount()+1);
            Electronics.setName(ParamUtil.getString(request, "Name"));
            Electronics.setEtype(ParamUtil.getLong(request, "Etype"));
            Electronics.setPrice(ParamUtil.getLong(request, "Price"));
            Electronics.setCount(ParamUtil.getLong(request, "Count"));
            Electronics.setInStock(ParamUtil.getBoolean(request, "InStock"));
            Electronics.setArchive(ParamUtil.getBoolean(request, "Archive"));
            Electronics.setDescription(ParamUtil.getString(request, "Description"));

            ElectronicsLocalServiceUtil.addElectronics(Electronics);
            response.setRenderParameter("jspPage", "/jsp/Electronics/all.jsp");

        } catch (Exception e) {
            System.out.println("Exception" + e + " was caught");
            e.printStackTrace();
        }
    }

    public void getCurrentElectronics(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Electronics currentElectronics = ElectronicsLocalServiceUtil.
                getElectronics(Long.parseLong(request.getParameter("currentElectronicsID")));

        request.setAttribute("currentElectronics", currentElectronics);

        response.setRenderParameter("jspPage", "/jsp/Electronics/edit.jsp");
    }

    public void updateElectronics(ActionRequest request, ActionResponse response) throws SystemException {
        Electronics Electronics = new ElectronicsImpl();

        Electronics.setElectronics_id(ParamUtil.getLong(request, "Electronics id"));
        Electronics.setName(ParamUtil.getString(request, "Name"));
        Electronics.setEtype(ParamUtil.getLong(request, "Etype"));
        Electronics.setPrice(ParamUtil.getLong(request, "Price"));
        Electronics.setCount(ParamUtil.getLong(request, "Count"));
        Electronics.setInStock(ParamUtil.getBoolean(request, "InStock"));
        Electronics.setArchive(ParamUtil.getBoolean(request, "Archive"));
        Electronics.setDescription(ParamUtil.getString(request, "Description"));

        ElectronicsLocalServiceUtil.updateElectronics(Electronics);
        response.setRenderParameter("jspPage", "/jsp/Electronics/all.jsp");
    }

    public void importElectronics(String[] electronicsData, ActionResponse response) throws SystemException {
        Electronics Electronics = new ElectronicsImpl();

        Electronics.setElectronics_id(Long.parseLong(electronicsData[0]));
        Electronics.setName(electronicsData[1]);
        Electronics.setEtype(Long.parseLong(electronicsData[2]));
        Electronics.setPrice(Long.parseLong(electronicsData[3]));
        Electronics.setCount(Long.parseLong(electronicsData[4]));
        Electronics.setInStock(Boolean.parseBoolean(electronicsData[5]));
        Electronics.setArchive(Boolean.parseBoolean(electronicsData[6]));
        Electronics.setDescription(electronicsData[7]);

        ElectronicsLocalServiceUtil.addElectronics(Electronics);
        response.setRenderParameter("jspPage", "/jsp/Electronics/all.jsp");

    }


    // Purchase
    public void addPurchase(ActionRequest request, ActionResponse response) throws SystemException {
        try {
            Purchase Purchase = new PurchaseImpl();
            Purchase.setPurchase_id(PurchaseLocalServiceUtil.getPurchasesCount() + 1);
            Purchase.setElectro_id(ParamUtil.getLong(request, "Electro id"));
            Purchase.setEmployee_id(ParamUtil.getLong(request, "Employee id"));

            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            String date = ParamUtil.getString(request, "Purchase Date");

            if (!date.equals("")) {
                Purchase.setPurchaseDate(format.parse(date));
            }
            Purchase.setType(ParamUtil.getLong(request, "Type"));

            PurchaseLocalServiceUtil.addPurchase(Purchase);
            response.setRenderParameter("jspPage", "/jsp/Purchase/all.jsp");
        } catch (Exception e) {
            System.out.println("Exception" + e + " was caught");
            e.printStackTrace();
        }
    }

    public void getCurrentPurchase(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Purchase currentPurchase = PurchaseLocalServiceUtil.
                getPurchase(Long.parseLong(request.getParameter("currentPurchaseID")));

        request.setAttribute("currentPurchase", currentPurchase);

        response.setRenderParameter("jspPage", "/jsp/Purchase/edit.jsp");
    }


    public void updatePurchase(ActionRequest request, ActionResponse response) throws SystemException {
        Purchase Purchase = new PurchaseImpl();
        try {
            Purchase.setPurchase_id(ParamUtil.getLong(request, "Purchase id"));
            Purchase.setElectro_id(ParamUtil.getLong(request, "Electro id"));
            Purchase.setEmployee_id(ParamUtil.getLong(request, "Employee id"));

            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            String date = ParamUtil.getString(request, "Purchase Date");

            if (!date.equals("")) {
                Purchase.setPurchaseDate(format.parse(date));
            }
            Purchase.setType(ParamUtil.getLong(request, "Type"));

            PurchaseLocalServiceUtil.updatePurchase(Purchase);
            response.setRenderParameter("jspPage", "/jsp/Purchase/all.jsp");
        } catch (Exception e) {
            System.out.println("Exception" + e + "was caught");
            e.printStackTrace();
        }
    }

    public void importPurchase(String[] purchaseData, ActionResponse response) {
        Purchase Purchase = new PurchaseImpl();
        try {
            Purchase.setPurchase_id(Long.parseLong(purchaseData[0]));
            Purchase.setElectro_id(Long.parseLong(purchaseData[1]));
            Purchase.setEmployee_id(Long.parseLong(purchaseData[2]));

            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

            if (!purchaseData[3].equals("")) {
                Purchase.setPurchaseDate(format.parse(purchaseData[3]));
            }
            Purchase.setType(Long.parseLong(purchaseData[4]));

            PurchaseLocalServiceUtil.addPurchase(Purchase);
            response.setRenderParameter("jspPage", "/jsp/Purchase/all.jsp");
        } catch (Exception e) {
            System.out.println("Exception" + e + "was caught");
            e.printStackTrace();
        }
    }

    public void uploadElectroType(ActionRequest request, ActionResponse response) throws SystemException, IOException, CsvValidationException {
        String[] values;

        UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);

        File file = uploadPortletRequest.getFile("uploadedFileElectroType");

        InputStream stream = Files.newInputStream(file.toPath());

        CSVReaderBuilder csvReaderBuilder = new CSVReaderBuilder(new InputStreamReader(stream, StandardCharsets.UTF_8));
        csvReaderBuilder.withCSVParser(new CSVParserBuilder().withSeparator(';').build());

        CSVReader csvReader = csvReaderBuilder.build();
        int i = 0;
        while ((values = csvReader.readNext()) != null) {
            if (i != 0) {
                ElectroType ElectroType = new ElectroTypeImpl();

                ElectroType.setElectro_type_id(Long.parseLong(values[0]));
                ElectroType.setName(values[1]);

                ElectroTypeLocalServiceUtil.addElectroType(ElectroType);
            }
            i++;
        }
    }

    public void uploadPurchaseType(ActionRequest request, ActionResponse response) throws SystemException, IOException, CsvValidationException {
        String[] values;

        UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
        File file = uploadPortletRequest.getFile("uploadedFilePurchaseType");

        InputStream stream = Files.newInputStream(file.toPath());
        CSVReaderBuilder csvReaderBuilder = new CSVReaderBuilder(new InputStreamReader(stream, StandardCharsets.UTF_8));
        csvReaderBuilder.withCSVParser(new CSVParserBuilder().withSeparator(';').build());

        CSVReader csvReader = csvReaderBuilder.build();
        int i = 0;
        while ((values = csvReader.readNext()) != null) {
            if (i != 0) {
                PurchaseType PurchaseType = new PurchaseTypeImpl();

                PurchaseType.setPurchase_type_id(Long.parseLong(values[0]));
                PurchaseType.setName(values[1]);

                PurchaseTypeLocalServiceUtil.addPurchaseType(PurchaseType);
            }
            i++;
        }

    }

    public void uploadPositionType(ActionRequest request, ActionResponse response) throws SystemException, IOException, CsvValidationException {
        String[] values;

        UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
        File file = uploadPortletRequest.getFile("uploadedFilePositionType");

        InputStream stream = Files.newInputStream(file.toPath());
        CSVReaderBuilder csvReaderBuilder = new CSVReaderBuilder(new InputStreamReader(stream, StandardCharsets.UTF_8));
        csvReaderBuilder.withCSVParser(new CSVParserBuilder().withSeparator(';').build());

        CSVReader csvReader = csvReaderBuilder.build();
        int i = 0;
        while ((values = csvReader.readNext()) != null) {
            if (i != 0) {
                PositionType PositionType = new PositionTypeImpl();

                PositionType.setPosition_id(Long.parseLong(values[0]));
                PositionType.setName(values[1]);

                PositionTypeLocalServiceUtil.addPositionType(PositionType);
            }
            i++;
        }
    }

    public void uploadElectroEmployee(ActionRequest request, ActionResponse response) throws SystemException, IOException, CsvValidationException {
        String[] values;

        UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
        File file = uploadPortletRequest.getFile("uploadedFiledElectroEmployee");

        InputStream stream = Files.newInputStream(file.toPath());
        CSVReaderBuilder csvReaderBuilder = new CSVReaderBuilder(new InputStreamReader(stream, StandardCharsets.UTF_8));
        csvReaderBuilder.withCSVParser(new CSVParserBuilder().withSeparator(';').build());

        CSVReader csvReader = csvReaderBuilder.build();
        int i = 0;
        while ((values = csvReader.readNext()) != null) {
            if (i != 0) {
                ElectroEmployee ElectroEmployee = new ElectroEmployeeImpl();

                ElectroEmployee.setElectro_employee_id(Long.parseLong(values[0]));
                ElectroEmployee.setEtype(Long.parseLong(values[1]));

                ElectroEmployeeLocalServiceUtil.addElectroEmployee(ElectroEmployee);
            }
            i++;
        }
    }

    // 1. Best smartphone sales employee
    public void calculateBestEmployee(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        List<Employee> employees =  EmployeeLocalServiceUtil.getEmployees(-1,-1);
        List<Purchase> purchases = PurchaseLocalServiceUtil.getPurchases(-1, -1);
        List<Electronics> electronics = ElectronicsLocalServiceUtil.getElectronicses(-1, -1);

        HashMap<Long, Long> employeeAndTotalSales = new HashMap<>();

        for (Employee employee : employees) {
            long currentEmployeeId = employee.getEmployee_id();
            long smartPhonesSum = 0;
            for (Purchase purchase : purchases) {
                if (currentEmployeeId == purchase.getEmployee_id()) {
                    for (Electronics electronic : electronics) {
                        if ( purchase.getElectro_id() == electronic.getElectronics_id()
                                && electronic.getPrice() <= 1000000 && electronic.getEtype() == 3) {
                            smartPhonesSum += electronic.getPrice();
                            employeeAndTotalSales.put(currentEmployeeId, smartPhonesSum);
                        }
                    }
                }
            }
        }

        long bestEmployeeId = 0;
        Long max = 0L;
        for (Map.Entry<Long, Long> entry : employeeAndTotalSales.entrySet()) {
            Long employeeId = entry.getKey();
            Long sum = entry.getValue();
            if (sum > max) {
                max = sum;
                bestEmployeeId = employeeId;
            }
        }
        Employee bestEmployee = EmployeeLocalServiceUtil.getEmployee(bestEmployeeId);

        request.setAttribute("bestEmployee", bestEmployee);
        request.setAttribute("bestEmployeeMax", max);
        response.setRenderParameter("jspPage", "/jsp/Tasks/task1.jsp");
    }
    //
    // 2. The amount of money from the number of sales (refrigerators, teapot, boiler)
    public void AmountOfMoney(ActionRequest request, ActionResponse response) throws SystemException {
        List<Purchase> purchases = PurchaseLocalServiceUtil.getPurchases(-1, -1);
        List<Electronics> electronics = ElectronicsLocalServiceUtil.getElectronicses(-1, -1);

        Long sum = 0L;
        for (Purchase purchase : purchases) {
            for (Electronics electronic : electronics) {
                if (purchase.getElectro_id() == electronic.getElectronics_id() &&
                        (electronic.getEtype() == 6 || electronic.getEtype() == 9 || electronic.getEtype() == 11)) {
                    sum = Long.sum(sum, electronic.getPrice());
                }
            }
        }
        request.setAttribute("amountMoney", sum);
        response.setRenderParameter("jspPage", "/jsp/Tasks/task2.jsp");
    }

    // 3. List of Employees (cost of purchases) who sales TV,smartphones
    public void AllSalesEmployees(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        List<Employee> employees =  EmployeeLocalServiceUtil.getEmployees(-1,-1);
        List<Purchase> purchases = PurchaseLocalServiceUtil.getPurchases(-1, -1);
        List<Electronics> electronics = ElectronicsLocalServiceUtil.getElectronicses(-1, -1);

        HashMap<Long, Long> employeeAndTotalPurchases = new HashMap<>();

        for (Employee employee : employees) {
            long currentEmployeeId = employee.getEmployee_id();
            long purchaseCount = 0;

            for (Purchase purchase : purchases) {
                if (currentEmployeeId == purchase.getEmployee_id()) {
                    for (Electronics electronic : electronics) {
                        if (purchase.getElectro_id() == electronic.getElectronics_id() &&
                                (electronic.getEtype() == 1 || electronic.getEtype() == 3)) {
                            purchaseCount++;
                            employeeAndTotalPurchases.put(currentEmployeeId, purchaseCount);
                        }
                    }
                }
            }
        }

        List<Map.Entry<Long, Long>> list = new LinkedList<>(employeeAndTotalPurchases.entrySet());

        // Sort the list
        list.sort(Map.Entry.comparingByValue());

        ArrayList <Employee> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            result.add(i, EmployeeLocalServiceUtil.getEmployee(list.get(i).getKey()));
        }

        request.setAttribute("allSalesEmployees", result);
        request.setAttribute("employeesPurchaseCount", list);

        response.setRenderParameter("jspPage", "/jsp/Tasks/task3.jsp");
    }

    public void uploadDocument(ActionRequest request, ActionResponse response) throws IOException, CsvValidationException, SystemException {
        boolean checkHeader = false;
        String[] values;

        UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
        File file = uploadPortletRequest.getFile("uploadedFile");

        InputStream stream = Files.newInputStream(file.toPath());
        CSVReaderBuilder csvReaderBuilder = new CSVReaderBuilder(new InputStreamReader(stream, StandardCharsets.UTF_8));
        csvReaderBuilder.withCSVParser(new CSVParserBuilder().withSeparator(';').build());

        CSVReader csvReader = csvReaderBuilder.build();

        CsvImporter.Entity entity = CsvImporter.Entity.UNKNOWN;
        while ((values = csvReader.readNext()) != null) {
            if (!checkHeader) {
                entity = CsvImporter.checkDataHeaders(values);
                checkHeader = true;
            } else {
                // check headers
                switch (entity) {
                    case EMPLOYEE:
                        importEmployee(values, response);
                        break;
                    case ELECTRONICS:
                        importElectronics(values, response);
                        break;
                    case PURCHASE:
                        importPurchase(values, response);
                        break;
                    case UNKNOWN:
                        System.out.println("Unknown file");
                        break;
                }
            }
        }

    }

}

