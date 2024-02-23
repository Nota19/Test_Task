<%@include file="../init.jsp"%>

    <aui:button-row cssClass="Employee_menu">
        <portlet:renderURL var="printAllEmployee">
            <portlet:param name="mvcPath" value="/jsp/Employee/all.jsp"/>
        </portlet:renderURL>

        <aui:button onClick="<%= printAllEmployee %>" value="Show All Employee"/>

        <portlet:renderURL var="printBestEmployee">
            <portlet:param name="mvcPath" value="/jsp/Employee/all.jsp"/>
        </portlet:renderURL>

        <aui:button onClick="<%= printBestEmployee %>" value="Show best Employee"/>

        <portlet:renderURL var="printAllSalesEmployees">
            <portlet:param name="mvcPath" value="/jsp/Employee/all.jsp"/>
        </portlet:renderURL>

        <aui:button onClick="<%= printAllEmployee %>" value="Show All Sales Employees "/>

        <portlet:renderURL var="backViewURL">
            <portlet:param name="mvcPath" value="/view.jsp"/>
        </portlet:renderURL>

        <aui:button onClick="<%= backViewURL %>" value="Back"/>
    </aui:button-row>