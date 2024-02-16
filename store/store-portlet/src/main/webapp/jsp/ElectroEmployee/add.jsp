<%@include file="../init.jsp"%>

<portlet:renderURL var="addElectroEmployeeURL">
    <portlet:param name="mvcPath" value="../ElectroEmployee/all.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addElectroEmployee" var="addElectroEmployeeURL"/>

<aui:form action="<%= addElectroEmployeeURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="electro_employee_id"/>
        <aui:input name="etype"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= addElectroEmployeeURL %>"/>
    </aui:button-row>
</aui:form>