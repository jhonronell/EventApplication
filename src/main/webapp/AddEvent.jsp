<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@  page import="com.jronell.model.EventType" %>
<%@  page import="com.jronell.model.Status" %>
<jsp:include page="include/header.jsp" />

<%  pageContext.setAttribute("EventType", EventType.values()); %>
<%  pageContext.setAttribute("Status", Status.values()); %>

<% request.getAttribute("interestTypeList"); %>
<form id="form1" name="form1" method="post"  class="pure-form" action="event">
 
<div id="tabs">
		<ul>
			<li><a href="#tabs-1">Event Info</a></li>
			<li><a href="#tabs-2">Event Address</a></li>
			<li><a href="#tabs-3">Event Details</a></li>
			<li><a href="#tabs-4">Event Category</a></li>
		</ul>
		<div id="tabs-1">
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
			   <p>
			    <label>Description </label>   
			    <textarea name="description"> </textarea>
			    
			    
			  </p>
			  <p>&nbsp;</p>
			 <button type="submit" class="pure-button pure-button-primary">Next</button>
			  
						
		</div>
		<div id="tabs-2">
			

			  <table align="center">
			    <tr valign="baseline">
			      <td nowrap="nowrap" align="right">Street:</td>
			      <td><input type="text" name="street" value="" size="32" /></td>
			    </tr>
			    <tr valign="baseline">
			      <td nowrap="nowrap" align="right">Brgy:</td>
			      <td><input type="text" name="brgy" value="" size="32" /></td>
			    </tr>
			    <tr valign="baseline">
			      <td nowrap="nowrap" align="right">City:</td>
			      <td><input type="text" name="city" value="" size="32" /></td>
			    </tr>
			    <tr valign="baseline">
			      <td nowrap="nowrap" align="right">Town:</td>
			      <td><input type="text" name="town" value="" size="32" /></td>
			    </tr>
			    <tr valign="baseline">
			      <td nowrap="nowrap" align="right">Region:</td>
			      <td><input type="text" name="region" value="" size="32" /></td>
			    </tr>
			    <tr valign="baseline">
			      <td nowrap="nowrap" align="right">Province:</td>
			      <td><input type="text" name="province" value="" size="32" /></td>
			    </tr>
			    <tr valign="baseline">
			      <td nowrap="nowrap" align="right">Country:</td>
			      <td><input type="text" name="country" value="" size="32" /></td>
			    </tr>
			    <tr valign="baseline">
			      <td nowrap="nowrap" align="right">State:</td>
			      <td><input type="text" name="state" value="" size="32" /></td>
			    </tr>
			    <tr valign="baseline">
			      <td nowrap="nowrap" align="right">User_id:</td>
			      <td><input type="text" name="user_id" value="" size="32" /></td>
			    </tr>
			    <tr valign="baseline">
			      <td nowrap="nowrap" align="right">EventId:</td>
			      <td><input type="text" name="eventId" value="" size="32" /></td>
			    </tr>
			    <tr valign="baseline">
			      <td nowrap="nowrap" align="right">&nbsp;</td>
			      <td><input type="submit" value="Insert record" /></td>
			    </tr>
			  </table>
		</div>
		<div id="tabs-3">
			
		
				<table class="pure-table pure-table-horizontal">
					<c:forEach var="event" items="${userEvents}">
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
		</div>
		<div id="tabs-4">
			
		
				<table class="pure-table pure-table-horizontal">
					<c:forEach var="interest" items="${interestTypeList}">
						<tr>
							<td><c:out value="${interest.id}" /></td>
							<td><c:out value="${interest.name}" /></td>
						</tr>
					</c:forEach>
				</table>
		</div>
	</div>


</form>




	<script>
		$(function() {
			$("#tabs").tabs();
			
			$( ".datepicker" ).datepicker();
		});
	</script>
<jsp:include page="include/footer.html" />
