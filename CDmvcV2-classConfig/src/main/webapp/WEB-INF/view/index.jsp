 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processLogin" modelAttribute="user">
Email: <form:input path="email"/><br/>
Password: <form:password path="password" /><br/>

Country: <form:select path="country">
<form:option value="India" label="India"/>
<form:option value="Italy" label="Italy"/>
<form:option value="Germany" label="Germany"/>
</form:select>

<input type="submit" value="login" />
</form:form>
<%-- <a href="${pageContext.request.contextPath}/cd/addCD">Add CD</a> --%>


 </body>

 </html>