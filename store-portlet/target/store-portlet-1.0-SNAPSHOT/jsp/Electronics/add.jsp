<%@include file="../init.jsp"%>

<portlet:renderURL var="addElectronicsURL">
    <portlet:param name="mvcPath" value="/jsp/Electronics/all.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addElectronics" var="addElectronicsURL"/>

<aui:form action="<%= addElectronicsURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="electronics_id"/>
        <aui:input name="name"/>
        <aui:input name="etype"/>
        <aui:input name="price"/>
        <aui:input name="count"/>
        <aui:input name="inStock"/>
        <aui:input name="archive"/>
        <aui:input name="description"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= addElectronicsURL %>"/>
    </aui:button-row>
</aui:form>