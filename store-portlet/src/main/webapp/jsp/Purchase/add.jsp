<%@include file="../init.jsp"%>

<portlet:renderURL var="addPurchaseURL">
    <portlet:param name="mvcPath" value="/jsp/Purchase/all.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addPurchase" var="addPurchaseURL"/>

<portlet:renderURL var="backViewURL">
    <portlet:param name="mvcPath" value="/jsp/Purchase/all.jsp"/>
</portlet:renderURL>

<aui:form action="<%= addPurchaseURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="Electro id"/>
        <aui:input name="Employee id"/>
        <aui:input name="Purchase Date"/>
        <aui:input name="Type"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" onClick="<%= addPurchaseURL %>"/>
        <aui:button type="cancel" onClick="<%= backViewURL %>"/>
    </aui:button-row>
</aui:form>