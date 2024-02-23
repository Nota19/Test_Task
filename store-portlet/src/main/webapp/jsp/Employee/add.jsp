<%@include file="../init.jsp"%>

<portlet:renderURL var="addEmployeeURL">
    <portlet:param name="mvcPath" value="/jsp/Employee/all.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addEmployee" var="addEmployeeURL"/>

<portlet:renderURL var="backViewURL">
    <portlet:param name="mvcPath" value="/jsp/Employee/all.jsp"/>
</portlet:renderURL>

<aui:form action="<%= addEmployeeURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="First name"/>
        <aui:input name="Last name"/>
        <aui:input name="Patronymic"/>
        <aui:input name="Birthdate"/>
        <aui:input name="Position"/>
        <aui:input name="Gender"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" onClick="<%= addEmployeeURL %>"/>
        <aui:button type="cancel" onClick="<%= backViewURL %>"/>
    </aui:button-row>

</aui:form>