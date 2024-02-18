<%@include file="../init.jsp"%>

<jsp:useBean id="currentElectronics" type="ru.hmel.liferay.model.Electronics" scope="request" />

<portlet:actionURL name="updateElectronics" var="updateElectronicsURL" />
<aui:form action="<%= updateElectronicsURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="electronics_id" value="<%=currentElectronics.getElectronics_id() %>" type="hidden" />
        <aui:input name="name" value="<%=currentElectronics.getName() %>" />
        <aui:input name="etype" value="<%=currentElectronics.getEtype() %>" />
        <aui:input name="price" value="<%=currentElectronics.getPrice() %>" />
        <aui:input name="count" value="<%=currentElectronics.getCount() %>" />
        <aui:input name="inStock" value="<%=currentElectronics.getInStock() %>" />
        <aui:input name="archive" value="<%=currentElectronics.getArchive() %>" />
        <aui:input name="description" value="<%=currentElectronics.getDescription%>" />
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>
    </aui:button-row>
</aui:form>