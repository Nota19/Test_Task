<%@include file="../init.jsp"%>

<jsp:useBean id="currentEmployee" type="ru.hmel.model.Employee" scope="request" />

<portlet:actionURL name="updateEmployee" var="updateEmployeeURL" />
<aui:form action="<%= updateEmployeeURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="employee_id" value="<%=currentEmployee.getEmployee_id() %>" type="hidden" />
        <aui:input name="lastname" value="<%=currentEmployee.getLastname() %>" />
        <aui:input name="firstname" value="<%=currentEmployee.getFirstname() %>" />
        <aui:input name="patronymic" value="<%=currentEmployee.getPatronymic() %>" />
        <aui:input name="birthdate" value="<%=currentEmployee.getBirthdate() %>" />
        <aui:input name="position" value="<%=currentEmployee.getPosition() %>" />
        <aui:input name="gender" value="<%=currentEmployee.getGender() %>" />
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>
    </aui:button-row>
</aui:form>