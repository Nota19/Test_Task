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

     <portlet:renderURL var="showAllPositionTypeFunc">
        <portlet:param name="mvcPath" value="/jsp/PositionType/menu.jsp"/>
     </portlet:renderURL>

     <aui:button onClick="<%= showAllPositionTypeFunc %>" value="PositionType"></aui:button>

     <portlet:renderURL var="showAllElectroTypeFunc">
        <portlet:param name="mvcPath" value="/jsp/ElectroType/menu.jsp"/>
     </portlet:renderURL>

     <aui:button onClick="<%= showAllElectroTypeFunc %>" value="ElectroType"></aui:button>

     <portlet:renderURL var="showAllPurchaseTypeFunc">
        <portlet:param name="mvcPath" value="/jsp/PurchaseType/menu.jsp"/>
     </portlet:renderURL>

     <aui:button onClick="<%= showAllPurchaseTypeFunc %>" value="PurchaseType"></aui:button>

     <portlet:renderURL var="showAllElectroEmployeeFunc">
        <portlet:param name="mvcPath" value="/jsp/ElectroEmployee/menu.jsp"/>
     </portlet:renderURL>

     <aui:button onClick="<%= showAllElectroEmployeeFunc %>" value="ElectroEmployee"></aui:button>

</aui:button-row>