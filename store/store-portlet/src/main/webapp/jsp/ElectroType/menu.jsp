<%@include file="../init.jsp"%>

<aui:button-row cssClass="ElectroType_menu">
    <portlet:renderURL var="printAllElectroType">
        <portlet:param name="mvcPath" value="../jsp/ElectroType/all.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= printAllElectroType %>" value="Show All Electro Type"/>

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="../view.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>