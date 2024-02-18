<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>

<%@ page import="ru.hmel.liferay.model.Employee" %>
<%@ page import="ru.hmel.liferay.model.Electronics" %>
<%@ page import="ru.hmel.liferay.model.Purchase" %>
<%@ page import="ru.hmel.liferay.model.PositionType" %>
<%@ page import="ru.hmel.liferay.model.ElectroType" %>
<%@ page import="ru.hmel.liferay.model.PurchaseType" %>
<%@ page import="ru.hmel.liferay.model.ElectroEmployee" %>

<%@ page import="ru.hmel.liferay.service.EmployeeLocalServiceUtil" %>
<%@ page import="ru.hmel.liferay.service.ElectronicsLocalServiceUtil" %>
<%@ page import="ru.hmel.liferay.service.PurchaseLocalServiceUtil" %>
<%@ page import="ru.hmel.liferay.service.PositionTypeLocalServiceUtil" %>
<%@ page import="ru.hmel.liferay.service.ElectroTypeLocalServiceUtil" %>
<%@ page import="ru.hmel.liferay.service.PurchaseTypeLocalServiceUtil" %>
<%@ page import="ru.hmel.liferay.service.ElectroEmployeeLocalServiceUtil" %>

<portlet:defineObjects />


