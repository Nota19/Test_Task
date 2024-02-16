<%@include file="/store/store-portlet/src/main/webapp/jsp/init.jsp"%>

<%
    ResultRow res= (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Employee = (Employee) res.getObject();
    String employeeID = String.valueOf(Employee.getPrimaryKey());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="getCurrentPositionType" var="getCurrentPositionTypeURL">
        <portlet:param name="currentPositionTypeID" value="<%=PositionTypeID%>"/>
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%=getCurrentPositionTypeURL %>" />
</liferay-ui:icon-menu>