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
<title>Signup</title>

</head>

<body  class = "container">
	<div id="simple-banner" class="simple-banner" style="width: 100%;">
		
	</div>
	<h2>User Signup</h2>
	<img alt="" height=120px; src="https://t4.ftcdn.net/jpg/00/41/62/63/360_F_41626326_DUttBIktULxRKI1UNhw4K99RihABAk3E.jpg" style = "position:relative;">


	<form name = "loginForm" method = "post" action = "signupJDBCServlet">

<div>
				<br> <label><b>First Name </b></label> <br> <input class = "btn-block" id = "signin_btn" type="text"
					name="first_name">
			</div>
			<div>
				<br> <label><b>Last Name </b></label> <br> <input class = "btn-block" id = "signin_btn" type="text"
					name="last_name">
			</div>
			<div>
				<br> <label><b>Gender </b></label> <br> <select class = "btn-block" id = "signin_btn" type="text"
					name="gender">
					<option value = "" disabled selected> Select that Apply </option>
					<option value = "male"> Male </option>
					<option value = "female"> Female </option>
					</select>
			</div>

			<div>
				<br> <label><b>Email Address </b></label> <br> <input class = "btn-block" id = "signin_btn" type="email"
					name="email">
			</div>

			<div>
				<label><b>Password</b></label> <br> <input class = "btn-block" id = "signin_btn" type="password"
					name="password">
			</div>
			<br>
			<div>
				<button id="signin_btn" type="submit" data-style="expand-left"
					data-size="s" class="primary btn-block ladda-button">
					<span class="ladda-label">Sign Up</span><span class="ladda-spinner"></span>
				</button>
			</div>
	</form>

</body>
</html>