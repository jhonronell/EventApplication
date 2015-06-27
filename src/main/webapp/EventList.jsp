<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@  page import="com.jronell.dao.impl.EventDaoImpl" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
   request.getAttribute("eventList");  
%>
	<table>
		<c:forEach var="event" items="${eventList}">
			<tr>
				<td><c:out value="${event.type}" /></td>
				<td><c:out value="${event.name}" /></td>
				<td><c:out value="${event.eventStartDate}" /></td>
				<td><c:out value="${event.eventEndDate}" /></td>
				<td><c:out value="${event.eventStartDate}" /></td>
				<td><c:out value="${event.status}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>