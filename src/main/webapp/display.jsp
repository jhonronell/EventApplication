<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello
<%@page import="com.jronell.model.Event"%>  
  
<p>You are successfully logged in!</p>  
<% 
Event event1=(Event) request.getAttribute("event1");  
out.print("Welcome, "+event1.getName());  
%> 

</body>
</html>
</body>
</html>