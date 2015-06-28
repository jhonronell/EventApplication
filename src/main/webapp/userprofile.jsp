<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@  page import="com.jronell.dao.impl.UserDaoImpl" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
   request.getAttribute("userprofile");  
%>

	<div>
		<ul>
			<li>${userprofile.firstName}</li>
			<li>${userprofile.lastName}</li>
			<li>${userprofile.middleName}</li>
			<li></li>
			<li></li>
		</ul>
	</div>
</body>
</html>