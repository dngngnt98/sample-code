<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<section>
				<h1 class="entry-title">
					<span>Sign Up</span>
				</h1>
				<hr>
				<form class="form-horizontal" method="post" name="signup"
					id="signup">
					<div class="form-group">
						<label class="control-label col-sm-3">Email ID <span
							class="text-danger">*</span></label>
						<div class="col-md-8 col-sm-9">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-envelope"></i></span> <input type="email"
									class="form-control" name="adminMail" id="adminMail"
									placeholder="Enter your Email ID">
							</div>
							<small> Your Email Id is being used for ensuring the
								security of your account, authorization and access recovery. </small>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">Set Password <span
							class="text-danger">*</span></label>
						<div class="col-md-5 col-sm-8">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-lock"></i></span> <input type="password"
									class="form-control" name="adminPassword" id="adminPassword"
									placeholder="Only English and Number">
							</div>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">Confirm Password <span
							class="text-danger">*</span></label>
						<div class="col-md-5 col-sm-8">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-lock"></i></span> <input type="password"
									class="form-control" name="confirmPassword" id="confirmPassword"
									placeholder="Confirm your password">
							</div>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">Full Name <span
							class="text-danger">*</span></label>
						<div class="col-md-8 col-sm-9">
							<input type="text" class="form-control" name="adminName"
								id="adminName" placeholder="Enter your Name here">
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-offset-3 col-xs-10">
							<input name="Submit" type="submit" value="Sign Up"
								class="btn btn-primary">
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>