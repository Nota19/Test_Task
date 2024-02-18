<%@include file="../init.jsp"%>

<portlet:renderURL var="addElectronics">
    <portlet:param name="mvcPath" value="../jsp/Electronics/add.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= addElectronics %>" value="Add new Electronics"/>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%=ElectronicsLocalServiceUtil.getElectronics(searchContainer.getStart(), searchContainer.getEnd())%>"/>

    <liferay-ui:search-container-row
            className="ru.hmel.liferay.model.Electronics" modelVar="Electronics">
        <liferay-ui:search-container-column-jsp path="/jsp/Electronics/buttons/edit.jsp" align="left"/>
        <liferay-ui:search-container-column-text property="electronics_id" name="Electronics id"/>
        <liferay-ui:search-container-column-text property="name" name="Name"/>
        <liferay-ui:search-container-column-text property="etype" name="etype"/>
        <liferay-ui:search-container-column-text property="price" name="Price"/>
        <liferay-ui:search-container-column-text property="count" name="Count"/>
        <liferay-ui:search-container-column-text property="inStock" name="In stock"/>
        <liferay-ui:search-container-column-text property="archive" name="Archive"/>
        <liferay-ui:search-container-column-text property="description" name="Description"/>
        <liferay-ui:search-container-column-jsp path=""

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<aui:button-row cssClass="back">

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="../jsp/Electronics/menu.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>