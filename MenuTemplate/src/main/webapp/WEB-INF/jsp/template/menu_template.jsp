<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>메뉴판 1</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/assets/css/menu_board.css" />
<!-- Favicon and touch icons -->
<link rel="icon" href="ico/home_iot.png">
</head>
<style>
#header>.logo {
	left: 3em;
}

.hit {
	animation-name: blink;
	animation-duration: 1.5s;
	animation-timing-function: ease;
	animation-iteration-count: infinite;
	/* 위 속성들을 한 줄로 표기하기 */
	/* -webkit-animation: blink 1.5s ease infinite; */
}
/* 애니메이션 지점 설정하기 */
/* 익스플로러 10 이상, 최신 모던 브라우저에서 지원 */
@
keyframes blink {from { color:white;} 30%{color: yellow ;}
to {
	color: red;
	font-weight: bold;
}
/* 0% {color:white;}
      30% {color: yellow;}
      100% {color:red; font-weight: bold;} */
}
</style>

<body>
	<header id="header">
	<div class="logo">
		<a href="index.html">T.G.I Friday!(가칭) </a>
	</div>
	</header>

	<div id="main">
		<section class="wrapper style1">
		<div class="inner">

			<div class="row 200%">
				<div class="6u 12u$(medium)">

					<div class="row">
						<div class="6u 12u$(small)">
							<span class="image fit"><img src="${pageContext.servletContext.contextPath}/resources/images/menu_board01.jpg"
								alt="" /></span>
						</div>
						<div class="6u$ 12u$(small)">
							<h3>
								아보카도 스페셜 <span class="hit"> New!</span>
							</h3>
							<ul class="alt" name="${menu}">
								<li><strong>가격 : ${menu.menuPrice}원</strong></li>
								<li><strong>열량 : ${menu.menuKcal}</strong></li>
							</ul>
						</div>
					</div>

					<div class="row">
						<div class="6u 12u$(small)">
							<h3>
								치킨 허브 스테이크 <span class="hit"> Hit!</span>
							</h3>
							<ul class="alt">
								<li><strong>가격 : 13000원</strong></li>
								<li><strong>열량 : 650Kcal</strong></li>
								<li><strong>원산지 : 한국</strong></li>
							</ul>
						</div>
						<div class="6u$ 12u$(small)">
							<span class="image fit"><img src="${pageContext.servletContext.contextPath}/resources/images/menu_board02.jpg"
								alt="" /></span>
						</div>
					</div>

					<div class="row">
						<div class="6u 12u$(small)">
							<span class="image fit"><img src="${pageContext.servletContext.contextPath}/resources/images/menu_board03.jpg"
								alt="" /></span>
						</div>
						<div class="6u$ 12u$(small)">
							<h3>메뉴3</h3>
							<ul class="alt">
								<li><strong>가격 : 9000원</strong></li>
								<li><strong>열량 : 750Kcal</strong></li>
								<li><strong>원산지 : 한국</strong></li>
							</ul>
						</div>
					</div>
				</div>

				<div class="6u 12u$(medium)">
					<div class="row">
						<div class="6u 12u$(small)">
							<span class="image fit"><img src="${pageContext.servletContext.contextPath}/resources/images/menu_board04.jpg"
								alt="" /></span>
						</div>
						<div class="6u$ 12u$(small)">
							<h3>
								뉴욕버거 세트 <span class="hit"> Hit!</span>
							</h3>
							<ul class="alt">
								<li><strong>가격 : 15000원</strong></li>
								<li><strong>열량 : 980Kcal</strong></li>
								<li><strong>원산지 : 미국</strong></li>
							</ul>
						</div>
					</div>

					<div class="row">
						<div class="6u 12u$(small)">
							<h3>메뉴5</h3>
							<ul class="alt">
								<li><strong>가격 : 14000원</strong></li>
								<li><strong>열량 : 680Kcal</strong></li>
								<li><strong>원산지 : 일본</strong></li>
							</ul>
						</div>
						<div class="6u$ 12u$(small)">
							<span class="image fit"><img src="${pageContext.servletContext.contextPath}/resources/images/menu_board05.jpg"
								alt="" /></span>
						</div>
					</div>

					<div class="row">
						<div class="6u 12u$(small)">
							<span class="image fit"><img src="${pageContext.servletContext.contextPath}/resources/images/menu-board06.jpg"
								alt="" /></span>
						</div>
						<div class="6u$ 12u$(small)">
							<h3>메뉴6</h3>
							<ul class="alt">
								<li><strong>가격 : 22000원</strong></li>
								<li><strong>열량 : 980Kcal</strong></li>
								<li><strong>원산지 : 이탈리아</strong></li>
							</ul>
						</div>
					</div>

				</div>
			</div>
		</div>
		</section>
	</div>
</body>

</html>