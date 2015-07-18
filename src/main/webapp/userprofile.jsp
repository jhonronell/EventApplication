<jsp:include page="include/header.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script>
	$(function() {
		$("#tabs").tabs();

	
	});
</script>

<style scoped>
body {
	
}

.button-success, .button-error, .button-warning, .button-secondary {
	color: white;
	border-radius: 4px;
	text-shadow: 0 1px 1px rgba(0, 0, 0, 0.2);
}

.button-success {
	background: rgb(28, 184, 65); /* this is a green */
}

.button-error {
	background: rgb(202, 60, 60); /* this is a maroon */
}

.button-warning {
	background: rgb(223, 117, 20); /* this is an orange */
}

.button-secondary {
	background: rgb(233, 92, 85); /* this is a light blue */
}
</style>


<div class="wrapper">
	<div class="container">


		<jsp:include page="include/userInfoStandard.jsp" />
		<div id="tabs" class="userProfile" style="z-index: 10000 !important">
			<ul>
				<li><a href="#tabs-1">Bucket List</a></li>
				<li><a href="#tabs-2">User Interest</a></li>
				<li><a href="#tabs-3">My upcoming events</a></li>

			</ul>
			<div id="tabs-1">
				<div>
					<table class="pure-table pure-table-horizontal">
						<c:forEach var="bucketList" items="${user.bucketList}">
							<tr>
								<td><c:out value="${bucketList.name}" /></td>
								<td><c:out value="${bucketList.region}" /></td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
			<div id="tabs-2">
				<div id="addInterestForm" class="addInterestForm">
					<form class="pure-form pure-form-stacked" method="post"
						id="interestForm" name="interestForm" action="interest">
						<fieldset style="text-align: center">
							<input type="text" style="margin-right: auto; margin-left: auto"
								name="name" id="name" placeholder="Interest Name">
							<button class="button-secondary pure-button" type="submit">Submit</button>
							<button class="button-secondary pure-button" type="button"
								id="CancelBtn">Cancel</button>
						</fieldset>
					</form>
				</div>
				<div id="interestMainContent">
					<table class="pure-table pure-table-horizontal">
						<c:forEach var="interest" items="${user.interestList}">
							<tr>
								<td><c:out value="${interest.name}" /></td>
								<td><c:out value="${interest.name}" /></td>
							</tr>
						</c:forEach>
					</table>
					<button class="button-secondary pure-button" id="addInterestBtn">
						Add</button>
					<button class="pure-button button-secondary">Edit</button>
					<button class="pure-button button-secondary">Delete</button>
				</div>
			</div>
			<div id="tabs-3">
				<button class="button-secondary pure-button" id="addEventBtn">Add</button>
				<table class="pure-table pure-table-horizontal">
					<c:forEach var="event" items="${user.events}">
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
</div>





</body>
</html>
