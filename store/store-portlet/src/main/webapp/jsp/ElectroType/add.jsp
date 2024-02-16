<%@include file="../init.jsp"%>

<portlet:renderURL var="addElectroTypeURL">
    <portlet:param name="mvcPath" value="../ElectroType/all.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addElectroType" var="addElectroTypeURL"/>

<aui:form action="<%= addElectroTypeURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="electro_type_id"/>
        <aui:input name="name"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= addElectroTypeURL %>"/>
    </aui:button-row>
</aui:form>