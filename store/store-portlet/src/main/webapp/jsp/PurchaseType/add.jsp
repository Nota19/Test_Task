<%@include file="../init.jsp"%>

<portlet:renderURL var="addPurchaseTypeURL">
    <portlet:param name="mvcPath" value="../PurchaseType/all.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addPurchaseType" var="addPurchaseTypeURL"/>

<aui:form action="<%= addPurchaseTypeURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="purchase_type_id"/>
        <aui:input name="name"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= addPurchaseTypeURL %>"/>
    </aui:button-row>
</aui:form>