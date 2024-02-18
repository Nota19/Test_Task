<%@include file="../init.jsp"%>

<jsp:useBean id="currentEmployeeWithArchive" type="ru.hmel.model.Employee" scope="request" />

<liferay-ui:search-container>
    <liferay-ui:search-container-results
        results="<%= EmployeeLocalServiceUtil.getEmployeeArchive(currentEmployeeWithArchive.getEmployee_id())%>"/>

    <liferay-ui:search-container-row
            className="ru.hmel.liferay.model.Employee" modelVar="Employee">

        <liferay-ui:search-container-column-jsp path="../jsp/Employee/buttons/edit.jsp" align="left"/>
        <
    </liferay-ui:search-container-row>
</liferay-ui:search-container>