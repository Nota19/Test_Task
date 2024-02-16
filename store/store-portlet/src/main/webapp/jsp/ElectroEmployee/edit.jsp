<%@include file="../init.jsp"%>

<jsp:useBean id="currentElectroEmployee" type="ru.hmel.liferay.model.ElectroEmployee" scope="request" />

<portlet:actionURL name="updateElectroEmployee" var="updateElectroEmployeeURL" />
<aui:form action="<%= updateElectroEmployeeURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="electro_employee_id" value="<%=currentElectroEmployee.getElectro_employee_id() %>" />
        <aui:input name="etype" value="<%=currentElectroEmployee.getEtype() %>" />
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>
    </aui:button-row>
</aui:form>