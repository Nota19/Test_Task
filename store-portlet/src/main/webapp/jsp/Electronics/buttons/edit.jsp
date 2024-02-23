<%@include file="../../init.jsp"%>

<%
    ResultRow res= (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Electronics electronics = (Electronics) res.getObject();
    String electronicsID = String.valueOf(electronics.getPrimaryKey());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="getCurrentElectronics" var="getCurrentElectronicsURL">
        <portlet:param name="currentElectronicsID" value="<%= electronicsID %>" />
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%=getCurrentElectronicsURL %>" />
</liferay-ui:icon-menu>