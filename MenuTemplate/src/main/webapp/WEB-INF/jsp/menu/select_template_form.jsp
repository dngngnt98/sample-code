<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>메뉴 템플릿 선택</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/assets/css/registration.css" />
<!-- Favicon and touch icons -->
<link rel="icon" href="${pageContext.servletContext.contextPath}/resources/ico/home_iot.png">
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

	<!-- Main -->
	<div id="main">
		<section class="wrapper">
		<div class="inner">
			<header class="align-center">
			<h2>Menu Board Management</h2>
			<p>메뉴보드 윈도우로서 등록할 템플릿을 선택하세요. 고객께서 선택한 타입으로 메뉴화면이 구성됩니다.</p>
			</header>
		</div>
		</section>

		<section class="wrapper style1">
		<div class="inner">
			<div class="row">
				<div class="3u 12u$(medium)">
					<div class="box">
						<p align="center">
							<strong>김수빈</strong> 님 반갑습니다.
						</p>
						<a href="loginmain.html" class="button special">로그인 페이지 이동</a> <a
							href="#" class="button alt">로그 아웃</a>
					</div>
					<div class="box">
						<ul class="actions vertical">
							<li><a href="dmb_menu.html" class="button">메뉴보드</a></li>
							<li><a href="dmb_event.html" class="button">이벤트보드</a></li>
							<li><a href="iot_control.html" class="button">실내 환경</a></li>
							<li><a href="store_management.html" class="button">매장관리
									처음으로 이동</a></li>
							<li><a href="mypage.html" class="button">마이페이지로 이동</a></li>
						</ul>
					</div>
				</div>
				<div class="9u$ 12u$(medium)">
					<div class="box">
						<form method="post" action="#">
							<div class="row uniform">

								<div class="3u 12u$(xsmall)">
									<h4>매장명</h4>
								</div>
								<div class="5u$ 12u$(xsmall)">
									<div class="select-wrapper">
										<select name="category_storeName" id="category_storeName">
											<option value="">- 매장선택 -</option>
											<option value="1">VIPS강남1호점</option>
											<option value="2">VIPS서초1호점</option>
										</select>
									</div>
								</div>
								<div class="3u 12u$(xsmall)">
									<h4>메뉴 템플릿</h4>
								</div>
								<div class="5u 12u$(xsmall)">
									<div class="select-wrapper">
										<select name="category_menu_window" id="menuWindow">
											<option value="">- 윈도우보드 템플릿을 선택하세요 -</option>
											<option value="1">Type1</option>
											<option value="2">Type2</option>
										</select>
									</div>
								</div>
								<div class="3u$ 12u$(xsmall)">
									<!-- 템플릿 선택후 예제 이미지보기 버튼 클릭시 페이지 하단에 이미지를 확인할 수 있다 -->
									<div class="actions">
										<a href="#" class="button">예제 이미지보기</a>
									</div>
								</div>

								<div class="3u 12u$(xsmall)">
									<h4>메뉴판 제목</h4>
								</div>
								<div class="5u$ 12u$(xsmall)">
									<input type="text" name="Wmenu_title" id="winmenuTitle"
										value="" placeholder="메뉴창의 타이틀을 입력 예) MyMenu01" />
								</div>


								<div class="12u$">
									<!-- 템플릿 예제 이미지보기 버튼 클릭시 이미지를 호출할 공간 -->
									<div class="box">
										<img class="image fit" id="output" alt="Menu-Board image"
											src="" />
									</div>
								</div>

								<!-- Break -->
								<div class="12u$">
									<ul class="actions">
										<li><input type="submit" value="이미지 템플릿 선택" /></li>
										<li><input type="reset" value="등록 취소" class="alt" /></li>
										<li><input type="button" value="삭제"
											class="button special" /></li>
									</ul>
								</div>
							</div>
						</form>
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
	<script>
		var loadFile = function(event) {
			var output = document.getElementById('output');
			output.src = URL.createObjectURL(event.target.files[0]);
		};
		/*
		function chk_file_type(obj) {
		var file_kind = obj.value.lastIndexOf('.');
		var file_name = obj.value.substring(file_kind+1,obj.length);
		var file_type = file_name.toLowerCase();

		var check_file_type=new Array();

		check_file_type=['jpg','gif','png','jpeg','bmp'];

		if(check_file_type.indexOf(file_type)==-1){
		alert('이미지 파일만 선택할 수 있습니다.');
		var parent_Obj=obj.parentNode
		var node=parent_Obj.replaceChild(obj.cloneNode(true),obj);
		return false;
		}
		}
		 */
	</script>
	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/jquery.min.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/jquery.scrolly.min.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/jquery.scrollex.min.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/skel.min.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/util.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/main.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/bootstrap.min.js"></script>

</body>
</html>