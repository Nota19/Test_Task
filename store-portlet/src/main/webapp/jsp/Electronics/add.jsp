<%@include file="../init.jsp"%>

<portlet:renderURL var="addElectronicsURL">
    <portlet:param name="mvcPath" value="/jsp/Electronics/all.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addElectronics" var="addElectronicsURL"/>

<portlet:renderURL var="backViewURL">
    <portlet:param name="mvcPath" value="/jsp/Electronics/all.jsp"/>
</portlet:renderURL>

<aui:form action="<%= addElectronicsURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="Name"/>
        <aui:input name="Etype"/>
        <aui:input name="Price"/>
        <aui:input name="Count"/>
        <aui:input name="InStock"/>
        <aui:input name="Archive"/>
        <aui:input name="Description"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" onClick="<%= addElectronicsURL %>"/>
        <aui:button type="cancel" onClick="<%= backViewURL %>"/>
    </aui:button-row>
</aui:form>