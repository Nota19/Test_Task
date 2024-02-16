<%@include file="../init.jsp"%>

<aui:button-row cssClass="PurchaseType_menu">
    <portlet:renderURL var="printAllPurchaseType">
        <portlet:param name="mvcPath" value="../jsp/PurchaseType/all.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= printAllPurchaseType %>" value="Show All PurchaseType"/>

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="../view.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>