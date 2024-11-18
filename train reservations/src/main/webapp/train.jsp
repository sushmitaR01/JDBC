<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>x-workz</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style type="text/css">
body {
	display: flex;
	justify-content: center;
	align-items: center;
	min-height: 100vh;
	background-color: white;
	border-color: black;
}

</style>
</head>
<body>
<h3 style="color:green">${success}</h3>
<h3 style="color:red">${failure}</h3>
	<form action="send" method="post">
		<h1>Train Ticket Booking</h1>

		<label>Name</label><br> <input type="text" name="name" id="name"
			required="required"><br> <label>Age</label><br> <input
			type="number" name="age" id="age" required="required"><br>


		<label>Phone number</label><br> <input type="number"
			name="number" id="phone" required="required"><br> <label>address</label><br>
		<input type="text" name="addr" id="add" required="required"><br>


		<label>email</label><br> <input type="email" name="email"
			id="email" required="required"><br> <br> <input
			type="submit" value="send" style="background-color: blue">


	</form>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


</body>
</html>