<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Professor Name</title>
</head>
<body>

<br><br>
Enter a surname of professor that you want to search.
<br><br>
<form action="searchTeacherServlet" method="GET">

Name: <input type="text" name="surname">

<input type="submit" value="Search">

</form>

</body>
</html>