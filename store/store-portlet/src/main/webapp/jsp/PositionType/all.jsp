<%@include file="../init.jsp"%>

<portlet:renderURL var="addPositionType">
    <portlet:param name="mvcPath" value="../jsp/PositionType/add.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= addPositionType %>" value="Add new Position Type"/>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%=PositionTypeLocalServiceUtil.getPositionType(serchContainer.getStart(), serchContainer.getEnd())%>"/>

    <liferay-ui:search-container-row
            className="ru.hmel.liferay.model.PositionType" modelVar="Position Type">
        <liferay-ui:search-container-column-jsp path="/jsp/PositionType/buttons/edit.jsp" align="left"/>
        <liferay-ui:search-container-column-text property="position_id" name="Position id"/>
        <liferay-ui:search-container-column-text property="name" name="Name"/>
        <liferay-ui:search-container-column-jsp path=""

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<aui:button-row cssClass="back">

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="../jsp/PositionType/menu.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>