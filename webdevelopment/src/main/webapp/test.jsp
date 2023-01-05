<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Signup</title>
</head>
<body>

<%
String id = request.getParameter("id");
String first_name = request.getParameter("first_name");
String last_name = request.getParameter("last_name");
String gender = request.getParameter("gender");
String email_address = request.getParameter("email_address");
String password = request.getParameter("password");

if (id !=null && first_name != null && email_address != null && password != null) {
  // Connect to the database
  Class.forName("com.mysql.jdbc.Driver");
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_tutorial_db", "root", "root@123");

  // Create an SQL INSERT statement
  String sql = "INSERT INTO sign_tbl (id, first_name, last_name, gender, email_address, password) VALUES (?, ?, ?, ?, ?, ?)";
  PreparedStatement statement = conn.prepareStatement(sql);
  statement.setString(1, id);
  statement.setString(2, first_name);
  statement.setString(3, last_name);
  statement.setString(4, gender);
  statement.setString(5, email_address);
  statement.setString(6, password);

  // Execute the statement
  int rowsInserted = statement.executeUpdate();
  if (rowsInserted > 0) {
    out.println("User information saved to database successfully!");
  } else {
    out.println("An error occurred while saving the user information to the database.");
  }

  // Close the connection
  conn.close();
}
%>

<form action="test.jsp" method="post">
  <label for="first_name">First Name:</label><br>
  <input type="text" id="first_name" name="first_name"><br>
  <label for="last_name">Last Name:</label><br>
  <input type="text" id="last_name" name="last_name"><br>
  <label for="gender">Gender:</label><br>
  <input type="text" id="gender" name="gender"><br>
  <label for="email_address">Email:</label><br>
  <input type="email" id="email_address" name="email_address"><br>
  <label for="password">Password:</label><br>
  <input type="password" id="password" name="password"><br><br><br>
  <input type="submit" value="Submit">
</form> 

</body>
</html>