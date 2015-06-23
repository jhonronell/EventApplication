<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@  page import="com.jronell.model.EventType" %>
<%@  page import="com.jronell.model.Status" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<%  pageContext.setAttribute("EventType", EventType.values()); %>
<%  pageContext.setAttribute("Status", Status.values()); %>



<form id="form1" name="form1" method="post" action="event">
  <p>&nbsp;</p>
  <p>
  




   <label>Event Status </label>
    <select name="status" id="status">
    <c:forEach var="entry" items="${EventType}">
    	<option>${entry}</option>
	</c:forEach>
    </select>
  </p>
    <p>
   <label>Event Type </label>
     <select name="eventType" id="status">
    	<c:forEach var="entry" items="${Status}">
		    <option>${entry}</option>
		</c:forEach>
    </select>
  </p>
  <p>
    <label>Event Name </label><input type="text" name="name" id="textfield2" />
  </p>
  <p>
     <label>Start Date  </label> <input type="text" name="eventDateStart" id="textfield3" />
  </p>
  <p>
    <label>End Date  </label>   <input type="text" name="eventDateEnd" id="textfield4" />
  </p>
  <p>
    <label>Date Posted </label>   <input type="text" name="eventDatePosted" id="textfield5" />
  </p>
  <p>&nbsp;</p>
  <button type="submit"> Submit </button>
</form>
</body>
</html>