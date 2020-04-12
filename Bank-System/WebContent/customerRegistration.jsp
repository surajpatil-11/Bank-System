<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

</head>
<body>


	<div class="container">
		<div class="row">
			<div class="col-12 d-flex justify-content-center align-items-center"
				style="height: 100vh">
				<form action="CustomerRegistrationController" method="post">
				  <div class="row">
					<div class="form-group">
						<label>First Name</label> <input type="text" name="firstName"
							class="form-control" placeholder="First Name" required>
					</div>
					<div class="form-group">
						<label>Middle Name</label> <input type="text" name="middleName"
							class="form-control" placeholder="Middle Name" required>
					</div>
					<div class="form-group">
						<label>Last Name</label> <input type="text" name="lastName"
							class="form-control" placeholder="Last Name" required>
					</div>
					
					<div class="form-group">
						<label class="radio- inline"> <input type="radio"
							name="gender" value="M">Male
						</label> <label class="radio-inline"> <input type="radio"
							name="gender" value="F">Female
						</label>
					</div>
					
					<div class="form-group">
						<label>House No.</label> <input type="text" name="houseNo"
							class="form-control" placeholder="House No." required>
					</div>
					<div class="form-group">
						<label>Street</label> <input type="text" name="street"
							class="form-control" placeholder="Street" required>
					</div>
					<div class="form-group">
						<label>City</label> <input type="text" name="city"
							class="form-control" placeholder="City" required>
					</div>
					<div class="form-group">
						<label>State</label> <input type="text" name="state"
							class="form-control" placeholder="state" required>
					</div>   
					<div class="form-group">
						<label>Country</label> <input type="text" name="country"
							class="form-control" placeholder="country" required>
					</div> 
					<div class="form-group">
						<label>Pincode</label> <input type="text" name="pincode"
							class="form-control" placeholder="Last Name" required>
					</div>
					<!--  
					// firstName middleName lastName gender houseNo street city state country pincode mobile dateOfBirth 
			        // occupation panNo aadharNo incomePerAnnum educationalQualification     -->
					<div class="form-group">
						<label>Mobile</label> <input type="text" name="mobile"
							class="form-control" placeholder="mobile" required>
					</div>
					<div class="form-group">
						<label>Date Of Birth</label> <input type="date" name="dateOfBirth"
							class="form-control" placeholder="DOB" required>
					</div>
					<div class="form-group">
						<label>Occupation</label> <input type="text" name="occupation"
							class="form-control" placeholder="Occupation" required>
					</div>
					<div class="form-group">
						<label>PAN No.</label> <input type="text" name="panNo"
							class="form-control" placeholder="PAN No." required>
					</div>
					<div class="form-group">
						<label>Aadhar No.</label> <input type="text" name="aadharNo"
							class="form-control" required>
					</div>
					<div class="form-group">
						<label>Income per annum</label> <input type="text" name="incomePerAnnum"
							class="form-control" required>
					</div>
					<div class="form-group">
						<label>Educational Qualification</label> <input type="text" name="educationalQualification"
							class="form-control" required>
					</div>
					
					
					


					<button type="submit" class="btn btn-primary">Submit</button>
					</div>
				</form>
			</div>
		</div>
	</div>


</body>




</html>