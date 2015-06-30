<jsp:include page="include/header.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%
		request.getAttribute("userprofile");
		request.getAttribute("userEvents");
	%>
	<script>
		$(function() {
			$("#tabs").tabs();
		});
	</script>

 <style scoped>

        .button-success,
        .button-error,
        .button-warning,
        .button-secondary {
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
            background: rgb(233,92,85); /* this is a light blue */
        }

    </style>

	<div id="tabs">
		<ul>
			<li><a href="#tabs-1">User Profile</a></li>
			<li><a href="#tabs-2">User Interest</a></li>
			<li><a href="#tabs-3">My upcoming events</a></li>
		</ul>
		<div id="tabs-1">
			<div>
				<ul>
					<li>${userprofile.firstName}</li>
					<li>${userprofile.lastName}</li>
					<li>${userprofile.middleName}</li>
				</ul>
			    <button class="button-secondary pure-button">Secondary Button</button>
				<button class="pure-button button-secondary">Secondary Button</button>
			</div>
		</div>
		<div id="tabs-2">
			<p>Morbi tincidunt, dui sit amet facilisis feugiat, odio metus
				gravida ante, ut pharetra massa metus id nunc. Duis scelerisque
				molestie turpis. Sed fringilla, massa eget luctus malesuada, metus
				eros molestie lectus, ut tempus eros massa ut dolor. Aenean aliquet
				fringilla sem. Suspendisse sed ligula in ligula suscipit aliquam.
				Praesent in eros vestibulum mi adipiscing adipiscing. Morbi
				facilisis. Curabitur ornare consequat nunc. Aenean vel metus. Ut
				posuere viverra nulla. Aliquam erat volutpat. Pellentesque
				convallis. Maecenas feugiat, tellus pellentesque pretium posuere,
				felis lorem euismod felis, eu ornare leo nisi vel felis. Mauris
				consectetur tortor et purus.</p>
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
	</div>



</body>
</html>