<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@include file="../init.jsp"%>

<portlet:defineObjects />
<%
    List<Employee> employees = (List<Employee>) request.getAttribute("allSalesEmployees");
%>


<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= employees  %>"/>

    <liferay-ui:search-container-row
            className="ru.hmel.model.Employee" modelVar="Employee">

        <liferay-ui:search-container-column-text property="employee_id" name="Employee id"/>
        <liferay-ui:search-container-column-text property="lastname" name="Last name"/>
        <liferay-ui:search-container-column-text property="firstname" name="First name"/>
        <liferay-ui:search-container-column-text property="patronymic" name="Patronymic"/>
        <liferay-ui:search-container-column-text property="birthdate" name="Birthdate"/>
        <liferay-ui:search-container-column-text property="position" name="Position"/>
        <liferay-ui:search-container-column-text property="gender" name="Gender"/>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<portlet:renderURL var="backViewURL">
    <portlet:param name="mvcPath" value="/jsp/Tasks/menu.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= backViewURL %>" value="Back"/>
