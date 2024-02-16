<%@include file="/store/store-portlet/src/main/webapp/jsp/init.jsp"%>

<%
    ResultRow res= (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    ElectroEmployee = (ElectroEmployee) res.getObject();
    String ElectroEmployeeID = String.valueOf(ElectroEmployee.getPrimaryKey());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="getCurrentElectroEmployee" var="getCurrentElectroEmployeeURL">
        <portlet:param name="currentElectroEmployeeID" value="<%=ElectroEmployeeID%>"/>
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%=getCurrentElectroEmployeeURL %>" />
</liferay-ui:icon-menu>