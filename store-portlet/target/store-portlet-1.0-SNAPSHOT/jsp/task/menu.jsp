<%@include file="../init.jsp"%>

<aui:button-row cssClass="store_menu">
    <portlet:renderURL var="printBestEmployee">
        <portlet:param name="mvcPath" value="../jsp/Employee/all.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= printBestEmployee %>" value="Show best Employee"/>

    <portlet:renderURL var="printAmountOfMoney">
        <portlet:param name="mvcPath" value="../jsp/Electronics/all.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= printAmountOfMoney %>" value="Show amount of money"/>

    <portlet:renderURL var="printAllEmployee">
        <portlet:param name="mvcPath" value="../jsp/Employee/all.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= printAllEmployee %>" value="Show All Employee"/>
</aui:button-row>