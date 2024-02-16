<%@include file="../init.jsp"%>

<jsp:useBean id="currentPurchase" type="ru.hmel.liferay.model.Purchase" scope="request" />

<portlet:actionURL name="updatePurchase" var="updatePurchaseURL" />
<aui:form action="<%= updatePurchaseURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="purchase_id" value="<%=currentPurchase.getPurchase_id() %>" type="hidden" />
        <aui:input name="electro_id" value="<%=currentPurchase.getElectro_id() %>" />
        <aui:input name="employee_id" value="<%=currentPurchase.getEmployee_id() %>" />
        <aui:input name="purchaseDate" value="<%=currentPurchase.getPurchaseDate() %>" />
        <aui:input name="type" value="<%=currentPurchase.getType() %>" />
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>
    </aui:button-row>
</aui:form>