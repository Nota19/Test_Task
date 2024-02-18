<%@include file="../init.jsp"%>

<aui:button-row cssClass="Electronics_menu">
    <portlet:renderURL var="printAllElectronics">
        <portlet:param name="mvcPath" value="../jsp/Electronics/all.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= printAllElectronics %>" value="Show All Electronics"/>

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="../view.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>