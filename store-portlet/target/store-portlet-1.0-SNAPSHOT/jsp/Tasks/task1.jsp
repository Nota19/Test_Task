<%@include file="../init.jsp"%>

<portlet:defineObjects />
<%
    Employee employee = (Employee) request.getAttribute("bestEmployee");
    Long sum = (Long) request.getAttribute("bestEmployeeMax");
%>

<table>
    <tr>
        <td>ID</td>
        <td>LastName</td>
        <td>FirstName</td>
        <td>Patronymic</td>
        <td>Birthdate</td>
        <td>Position</td>
        <td>Gender</td>
        <td>MaxSales, rub</td>

    </tr>
    <tr>
        <td><%= employee.getEmployee_id() %></td>
        <td><%= employee.getLastname() %></td>
        <td><%= employee.getFirstname() %></td>
        <td><%= employee.getPatronymic() %></td>
        <td><%= employee.getBirthdate() %></td>
        <td><%= employee.getPosition() %></td>
        <td><%= employee.getGender() %></td>
        <td><%= sum/100 %></td>
    </tr>
</table>

<portlet:renderURL var="backViewURL">
    <portlet:param name="mvcPath" value="/jsp/Tasks/menu.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= backViewURL %>" value="Back"/>