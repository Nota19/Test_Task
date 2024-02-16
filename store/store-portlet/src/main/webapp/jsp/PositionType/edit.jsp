<%@include file="../init.jsp"%>

<jsp:useBean id="currentPositionType" type="ru.hmel.liferay.model.PositionType" scope="request" />

<portlet:actionURL name="updatePositionType" var="updatePositionTypeURL" />
<aui:form action="<%= updatePositionTypeURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="position_id" value="<%=currentPositionType.getPosition_id() %>" />
        <aui:input name="name" value="<%=currentPositionType.getName() %>" />
    </aui:fieldset>
    <aui:button-row>
        <aui:button type="submit" value="Save"/>
    </aui:button-row>
</aui:form>