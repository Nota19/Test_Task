<%@include file="../init.jsp"%>

<jsp:useBean id="currentPurchaseType" type="ru.hmel.liferay.model.PurchaseType" scope="request" />

<portlet:actionURL name="updatePurchaseType" var="updatePurchaseTypeURL" />
<aui:form action="<%= updatePurchaseTypeURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="purchase_type_id" value="<%=currentPurchaseType.getPurchase_type_id() %>" type="hidden" />
        <aui:input name="name" value="<%=currentPurchaseType.getName() %>" />
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>
    </aui:button-row>
</aui:form>