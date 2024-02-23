<%@include file="../init.jsp"%>

<portlet:renderURL var="addEmployeeURL">
    <portlet:param name="mvcPath" value="/jsp/Employee/all.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addEmployee" var="addEmployeeURL"/>

<aui:form action="<%= addEmployeeURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="employee_id"/>
        <aui:input name="lastname"/>
        <aui:input name="firstname"/>
        <aui:input name="patronymic"/>
        <aui:input name="birthdate"/>
        <aui:input name="position"/>
        <aui:input name="gender"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= addEmployeeURL %>"/>
    </aui:button-row>
</aui:form>