<%@ page import="customerServlet.*" %>
<%@ page isELIgnored="false" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Customer: Add</title>
</head>
<body>
	<form action="update_customer1.do" method="post">
	<input type="hidden" value="${customer.id}" name="id">
		First Name:<input type="text" name="fname"
			value="${customer.firstName}" required="required"><br /> Last
		Name:<input type="text" name="lname" value="${customer.laststName}"
			required="required"><br /> Email:<input type="email"
			name="email" value="${customer.email}" required="required"><br />
		<input type="submit" value="Update" class="save" />

	</form>
</body>
</html>