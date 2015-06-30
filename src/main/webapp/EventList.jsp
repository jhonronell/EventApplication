<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@  page import="com.jronell.dao.impl.EventDaoImpl"%>
<%@  page import="com.jronell.model.Event"%>
<%@  page import="com.jronell.model.EventList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
   		request.getAttribute("eventListResult");  
	%>
	<table>
		<c:forEach var="eventList" items="${eventListResult}">
			<tr>
				<td><c:out value="${eventList.type}" /></td>
				<td><c:out value="${eventList.name}" /></td>
				<td><c:out value="${eventList.eventStartDate}" /></td>
				<td><c:out value="${eventList.eventEndDate}" /></td>
				<td><c:out value="${eventList.eventStartDate}" /></td>
				<td><c:out value="${eventList.status}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>