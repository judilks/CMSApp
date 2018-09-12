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
			<h2>${param.msg}</h2>
		</div>

		<jsp:include page="./common/footer.jsp"></jsp:include>
	</div>

</body>
</html>