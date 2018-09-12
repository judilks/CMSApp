<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
<style>
#container {
	border: 1px solid black;
	width: 900px;
	margin: 0 auto;
}

#header {
	border: 1px solid red;
	height: 120px;
	margin: 5px;
}

#navigation {
	border: 1px solid green;
	height: 20px;
	margin: 3px;
}

#main {
	border: 1px solid blue;
	height: 400px;
	margin: 5px;
}

#footer {
	border: 1px solid blue;
	height: 20px;
	margin: 5px;
	padding: 10px
}
</style>
</head>
<body>

	<div id="container">
		
		<jsp:include page="./common/header.jsp"></jsp:include>

		<div id="main">
			<h2>User Registration Form</h2>
			<form action="UserRegistrationController" method="post">
				<table border="1">
					<tr>
						<td><lable for="firstname">First Name</lable></td>
						<td><input type="text" name="firstname" required/></td>
					</tr>
					<tr>
						<td><lable for="lastname">Last Name</lable></td>
						<td><input type="text" name="lastname" required/></td>
					</tr>
					<tr>
						<td><lable for="loginname">Login Name</lable></td>
						<td><input type="text" name="loginname" required/></td>
					</tr>
					<tr>
						<td><lable for="password">Password</lable></td>
						<td><input type="password" name="password" required/></td>
					</tr>
					<tr>
						
						<td colspan="2" style="text-align: right"><button type="submit">Register</button></td>
					</tr>
				</table>
			</form>
		</div>

		<jsp:include page="./common/footer.jsp"></jsp:include>
	</div>

</body>
</html>