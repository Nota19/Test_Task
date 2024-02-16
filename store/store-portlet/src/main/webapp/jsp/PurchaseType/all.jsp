<%@include file="../init.jsp"%>

<portlet:renderURL var="addPurchaseType">
    <portlet:param name="mvcPath" value="../jsp/PurchaseType/add.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= addPurchaseType %>" value="Add new Purchase Type"/>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%=PurchaseTypeLocalServiceUtil.getPurchaseType(serchContainer.getStart(), serchContainer.getEnd())%>"/>

    <liferay-ui:search-container-row
            className="ru.hmel.liferay.model.PurchaseType" modelVar="Purchase Type">
        <liferay-ui:search-container-column-jsp path="/jsp/PurchaseType/buttons/edit.jsp" align="left"/>
        <liferay-ui:search-container-column-text property="purchase_type_id" name="Purchase type id"/>
        <liferay-ui:search-container-column-text property="name" name="Name"/>
        <liferay-ui:search-container-column-jsp path=""

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<aui:button-row cssClass="back">

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="../jsp/PurchaseType/menu.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>