<%@include file="../init.jsp"%>

<portlet:defineObjects />
<%
    Long sum = (Long) request.getAttribute("amountMoney");
%>


<table>
    <tr>
        <td>Total sales, rub</td>
    </tr>
    <tr>
        <td><%=  sum/100 %></td>
    </tr>
</table>

<portlet:renderURL var="backViewURL">
    <portlet:param name="mvcPath" value="/jsp/Tasks/menu.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= backViewURL %>" value="Back"/>