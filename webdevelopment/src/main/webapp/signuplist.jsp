<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<%@page import="serverletpackage.SignupServlet"%>
<%@page import="serverletpackage.SignupData"%>
<%@page import="java.util.List"%>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Signup List</title>
</head>
<body>
<section class = "container">
<h1 style = "color:red">${message}</h1>
	<img alt="" height=120px;
		src="https://t4.ftcdn.net/jpg/00/41/62/63/360_F_41626326_DUttBIktULxRKI1UNhw4K99RihABAk3E.jpg">
	<h2 style="color: green;">This is a signup list.</h2>
	<table class="table table-bordered" style="width: 100%">
	<thead>
		<tr style="background-color: maroon;color:white;">
			<th>First Name</th>
			<th>Last Name</th>
			<th>Gender</th>
			<th>Email Address</th>
			<th>Password</th>
		</tr>
</thead>
		<tbody>
			<%
			//req.setAttribute("ssita", signuplist);
			List<SignupData> signuplist = (List<SignupData>) request.getAttribute("data");
			if (signuplist == null) {
				signuplist = new ArrayList<>();
			}
			for (SignupData signup : signuplist) {
			%>
			<tr>
				<td><%=signup.getFirstname()%></td>
				<td><%=signup.getLastname()%></td>
				<td><%=signup.getGender()%></td>
				<td><%=signup.getEmail()%></td>
				<td><%=signup.getPassword()%></td>

<!-- 				<td> -->
<!-- 					<button type="button" class="btn btn-warning">DELETE</button> -->
<!-- 				</td> -->
			</tr>
			<%
			}
			%>
		</tbody>

	</table>
</section>
</body>
</html>