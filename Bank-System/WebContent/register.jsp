<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-12 d-flex justify-content-center align-items-center"
				style="height: 100vh">
				<form action="RegisterController" method="post">
					<div class="form-group">
						<label>Username</label> <input type="text" name="username"
							class="form-control" placeholder="username" required>
					</div>
					<div class="form-group">
						<label>Email address</label> <input type="email" name="email"
							class="form-control" aria-describedby="emailHelp"
							placeholder="Enter email">
					</div>
					<div class="form-group">
						<label>Password</label> <input type="password" name="password"
							class="form-control" placeholder="Password">
					</div>
					<div class="form-group">
						<label>Mobile</label> <input type="text" name="mobile"
							class="form-control" placeholder="Enter mobile number">
					</div>
						
					<div class="form-group">
						<label class="radio- inline"> 
							<input type="radio" name="gender" value="Male">Male 
						</label> 
						<label class="radio-inline"> 
							 <input type="radio" name="gender" value="Female">Female 
						</label>  
						
					</div>

					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>