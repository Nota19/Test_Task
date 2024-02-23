<%@include file="../init.jsp"%>

<jsp:useBean id="currentElectronics" type="ru.hmel.model.Electronics" scope="request" />

<portlet:actionURL name="updateElectronics" var="updateElectronicsURL" />
<aui:form action="<%= updateElectronicsURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="Electronics id" value="<%=currentElectronics.getElectronics_id() %>" type="hidden" />
        <aui:input name="Name" value="<%=currentElectronics.getName() %>" />
        <aui:input name="Etype" value="<%=currentElectronics.getEtype() %>" />
        <aui:input name="Price" value="<%=currentElectronics.getPrice() %>" />
        <aui:input name="Count" value="<%=currentElectronics.getCount() %>" />
        <aui:input name="inStock" value="<%=currentElectronics.getInStock() %>" />
        <aui:input name="Archive" value="<%=currentElectronics.getArchive() %>" />
        <aui:input name="Description" value="<%=currentElectronics.getDescription()%>" />
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>
    </aui:button-row>
</aui:form>