<%@include file="/store/store-portlet/src/main/webapp/jsp/init.jsp"%>

<%
    ResultRow res= (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Purchase = (Purchase) res.getObject();
    String PurchaseID = String.valueOf(Purchase.getPrimaryKey());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="getCurrentPurchase" var="getCurrentPurchaseURL">
        <portlet:param name="currentPurchaseID" value="<%=PurchaseID%>"/>
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%=getCurrentPurchaseURL %>" />
</liferay-ui:icon-menu>