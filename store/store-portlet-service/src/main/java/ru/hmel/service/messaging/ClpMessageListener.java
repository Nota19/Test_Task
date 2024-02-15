package ru.hmel.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import ru.hmel.service.ClpSerializer;
import ru.hmel.service.ElectroEmployeeLocalServiceUtil;
import ru.hmel.service.ElectroEmployeeServiceUtil;
import ru.hmel.service.ElectroTypeLocalServiceUtil;
import ru.hmel.service.ElectroTypeServiceUtil;
import ru.hmel.service.ElectronicsLocalServiceUtil;
import ru.hmel.service.ElectronicsServiceUtil;
import ru.hmel.service.EmployeeLocalServiceUtil;
import ru.hmel.service.EmployeeServiceUtil;
import ru.hmel.service.PositionTypeLocalServiceUtil;
import ru.hmel.service.PositionTypeServiceUtil;
import ru.hmel.service.PurchaseLocalServiceUtil;
import ru.hmel.service.PurchaseServiceUtil;
import ru.hmel.service.PurchaseTypeLocalServiceUtil;
import ru.hmel.service.PurchaseTypeServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            ElectroEmployeeLocalServiceUtil.clearService();

            ElectroEmployeeServiceUtil.clearService();
            ElectronicsLocalServiceUtil.clearService();

            ElectronicsServiceUtil.clearService();
            ElectroTypeLocalServiceUtil.clearService();

            ElectroTypeServiceUtil.clearService();
            EmployeeLocalServiceUtil.clearService();

            EmployeeServiceUtil.clearService();
            PositionTypeLocalServiceUtil.clearService();

            PositionTypeServiceUtil.clearService();
            PurchaseLocalServiceUtil.clearService();

            PurchaseServiceUtil.clearService();
            PurchaseTypeLocalServiceUtil.clearService();

            PurchaseTypeServiceUtil.clearService();
        }
    }
}
