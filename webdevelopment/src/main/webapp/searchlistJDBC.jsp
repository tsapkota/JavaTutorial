<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<%@page import="serverletpackage.SignupServlet"%>
<%@page import="serverletpackage.SignupData"%>
<%@page import="java.util.List"%>
<html>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Search Page</title>
</head>
<body>
	<section class="container">
		<img alt="" height=180px;
			src="https://keywordtool.io/images/svg/undraw_web_search_eetr.svg"
			style="position: relative;"> <br>

		<!-- 		<form action="searchData" method="get"> -->
		<!-- 			<label>Search Data</label> <input type="text" name="searchText" -->
		<!-- 				class="form-control" -->
		<!-- 				style="width: 50%; display: inline; margin-right: 10px;"> -->
		<!-- 			<button type="submit" class="btn btn-primary" -->
		<!-- 				style="margin-top: -4px">Go</button> -->
		<!-- 		</form> -->

		<br> <span
			style="color: red; font-size: 20px; font-weight: bold;">${message}</span>

		<br>
		<%
		//req.setAttribute("data", signuplist);
		List<SignupData> signuplist = (List<SignupData>) request.getAttribute("data");
		if (signuplist == null) {
			signuplist = new ArrayList<>();
		}
		if (signuplist.size() > 0) {
		%>
		<h4 style="color: green;">Search Results.</h4>
		<table class="table table-bordered" style="width: 100%">
			<thead>
				<tr style="background-color: maroon; color: white;">
					<th>ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Gender</th>
					<th>Email Address</th>
					<th>Password</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<%
				for (SignupData signup : signuplist) {
				%>
				<tr>
					<td><%=signup.getId()%></td>
					<td><%=signup.getFirstname()%></td>
					<td><%=signup.getLastname()%></td>
					<td><%=signup.getGender()%></td>
					<td><%=signup.getEmail()%></td>
					<td><%=signup.getPassword()%></td>
					<td><a style = "text-decoration:none;" href="deleteRow?id=<%=signup.getId()%>">
							<button type="button" class="btn btn-danger">Delete </button>
					</a>
					<a style = "color: white; text-decoration:none;" href="editRow?id=<%=signup.getId()%>">
							<button type="button" class="btn btn-warning">Edit </button>
					</a>
						</td>

					<!-- 				<td> -->
					<!-- 					<button type="button" class="btn btn-warning">DELETE</button> -->
					<!-- 				</td> -->
				</tr>
				<%
				}
				%>
			</tbody>

		</table>
		<%
		}
		%>
	</section>
</body>
</html>