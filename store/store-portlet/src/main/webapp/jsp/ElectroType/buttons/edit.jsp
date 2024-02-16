<%@include file="/store/store-portlet/src/main/webapp/jsp/init.jsp"%>

<%
    ResultRow res= (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    ElectroType = (ElectroType) res.getObject();
    String ElectroTypeID = String.valueOf(ElectroType.getPrimaryKey());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="getCurrentElectroType" var="getCurrentElectroTypeURL">
        <portlet:param name="currentElectroTypeID" value="<%=ElectroTypeID%>"/>
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%=getCurrentElectroTypeURL %>" />
</liferay-ui:icon-menu>