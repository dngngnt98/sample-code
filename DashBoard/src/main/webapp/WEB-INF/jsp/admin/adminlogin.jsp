<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/assets/css/main.css" />
<title>Bigdata3 by Create</title>
</head>
<body class="subpage">
	<!-- Header -->
	<header id="header">
	<div class="logo">
		<a href="#">Admin <span>Log-in</span></a>
	</div>

	<!-- Main -->
	<div id="main">
		<section class="wrapper style1">
		<div class="inner">

			<header class="align-center">
			<h2>로그인</h2>
			<p>관리자 로그인 페이지</p>
			</header>
			<hr class="major" />
			<!-- Login Form -->
			<form action="login" method="post">
				<div class="row 200%">
					<div class="6u 12u$(medium)">
						<h4>Login into Your Email</h4>
						<form method="post" action="login">
							<div class="row uniform">
								<div class="10u$">
									<i class="fa fa-key"></i> <input type="email" name="adminMail"
										id="adminMail" placeholder="Please input admin Email"/>
								</div>
								<div class="10u$">
									<input type="password" name="adminPassword" id="adminPassword"
										placeholder="Please input your password" />
								</div>
								<div class="12u$">
									<ul class="actions">
										<li><input type="submit" value="Sign-In" /></li>
										<li><a href="#" class="button special icon fa-search">Forgot
												Password</a></li>
									</ul>
								</div>
								<div class="12u$">
									<ul class="actions">
										<li><a href="#" class="button icon fa-download">Create
												New Account</a></li>
									</ul>
								</div>
							</div>
						</form>
					</div>
				</div>
			</form>
		</div>
		</section>
	</div>

	<!-- Footer --> <footer id="footer">
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
	</footer> <!-- Scripts --> <script
		src="${pageContext.servletContext.contextPath}/assets/js/jquery.min.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/assets/js/jquery.scrolly.min.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/assets/js/jquery.scrollex.min.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/assets/js/skel.min.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/assets/js/util.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/assets/js/main.js"></script>
</body>
</html>