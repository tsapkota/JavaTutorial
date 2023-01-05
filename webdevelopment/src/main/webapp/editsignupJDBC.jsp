<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<head>
<style>
body {
	background-color: powderblue;
}

.simple-banner {
	background: pink;
}

#signin_btn {
	padding: 9px;
	border-radius: 2em;
}

.primary {
	background-color: #5aa140;
	color: #fff;
	border-radius: 2em;
}

.btn-block {
	width: 50%;
}
</style>
<title>Update Signup</title>

</head>

<body class="container">
	<div id="simple-banner" class="simple-banner" style="width: 100%;">

	</div>
	<h2>Update User Signup</h2>
	<img alt="" height=180px;
		src="https://kunsmiller.dpsk12.org/wp-content/uploads/sites/133/Update.jpeg"
		style="position: relative;">


	<form action="updateJDBCServlet" method="post" >

		<input type="hidden" name="id" value="${signupdata.id}">
		<div>
			<br> <label><b>First Name </b></label> <br> <input
				class="btn-block" id="signin_btn" type="text" name="first_name"
				value="${signupdata.firstname}">
		</div>
		<div>
			<br> <label><b>Last Name </b></label> <br> <input
				class="btn-block" id="signin_btn" type="text" name="last_name"
				value="${signupdata.lastname}">
		</div>
		<div>
			<br> <label><b>Gender </b></label> <br> <select
				class="btn-block" id="signin_btn" name="gender">
				<!-- 					<option value = "" disabled selected> Select that Apply </option> -->
				<option ${signupdata.gender=='male'?'selected':''}>Male</option>
				<option ${signupdata.gender=='female'?'selected':''}>
					Female</option>
			</select>
		</div>

		<div>
			<br> <label><b>Email Address </b></label> <br> <input
				class="btn-block" id="signin_btn" type="email" name="email"
				value="${signupdata.email}" disabled="disabled">
		</div>

		<div>
			<label><b>Password</b></label> <br> <input class="btn-block"
				id="signin_btn" type="password" name="password"
				value="${signupdata.password}">
		</div>
		<br>
		<div>
			<button id="signin_btn" type="submit" data-style="expand-left"
				data-size="s" class="primary btn-block ladda-button">
				<span class="ladda-label">Update Record</span><span
					class="ladda-spinner"></span>
			</button>
		</div>
	</form>

</body>
</html>