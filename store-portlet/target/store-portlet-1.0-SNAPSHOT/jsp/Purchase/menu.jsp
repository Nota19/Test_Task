<%@include file="../init.jsp"%>

<aui:button-row cssClass="Purchase_menu">
    <portlet:renderURL var="printAllPurchase">
        <portlet:param name="mvcPath" value="../jsp/Purchase/all.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= printAllPurchase %>" value="Show All Purchase"/>

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="../view.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>