<%@include file="../init.jsp"%>

<jsp:useBean id="currentPurchase" type="ru.hmel.model.Purchase" scope="request" />

<portlet:actionURL name="updatePurchase" var="updatePurchaseURL" />
<aui:form action="<%= updatePurchaseURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="Purchase id" value="<%=currentPurchase.getPurchase_id() %>" type="hidden" />
        <aui:input name="Electro id" value="<%=currentPurchase.getElectro_id() %>" />
        <aui:input name="Employee id" value="<%=currentPurchase.getEmployee_id() %>" />
        <aui:input name="Purchase Date" value="<%=currentPurchase.getPurchaseDate() %>" />
        <aui:input name="Type" value="<%=currentPurchase.getType() %>" />
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>
    </aui:button-row>
</aui:form>