<%@include file="../init.jsp"%>

<portlet:renderURL var="addPurchaseURL">
    <portlet:param name="mvcPath" value="/jsp/Purchase/all.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addPurchase" var="addPurchaseURL"/>

<aui:form action="<%= addPurchaseURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="purchase_id"/>
        <aui:input name="electro_id"/>
        <aui:input name="employee_id"/>
        <aui:input name="purchaseDate"/>
        <aui:input name="type"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= addPurchaseURL %>"/>
    </aui:button-row>
</aui:form>