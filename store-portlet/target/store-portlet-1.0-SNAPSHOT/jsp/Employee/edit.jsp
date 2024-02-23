<%@include file="../init.jsp"%>

<jsp:useBean id="currentEmployee" type="ru.hmel.model.Employee" scope="request" />

<portlet:actionURL name="updateEmployee" var="updateEmployeeURL" />
<aui:form action="<%= updateEmployeeURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="Employee id" value="<%=currentEmployee.getEmployee_id() %>" type="hidden" />
        <aui:input name="Last name" value="<%=currentEmployee.getLastname() %>" />
        <aui:input name="First name" value="<%=currentEmployee.getFirstname() %>" />
        <aui:input name="Patronymic" value="<%=currentEmployee.getPatronymic() %>" />
        <aui:input name="Birthdate" value="<%=currentEmployee.getBirthdate() %>" />
        <aui:input name="Position" value="<%=currentEmployee.getPosition() %>" />
        <aui:input name="Gender" value="<%=currentEmployee.getGender() %>" />
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>
    </aui:button-row>
</aui:form>