<%@include file="/store/store-portlet/src/main/webapp/jsp/init.jsp"%>

<%
    ResultRow res= (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Employee = (Employee) res.getObject();
    String employeeID = String.valueOf(Employee.getPrimaryKey());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="getCurrentEmployee" var="getCurrentEmployeeURL">
        <portlet:param name="currentEmployeeID" value="<%=EmployeeID%>"/>
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%=getCurrentEmployeeURL %>" />
</liferay-ui:icon-menu>