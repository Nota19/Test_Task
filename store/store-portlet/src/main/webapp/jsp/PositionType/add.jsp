<%@include file="../init.jsp"%>

<portlet:renderURL var="addPositionTypeURL">
    <portlet:param name="mvcPath" value="../PositionType/all.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addPositionType" var="addPositionTypeURL"/>

<aui:form action="<%= addPositionTypeURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="position_id"/>
        <aui:input name="name"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= addPositionTypeURL %>"/>
    </aui:button-row>
</aui:form>