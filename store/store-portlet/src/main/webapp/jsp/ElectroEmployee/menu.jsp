<%@include file="../init.jsp"%>

<aui:button-row cssClass="ElectroEmployee_menu">
    <portlet:renderURL var="printAllElectroEmployee">
        <portlet:param name="mvcPath" value="../jsp/ElectroEmployee/all.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= printAllElectroEmployee %>" value="Show All Electro-Employee"/>

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="../view.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>