<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/assets/css/main.css" />

<!-- Favicon and touch icons -->
<link rel="icon" href="${pageContext.servletContext.contextPath}/resources/ico/home_iot.png">
<style>
.modal-dialog {
	position: relative width:600px;
	margin: 45px auto;
}

.pb-modalreglog-input-group {
	margin: auto;
}

.pb-modalreglog-submit {
	margin-left: 5px;
}

.pb-modalreglog-form-reg {
	text-align: center;
}

.pb-modalreglog-footer p {
	text-align: center;
	margin-top: 20px;
}

@media ( min-width : 768px) .modal-sm {
	width
	:
	 
	400
	px
	;
	
        
}

@media ( min-width : 768px) .modal-dialog {
	margin
	:
	 
	80
	px
	 
	auto
	;
	
        
}

.modal-footer .btn+.btn {
	margin-bottom: 0;
	margin: auto;
}
</style>

</head>

<body class="subpage">

	<!-- Header -->
	<header id="header">
	<div class="logo">
		<a href="index.html">Donny <span>by TEMPLATED</span></a>
	</div>
	<a href="#menu">Menu</a> </header>

	<!-- Nav -->
	<nav id="menu">
	<ul class="links">
		<li><a href="index.html">메인</a></li>
		<li><a href="loginmain.html">로그인</a></li>
		<li><a href="mypage.html">마이페이지</a></li>
		<li><a href="store_management.html">매장관리</a></li>
		<li><a href="elements.html">빅데이터</a></li>
		<li><a href="noticeboard.html">게시판</a></li>
		<li><a href="index_admin.html">Admin Only</a></li>
	</ul>
	</nav>

	<div class="container">
		<div class="row">
			<div class="col-xs-12 col-md-4 col-md-offset-4">

				<div class="modal fade" id="myModal2" tabindex="-1" role="dialog"
					aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog modal-sm" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<h4 class="modal-title" id="myModalLabel">회원가입 정보입력</h4>
							</div>
							<div class="modal-body">
								<form class="pb-modalreglog-form-reg">

									<div class="form-group">
										<label for="email">Email address</label>
										<div class="input-group pb-modalreglog-input-group">
											<span class="input-group-addon"><span
												class="glyphicon glyphicon-inbox"></span></span> <input
												type="email" class="form-control" id="inputEmail"
												placeholder="Email 주소가 ID가 됩니다">
										</div>
									</div>
									<div class="form-group">
										<label for="username">User name</label>
										<div class="input-group pb-modalreglog-input-group">
											<span class="input-group-addon"><span
												class="glyphicon glyphicon-user"></span></span> <input type="text"
												class="form-control" id="inputName"
												placeholder="성함을 입력해 주세요">
										</div>
									</div>
									<div class="form-group">
										<label for="password">Password</label>
										<div class="input-group pb-modalreglog-input-group">
											<span class="input-group-addon"><span
												class="glyphicon glyphicon-lock"></span></span> <input
												type="password" class="form-control" id="inputPws"
												placeholder="사용하고싶은 패스워드 입력">
										</div>
									</div>
									<div class="form-group">
										<label for="confirmpassword">Confirm password</label>
										<div class="input-group pb-modalreglog-input-group">
											<span class="input-group-addon"><span
												class="glyphicon glyphicon-lock"></span></span> <input
												type="password" class="form-control" id="inputConfirmPws"
												placeholder="패스워드 재입력">
										</div>
									</div>
									<div class="form-group">
										<label for="mobilephone">Mobile phone</label>
										<div class="input-group pb-modalreglog-input-group">
											<span class="input-group-addon"><span
												class="glyphicon glyphicon-phone"></span></span> <input type="text"
												class="form-control" id="inputPhone" placeholder="개인 연락처 입력">
										</div>
									</div>


								</form>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-secondary"
									data-dismiss="modal">닫기</button>
								<button type="button" class="btn btn-primary">가입</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>

	<!-- Main -->
	<div id="main">
		<section class="wrapper style1">
		<div class="inner">

			<header class="align-center">
			<h2>로그인</h2>
			<p>Email이나 SNS로 로그인 하실 수 있습니다.</p>
			</header>

			<hr class="major" />

			<!-- Login Form -->
			<div class="row 200%">
				<div class="6u 12u$(medium)">

					<h4>Login into Your Email</h4>
					<form method="post" action="login">
						<div class="row uniform">
							<div class="10u$">
								<i class="fa fa-inbox"></i> <input type="email" name="email"
									id="email" value="" placeholder="Email" />
							</div>
							<div class="10u$">
								<i class="fa fa-key"></i> <input type="password" name="password"
									id="password" value="" placeholder="password" />
							</div>
							<!-- checkbox -->
							<div class="6u 12u$(small)">
								<input type="checkbox" id="copy" name="copy"> <label
									for="copy">Remember me</label>
							</div>
							<div class="12u$">
								<ul class="actions">
									<li><input type="submit" value="Log-in Now" /></li>
									<li><a href="#" class="button special icon fa-search">Forgot
											Password</a></li>
								</ul>
							</div>
							<div class="12u$">
								<ul class="actions">
									<li><a href="#" class="button icon fa-download"
										data-toggle="modal" data-target="#myModal2">Create New
											Account</a></li>
								</ul>
							</div>
						</div>
					</form>
				</div>

				<div class="6u 12u$(medium)">
					<h4>Facebook Chatbot</h4>
					<div class="col align-center">
						<div class="image round fit">
							<img src="images/fb-chatbot.png" alt="" />
						</div>

						<a href="https://www.mfacebook.com/messages/t/1214050375393430"
							class="button">Run Chatbot</a>
					</div>

				</div>
			</div>
		</div>
		</section>
	</div>

	<!-- Footer -->
	<footer id="footer">
	<div class="copyright">
		<ul class="icons">
			<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
			<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
			<li><a href="#" class="icon fa-instagram"><span
					class="label">Instagram</span></a></li>
			<li><a href="#" class="icon fa-github"><span class="label">Github</span></a></li>
		</ul>
		<p>
			&copy; Untitled. All rights reserved. Design: <a
				href="https://templated.co">TEMPLATED</a>. Images: <a
				href="https://unsplash.com">Unsplash</a>.
		</p>
	</div>
	</footer>

	<!-- Scripts -->
	<script type="text/javascript"
		src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/bootstrap.min.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/jquery.min.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/jquery.scrolly.min.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/jquery.scrollex.min.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/skel.min.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/util.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/main.js"></script>

</body>
</html>