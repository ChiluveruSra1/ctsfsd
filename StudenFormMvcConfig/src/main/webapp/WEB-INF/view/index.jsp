<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
	<h2>Hello World!</h2>
</body>

<form:form action="studentLogin" modelAttribute="student">
First Name: <form:input path="fname" /><form:errors path="fname"></form:errors><br />
Last Name: <form:input path="lname" /><form:errors path="fname"></form:errors><br />

Country: 
<form:select path="country">
			<form:options items="${student.countries}" />
</form:select>
<br><br>
Favorite Language: 
<form:radiobutton path="favoriteLanguage" value="Java"/>Java
<form:radiobutton path="favoriteLanguage" value="C#"/>C#
<form:radiobutton path="favoriteLanguage" value="PHP"/>PHP
<form:radiobutton path="favoriteLanguage" value="Python"/>Python
<form:radiobutton path="favoriteLanguage" value="Swift"/>Swift
<br><br>

Operating Systems: 
<form:checkbox path="os" value="Linux OS"/>Linux OS
<form:checkbox path="os" value="Mac OS"/>Mac OS
<form:checkbox path="os" value="Windows OS"/>Windows OS
<form:checkbox path="os" value="Dos OS"/>Dos OS
<br><br>
	<input type="submit" value="login" />
</form:form>
</html>
