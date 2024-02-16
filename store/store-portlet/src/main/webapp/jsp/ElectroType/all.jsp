<%@include file="../init.jsp"%>

<portlet:renderURL var="addElectroType">
    <portlet:param name="mvcPath" value="../jsp/ElectroType/add.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= addElectroType %>" value="Add new Electro Type"/>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%=ElectroTypeLocalServiceUtil.getElectroType(serchContainer.getStart(), serchContainer.getEnd())%>"/>

    <liferay-ui:search-container-row
            className="ru.hmel.liferay.model.ElectroType" modelVar="ElectroType">
        <liferay-ui:search-container-column-jsp path="/jsp/ElectroType/buttons/edit.jsp" align="left"/>
        <liferay-ui:search-container-column-text property="electro_type_id" name="Electro type id"/>
        <liferay-ui:search-container-column-text property="name" name="Name"/>
        <liferay-ui:search-container-column-jsp path=""

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<aui:button-row cssClass="back">

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="../jsp/ElectroType/menu.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>