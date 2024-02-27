<%@include file="../init.jsp"%>

<portlet:actionURL var="uploadURL" name="uploadDocument"/>
<b>Please Upload .csv file with Data (UTF-8) Employee/Purchase/Electronics</b>

<form action="<%=uploadURL%>" method="post" enctype="multipart/form-data">
    <input type="file" name="uploadedFile">
    <input type="Submit" name="Submit">
</form>

<portlet:actionURL var="uploadElectroTypeURL" name="uploadElectroType"/>
<b>Please Upload .csv file with Data (UTF-8) ElectroType</b>

<form action="<%=uploadElectroTypeURL%>" method="post" enctype="multipart/form-data">
    <input type="file" name="uploadedFileElectroType">
    <input type="Submit" name="Submit">
</form>

<portlet:actionURL var="uploadPurchaseTypeURL" name="uploadPurchaseType"/>
<b>Please Upload .csv file with Data (UTF-8) PurchaseType</b>

<form action="<%= uploadPurchaseTypeURL %>" method="post" enctype="multipart/form-data">
    <input type="file" name="uploadedFilePurchaseType">
    <input type="Submit" name="Submit">
</form>

<portlet:actionURL var="uploadPositionTypeURL" name="uploadPositionType"/>
<b>Please Upload .csv file with Data (UTF-8) PositionType</b>

<form action="<%= uploadPositionTypeURL %>" method="post" enctype="multipart/form-data">
    <input type="file" name="uploadedFilePositionType">
    <input type="Submit" name="Submit">
</form>

<portlet:actionURL var="uploadElectroEmployeeURL" name="uploadElectroEmployee"/>
<b>Please Upload .csv file with Data (UTF-8) ElectroEmployee</b>

<form action="<%= uploadElectroEmployeeURL %>" method="post" enctype="multipart/form-data">
    <input type="file" name="uploadedFiledElectroEmployee">
    <input type="Submit" name="Submit">
</form>


<portlet:renderURL var="backViewURL">
    <portlet:param name="mvcPath" value="/view.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= backViewURL %>" value="Back"/>