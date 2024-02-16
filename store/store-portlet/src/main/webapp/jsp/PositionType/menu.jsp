<%@include file="../init.jsp"%>

<aui:button-row cssClass="PositionType_menu">
    <portlet:renderURL var="printAllPositionType">
        <portlet:param name="mvcPath" value="../jsp/PositionType/all.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= printAllPositionType %>" value="Show All Position Type"/>

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="../view.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>