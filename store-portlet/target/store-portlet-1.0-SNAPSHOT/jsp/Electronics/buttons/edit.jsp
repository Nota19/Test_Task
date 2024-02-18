<%@include file="/store/store-portlet/src/main/webapp/jsp/init.jsp"%>

<%
    ResultRow res= (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Electronics = (Electronics.getObject();
    String ElectronicsID = String.valueOf(Electronics.getPrimaryKey());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="getCurrentElectronics" var="getCurrentElectronicsURL">
        <portlet:param name="currentElectronicsID" value="<%=ElectronicsID%>"/>
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%=getCurrentElectronicsURL %>" />
</liferay-ui:icon-menu>