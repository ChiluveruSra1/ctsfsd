<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Confirmation</title>
</head>

<body>
	The student is confirmed:  ${student.lname}  ${student.fname}	<br><br>
	Country: ${student.country}	<br><br> 
	Favorite Language: ${student.favoriteLanguage}	<br><br>
	Operating Systems:

	<ul>
		<c:forEach var="temp" items="${student.os}">

			<li style="list-style-type:square; background-size:4cm; ; background-color: green;">${temp}</li>

		</c:forEach>
	</ul>

</body>

</html>






