package ru.hmel.liferay.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import ru.hmel.liferay.model.Employee;
import ru.hmel.liferay.model.Electronics;
import ru.hmel.liferay.model.Purchase;
import ru.hmel.liferay.model.PositionType;
import ru.hmel.liferay.model.ElectroType;
import ru.hmel.liferay.model.PurchaseType;
import ru.hmel.liferay.model.ElectroEmployee;
import ru.hmel.liferay.model.impl.EmployeeImpl;
import ru.hmel.liferay.model.impl.ElectronicsImpl;
import ru.hmel.liferay.model.impl.PurchaseImpl;
import ru.hmel.liferay.model.impl.PositionTypeImpl;
import ru.hmel.liferay.model.impl.ElectroTypeImpl;
import ru.hmel.liferay.model.impl.PurchaseTypeImpl;
import ru.hmel.liferay.model.impl.ElectroEmployeeImpl;
//import ru.hmel.liferay.model.positions;
import ru.hmel.liferay.service.EmployeeLocalServiceUtil;
import ru.hmel.liferay.service.ElectronicsLocalServiceUtil;
import ru.hmel.liferay.service.PurchaseLocalServiceUtil;
import ru.hmel.liferay.service.PositionTypeLocalServiceUtil;
import ru.hmel.liferay.service.ElectroTypeLocalServiceUtil;
import ru.hmel.liferay.service.PurchaseTypeLocalServiceUtil;
import ru.hmel.liferay.service.ElectroEmployeeLocalServiceUtil;


public class LiferayEmployeesPortlet extends MVCPortlet {

        public void addEmployee(ActionRequest request, ActionResponse response) {
            employee = new EmployeeImpl();
            try {
                Employee.setEmployee_id(EmployeeLocalServiceUtil.getEmployeeCount()+1);
                Employee.setLastname(ParamUtil.getString(request, "Last name"));
                Employee.setFirstname(ParamUtil.getString(request, "First name"));
                Employee.setPatronymic(ParamUtil.getString(request, "Patronymic"));
                Employee.setBirthdate(ParamUtil.getDate(request, "Birthdate"));
                Employee.setPosition(ParamUtil.getInenger(request, "Position"));
                Employee.setGender(ParamUtil.getBoolean(request, "Gender"));
                EmployeeLocalServiceUtil.addemployee;
                response.setRenderParametr("jspPage", "../jsp/Employee/all.jsp");
            } catch (Exception e) {
                System.out.println("Exception"+e+"was caught");
                e.printStackTrace();
            }
        }

        public void addElectronics(ActionRequest request, ActionResponce responce) {

        }

}