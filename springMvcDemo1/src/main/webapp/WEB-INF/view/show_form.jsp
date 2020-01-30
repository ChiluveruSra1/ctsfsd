<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC page1</title>
</head>
<body>
<h3>Form</h3>

<form action="processForm" method="post">
Student Name:<input type="text" name="sName" required="required"><br/>
<input type="submit" value="Add Student"/>
</form>
</body>
</html>