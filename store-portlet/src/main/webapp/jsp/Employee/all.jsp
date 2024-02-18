<%@include file="../init.jsp"%>

<portlet:renderURL var="addEmployee">
    <portlet:param name="mvcPath" value="../jsp/Employee/add.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= addEmployee %>" value="Add new Employee"/>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
        results="<%=EmployeeLocalServiceUtil.getEmployees(searchContainer.getStart(), searchContainer.getEnd())%>"/>

    <liferay-ui:search-container-row
            className="ru.hmel.liferay.model.Employee" modelVar="Employee">
        <liferay-ui:search-container-column-jsp path="/jsp/Employee/buttons/edit.jsp" align="left"/>
        <liferay-ui:search-container-column-text property="employee_id" name="Employee id"/>
        <liferay-ui:search-container-column-text property="lastname" name="Last name"/>
        <liferay-ui:search-container-column-text property="firstname" name="First name"/>
        <liferay-ui:search-container-column-text property="patronymic" name="Patronymic"/>
        <liferay-ui:search-container-column-text property="birthdate" name="Date of birth"/>
        <liferay-ui:search-container-column-text property="position" name="Position"/>
        <liferay-ui:search-container-column-text property="gender" name="Gender"/>
        <liferay-ui:search-container-column-jsp path=""/> //
        
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<aui:button-row cssClass="back">

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="../jsp/Employee/menu.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>