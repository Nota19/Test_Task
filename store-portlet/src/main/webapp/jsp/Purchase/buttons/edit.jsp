<%@include file="../../init.jsp"%>

<%
    ResultRow res= (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Purchase purchase = (Purchase) res.getObject();
    String purchaseID = String.valueOf(purchase.getPrimaryKey());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="getCurrentPurchase" var="getCurrentPurchaseURL">
        <portlet:param name="currentPurchaseID" value="<%= purchaseID %>" />
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%=getCurrentPurchaseURL %>" />
</liferay-ui:icon-menu>