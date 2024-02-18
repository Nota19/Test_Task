<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>

<%@ page import="ru.hmel.model.Employee" %>
<%@ page import="ru.hmel.model.Electronics" %>
<%@ page import="ru.hmel.model.Purchase" %>
<%@ page import="ru.hmel.model.PositionType" %>
<%@ page import="ru.hmel.model.ElectroType" %>
<%@ page import="ru.hmel.model.PurchaseType" %>
<%@ page import="ru.hmel.model.ElectroEmployee" %>

<%@ page import="ru.hmel.service.EmployeeLocalServiceUtil" %>
<%@ page import="ru.hmel.service.ElectronicsLocalServiceUtil" %>
<%@ page import="ru.hmel.service.PurchaseLocalServiceUtil" %>
<%@ page import="ru.hmel.service.PositionTypeLocalServiceUtil" %>
<%@ page import="ru.hmel.service.ElectroTypeLocalServiceUtil" %>
<%@ page import="ru.hmel.service.PurchaseTypeLocalServiceUtil" %>
<%@ page import="ru.hmel.service.ElectroEmployeeLocalServiceUtil" %>

<portlet:defineObjects />


