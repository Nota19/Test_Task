package ru.hmel.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.text.SimpleDateFormat;

import ru.hmel.model.Electronics;
import ru.hmel.model.Employee;
import ru.hmel.model.Purchase;
import ru.hmel.model.impl.ElectronicsImpl;
import ru.hmel.model.impl.EmployeeImpl;
import ru.hmel.model.impl.PurchaseImpl;
import ru.hmel.service.ElectronicsLocalServiceUtil;
import ru.hmel.service.EmployeeLocalServiceUtil;
import ru.hmel.service.PurchaseLocalServiceUtil;

import java.text.ParseException;
import java.util.List;
public class StorePortlet extends MVCPortlet {

    // Employees
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



    // 1. Best smartphone sales employee
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

    // 2. The amount of money from the number of sales (refrigerators, teapot, boiler)
    public void AmountOfMoney(ActionRequest request, ActionResponse response) throws SystemException {


        //long sum = 0;
        //long [] prices = ParamUtil.getParameterValues(request, "price");



    }

    // 3. List of Employees (cost of purchases) who sales TV,smartphones
    public void AllSalesEmployees(ActionRequest request, ActionResponse response) {


    }

}

