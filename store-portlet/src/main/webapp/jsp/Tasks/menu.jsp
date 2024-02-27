<%@include file="../init.jsp"%>

<aui:button-row cssClass="Tasks_menu">
    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="/view.jsp"/>
    </portlet:renderURL>
    <aui:button onClick="<%= backViewURL %>" value="Back"/>

    <portlet:actionURL var="Task1URL" name="calculateBestEmployee"/>
    <aui:button onClick="<%= Task1URL %>" value="Task 1"/>

    <portlet:actionURL var="Task2URL" name="AmountOfMoney"/>
    <aui:button onClick="<%= Task2URL %>" value="Task 2"/>

    <portlet:actionURL var="Task3URL" name="AllSalesEmployees"/>
    <aui:button onClick="<%= Task3URL %>" value="Task 3"/>

    <portlet:renderURL var="ImportData">
        <portlet:param name="mvcPath" value="/jsp/Tasks/import.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= ImportData %>" value="Import Data"/>

</aui:button-row>