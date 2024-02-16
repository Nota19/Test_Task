<%@include file="/store/store-portlet/src/main/webapp/jsp/init.jsp"%>

<%
    ResultRow res= (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    PurchaseType = (PurchaseType) res.getObject();
    String PurchaseTypeID = String.valueOf(PurchaseType.getPrimaryKey());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="getCurrentPurchaseType" var="getCurrentPurchaseTypeURL">
        <portlet:param name="currentPurchaseTypeID" value="<%=PurchaseTypeID%>"/>
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%=getCurrentPurchaseTypeURL %>" />
</liferay-ui:icon-menu>