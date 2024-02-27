<%@include file="../init.jsp"%>

<portlet:actionURL var="uploadURL" name="uploadDocument"/>
<b>Please Upload .csv file with Data</b>

<form action="<%=uploadURL%>" method="post" enctype="multipart/form-data">
    <input type="file" name="uploadedFile">
    <input type="Submit" name="Submit">
</form>
