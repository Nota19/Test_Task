<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<aui:button-row cssClass="main-menu">

    <portlet:renderURL var="Employees">
        <portlet:param name="mvcPath" value="/jsp/Employee/menu.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= Employees %>" value="Employees"></aui:button>

    <portlet:renderURL var="Electronics">
        <portlet:param name="mvcPath" value="/jsp/Electronics/menu.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= Electronics %>" value="Electronics"></aui:button>

     <portlet:renderURL var="Purchases">
        <portlet:param name="mvcPath" value="/jsp/Purchase/menu.jsp"/>
     </portlet:renderURL>

     <aui:button onClick="<%= Purchases %>" value="Purchases"></aui:button>

    <portlet:renderURL var="Tasks">
        <portlet:param name="mvcPath" value="/jsp/Tasks/menu.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= Tasks %>" value="Tasks"></aui:button>

</aui:button-row>