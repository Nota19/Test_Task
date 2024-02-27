<%@include file="../init.jsp"%>

<portlet:actionURL name="calculateBestEmployee" var="calculateBestEmployeeURL"/>

<jsp:useBean id="bestEmployee" type="ru.hmel.model.Employee" scope="request" />

<liferay-ui:search-container-column-text name="Employee id" value="<%= String.valueOf(bestEmployee.getEmployee_id()) %>" />
<liferay-ui:search-container-column-text name="Last Name" value="<%= String.valueOf(bestEmployee.getLastname())%>" />
<liferay-ui:search-container-column-text name="First Name" value="<%= String.valueOf(bestEmployee.getFirstname()) %>" />
<liferay-ui:search-container-column-text name="Patronymic" value="<%= String.valueOf(bestEmployee.getPatronymic())%>" />
<liferay-ui:search-container-column-text name="Birthdate" value="<%= String.valueOf(bestEmployee.getBirthdate()) %>" />
<liferay-ui:search-container-column-text name="Position" value="<%= String.valueOf(bestEmployee.getPosition()) %>" />
<liferay-ui:search-container-column-text name="Gender" value="<%= String.valueOf(bestEmployee.getGender()) %>" />
