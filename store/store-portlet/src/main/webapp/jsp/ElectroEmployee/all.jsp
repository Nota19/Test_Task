<%@include file="../init.jsp"%>

<portlet:renderURL var="addElectroEmployee">
    <portlet:param name="mvcPath" value="../jsp/ElectroEmployee/add.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= addElectroEmployee %>" value="Add new Electro-Employee"/>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%=ElectroEmployeeLocalServiceUtil.getElectroEmployees(serchContainer.getStart(), serchContainer.getEnd())%>"/>

    <liferay-ui:search-container-row
            className="ru.hmel.liferay.model.ElectroEmployee" modelVar="ElectroEmployee">
        <liferay-ui:search-container-column-jsp path="/jsp/ElectroEmployee/buttons/edit.jsp" align="left"/>
        <liferay-ui:search-container-column-text property="electro_employee_id" name="Electro-employee id"/>
        <liferay-ui:search-container-column-text property="etype" name="Etype"/>
        <liferay-ui:search-container-column-jsp path=""

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<aui:button-row cssClass="back">

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="../jsp/ElectroEmployee/menu.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>