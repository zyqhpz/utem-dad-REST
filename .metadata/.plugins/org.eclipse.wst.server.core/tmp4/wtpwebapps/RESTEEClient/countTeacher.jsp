<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="ftmk.ws.consumer.ProfessorFacade" %>
    
<%
    	ProfessorFacade professorFacade = new ProfessorFacade();

    	String result = professorFacade.getNumTeacher();
%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Count Hogwarts Teacher</title>
</head>
<body>

<h2>Number of teacher(s) in Hogwarts is <%= result %> </h2>

</body>
</html>