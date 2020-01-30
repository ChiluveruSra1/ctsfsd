<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC page1</title>
</head>
<body>
<h3>CD added successfully</h3>

CD Title: ${cd.title}</br>
CD Type: ${cd.type}</br>
Date: ${cd.date}</br>
<a href="${pageContext.request.contextPath}/">home</a>
</form>
</body>
</html>