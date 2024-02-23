<%@include file="../init.jsp"%>

<aui:button-row cssClass="Employee_menu">
    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="/view.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>

    <portlet:renderURL var="printAllEmployees">
        <portlet:param name="mvcPath" value="/jsp/Employee/all.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= printAllEmployees %>" value="Show All Employee"/>

</aui:button-row>