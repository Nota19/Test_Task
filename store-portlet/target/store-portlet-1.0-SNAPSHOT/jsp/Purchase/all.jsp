<%@include file="../init.jsp"%>

<portlet:renderURL var="addPurchase">
    <portlet:param name="mvcPath" value="../jsp/Purchase/add.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= addPurchase %>" value="Add new Purchase"/>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%=PurchaseLocalServiceUtil.getPurchase(serchContainer.getStart(), serchContainer.getEnd())%>"/>

    <liferay-ui:search-container-row
            className="ru.hmel.liferay.model.Purchase" modelVar="Purchase">
        <liferay-ui:search-container-column-jsp path="/jsp/Purchase/buttons/edit.jsp" align="left"/>
        <liferay-ui:search-container-column-text property="purchase_id" name="Purchase id"/>
        <liferay-ui:search-container-column-text property="electro_id" name="Electro id"/>
        <liferay-ui:search-container-column-text property="employee_id" name="Employee id"/>
        <liferay-ui:search-container-column-text property="purchaseDate" name="Purchase Date"/>
        <liferay-ui:search-container-column-text property="type" name="Type"/>
        <liferay-ui:search-container-column-jsp path=""

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<aui:button-row cssClass="back">

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="../jsp/Purchase/menu.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>