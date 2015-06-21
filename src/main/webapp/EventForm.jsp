<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form id="form1" name="form1" method="post" action="event">
  <p>&nbsp;</p>
  <p>
   <label>Event Status </label>
     <select name="status" id="status">
     <option value="ACTIVE"> Active </option>
    </select>
  </p>
    <p>
   <label>Event Type </label>
     <select name="eventType" id="status">
    	<option value="DIY">DIY </option>
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