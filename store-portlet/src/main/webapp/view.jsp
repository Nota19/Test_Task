<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<aui:button-row cssClass="main-menu">

    <portlet:renderURL var="showAllEmployeeFunc">
        <portlet:param name="mvcPath" value="/jsp/Employee/menu.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= showAllEmployeeFunc %>" value="Employee"></aui:button>

    <portlet:renderURL var="showAllElectronicsFunc">
        <portlet:param name="mvcPath" value="/jsp/Electronics/menu.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= showAllElectronicsFunc %>" value="Electronics"></aui:button>

     <portlet:renderURL var="showAllPurchaseFunc">
        <portlet:param name="mvcPath" value="/jsp/Purchase/menu.jsp"/>
     </portlet:renderURL>

     <aui:button onClick="<%= showAllPurchaseFunc %>" value="Purchase"></aui:button>


</aui:button-row>