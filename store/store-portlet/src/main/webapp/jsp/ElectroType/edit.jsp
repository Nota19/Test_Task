<%@include file="../init.jsp"%>

<jsp:useBean id="currentElectroType" type="ru.hmel.liferay.model.ElectroType" scope="request" />

<portlet:actionURL name="updateElectroType" var="updateElectroTypeURL" />
<aui:form action="<%= updateElectroTypeURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="electro_type_id" value="<%=currentElectroType.getElectro_type_id() %>" />
        <aui:input name="name" value="<%=currentElectroType.getName() %>" />
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>
    </aui:button-row>
</aui:form>