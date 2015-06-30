<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@  page import="com.jronell.model.EventType" %>
<%@  page import="com.jronell.model.Status" %>
<jsp:include page="include/header.jsp" />

<%  pageContext.setAttribute("EventType", EventType.values()); %>
<%  pageContext.setAttribute("Status", Status.values()); %>

<form id="form1" name="form1" method="post"  class="pure-form" action="event">
  <p>&nbsp;</p>
  <p>
  

   <label>Event Status </label>
    <select name="status" id="status">
    <c:forEach var="entry" items="${Status}">
    	<option value="${entry}">${entry}</option>
	</c:forEach>
    </select>
  </p>
    <p>
   <label>Event Type </label>
     <select name="eventType" id="eventType">
    	<c:forEach var="entry" items="${EventType}">
		    <option value="${entry}" >${entry}</option>
		</c:forEach>
    </select>
  </p>
  <p>
    <label>Event Name </label><input type="text" name="name" id="name" />
  </p>
  <p>
     <label>Start Date  </label> <input type="text" name="eventDateStart" class="datepicker"  id="eventDateStart" />
  </p>
  <p>
    <label>End Date  </label>   <input type="text" name="eventDateEnd" class="datepicker"  id="eventDateEnd" />
  </p>
  <p>
    <label>Date Posted </label>   <input type="text" name="eventDatePosted" class="datepicker"  id="eventDatePosted" />
  </p>
  <p>&nbsp;</p>
 <button type="submit" class="pure-button pure-button-primary">Sign in</button>
  
</form>


<script>
	$( ".datepicker" ).datepicker();
</script>
<jsp:include page="include/footer.html" />
