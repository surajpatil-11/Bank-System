<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-12 d-flex justify-content-center align-items-center"
				style="height: 100vh">
				<form action="RegisterController" method="post">
					<div class="form-group">
						<label>Username</label> <input type="text" name="username" class="form-control" placeholder="username">
					</div>
					<div class="form-group">
						<label >Email address</label> <input type="email" name="email" class="form-control" aria-describedby="emailHelp" placeholder="Enter email"> 
					</div>
					<div class="form-group">
						<label>Password</label> <input type="password" name="password" class="form-control" placeholder="Password">
					</div>
					<div class="form-group">
						<label>Mobile</label> <input type="text" name="mobile" class="form-control" placeholder="Enter mobile number">
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>