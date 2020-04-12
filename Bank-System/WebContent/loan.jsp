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


<!--private int accountNo ;
	private float amount ;
	private String issuedBy ;
	private String date ;
	private float interest ; -->



	<div class="container">
		<div class="row">
			<div class="col-12 d-flex justify-content-center align-items-center"
				style="height: 100vh">
				<form action="LoanController" method="post">
				  <div class="row">
					<div class="form-group">
						<label>Account No.</label> <input type="text" name="accountNo"
							class="form-control" placeholder="First Name" required>
					</div>
					<div class="form-group">
						<label>Amount</label> <input type="text" name="amount"
							class="form-control" placeholder="Middle Name" required>
					</div>
					<div class="form-group">
						<label>Issued By</label> <input type="text" name="issuedBy"
							class="form-control" placeholder="Last Name" required>
					</div>
					<div class="form-group">
						<label>Date</label> <input type="date" name="date"
							class="form-control" placeholder="DOB" required>
					</div>
					<div class="form-group">
						<label>Interest</label> <input type="text" name="interest"
							class="form-control" placeholder="Last Name" required>
					</div>
					
					
					
					


					<button type="submit" class="btn btn-primary">Submit</button>
					</div>
				</form>
			</div>
		</div>
	</div>


</body>




</html>