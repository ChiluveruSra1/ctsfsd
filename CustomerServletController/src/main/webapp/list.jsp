<%@page import="customerServlet.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<title>all customers</title>
</head>
<body>

	<table align="center" border="1">
		<tr>
			<td><h2>Customer</h2></td>
		</tr>
	</table>
	<ul>
		<li><a href="add_customer.html">Add Customer</a></li>
	</ul>

	<table class="table table-dark">
		<thead>
			<tr>
				<th scope="col">First Name</th>
				<th scope="col">Last Name</th>
				<th scope="col">Email</th>
				<th scope="col">Action</th>
			</tr>
		</thead>

		<c:forEach items="${customers}" var="customer1">
			<c:url var="updateUrl" value="FindIdServlet.do">
				<c:param name="customerId" value="${tempCustomer.id}" />
			</c:url>
			<tbody>
				<tr>
					<td>${customer1.firstName}</td>
					<td>${customer1.lastName}</td>
					<td>${customer1.email}</td>
					<td><a href="${updateUrl}">Update</a></td>
				</tr>
		</c:forEach>
		</tbody>

		<%-- <%

List<Customer> list=(List<Customer>)request.getAttribute("SUCCESS");

for(Customer c:list){%>

	<tbody>
    <tr>
      <td><%out.println(c.getFirstName()); %></td>
      <td><%out.println(c.getLastName()); %></td>
      <td><%out.println(c.getEmail()); %></td>
    </tr>
 
  </tbody>
<%}%> --%>





	</table>
</body>
</html>