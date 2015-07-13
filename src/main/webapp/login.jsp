<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="include/header.jsp" />

    <div class="wrapper">
	<div class="container">
		
   <img src="images/small-1300-6439108.png">
    <div style="color:white">Enter Username and Password </div>
		<form action="authenticate" method="post">
			<input name="username" type="text" placeholder="username">
			<input name="password" type="password" placeholder="password">
			<button type="submit" id="login-button">Login</button>
		</form>
	</div>
	
	<ul class="bg-bubbles">
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
	</ul>
</div>

<jsp:include page="include/footer.html" />
