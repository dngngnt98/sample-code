<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>게시판 글 작성</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<!-- bootstrap & fontawesome -->
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/resources/assets/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/resources/assets/css/font-awesome.min.css" />

<!-- page specific plugin styles -->
<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/assets/css/jquery-ui.custom.min.css" />
<!-- text fonts -->
<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/assets/css/fonts.googleapis.com.css" />
<!-- ace styles -->
<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/assets/css/ace.min.css" class="ace-main-stylesheet" id="main-ace-style" />
<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/assets/css/registration.css" />
<!-- Favicon and touch icons -->
<link rel="icon" href="${pageContext.servletContext.contextPath}/resources/ico/home_iot.png">
<!-- ace settings handler -->
<script src="${pageContext.servletContext.contextPath}/resources/assets/js/ace-extra.min.js"></script>
<script src="https://cdn.ckeditor.com/ckeditor5/1.0.0-alpha.2/classic/ckeditor.js"></script>
</head>

<body class="subpage">
	<!-- Header -->
	<header id="header">
	<div class="logo">
		<a href="index.html">BIGDATA3 <span>by Donny</span></a>
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

	<!-- Main body -->

	<div id="main">
		<section class="wrapper">
		<div class="inner">
			<header class="align-center">
			<h2>게시판 작성 페이지</h2>
			</header>
		</div>
		</section>

		<section class="wrapper style1">
		<div class="inner">
			<div class="row">
				<div class="col-xs-12">

					<!-- PAGE CONTENT BEGINS -->
					<h4 class="header green clearfix">게시글 작성</h4>
					<form action="insert" method="post" enctype="multipart/form-data">
						<div class="form-group">
							<label for="articleSubject"><strong>제목 입력</strong></label> <input
								type="text" class="form-control" name="articleSubject"
								id="articleSubject" placeholder="Enter title">
						</div>
						<div class="form-group">
							<textarea name="ckeditor" id="ckeditor"></textarea>
						</div>
						<div class="hr hr-double dotted"></div>

						<span data-toggle="buttons">
							<div class="btn-group pull-left">
								<button class="btn btn-sm btn-default btn-round" type="reset">
									<!-- 쓰기 cancle -->
									<i class="ace-icon fa fa-times bigger-125"></i> 글쓰기 취소
								</button>

								<button class="btn btn-sm btn-danger btn-round" type="button"
									id="" value="Back" onclick="history.back(1)">
									<i class="ace-icon fa fa-reply-all bigger-125"></i> 돌아가기
								</button>
							</div>

							<div class="btn-group pull-right">
								<button class="btn btn-sm btn-success btn-round" type="submit"
									id="form">
									<!-- publish -->
									<i class="ace-icon fa fa-globe bigger-125"></i> 등록 <i
										class="ace-icon fa fa-arrow-right icon-on-right bigger-125"></i>
								</button>
							</div>
						</span>

					</form>
					<!-- PAGE CONTENT ENDS -->
				</div>
				<!-- /.col -->
			</div>
			<!-- /.row -->
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

	<!-- basic scripts -->
	<!--[if !IE]> -->
	<script
		src="${pageContext.servletContext.contextPath}/resources/assets/js/jquery-2.1.4.min.js"></script>

	<!-- <![endif]-->

	<!--[if IE]>
<script src="assets/js/jquery-1.11.3.min.js"></script>
<![endif]-->
	<script type="text/javascript">
		if ('ontouchstart' in document.documentElement)
			document
					.write("<script src='${pageContext.servletContext.contextPath}/resources/assets/js/jquery.mobile.custom.min.js'>"
							+ "<" + "/script>");
	</script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/assets/js/bootstrap.min.js"></script>

	<!-- page specific plugin scripts -->
	<script
		src="${pageContext.servletContext.contextPath}/resources/assets/js/jquery-ui.custom.min.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/assets/js/jquery.ui.touch-punch.min.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/assets/js/jquery.hotkeys.index.min.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/assets/js/bootstrap-wysiwyg.min.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/assets/js/bootbox.js"></script>

	<!-- ace scripts -->
	<script
		src="${pageContext.servletContext.contextPath}/resources/assets/js/ace-elements.min.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/assets/js/ace.min.js"></script>

	<script
		src="${pageContext.servletContext.contextPath}/resources/assets/js/jquery.scrolly.min.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/assets/js/jquery.scrollex.min.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/assets/js/skel.min.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/assets/js/util.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/assets/js/main.js"></script>
	<!-- inline scripts related to this page -->
	<script>
		$(function() {

			CKEDITOR.replace('#ckeditor', {//해당 이름으로 된 textarea에 에디터를 적용
				width : '100%',
				height : '400px',
				filebrowserImageUploadUrl : 'c:/webupload' //여기 경로로 파일을 전달하여 업로드 시킨다.
			});

			CKEDITOR.on('dialogDefinition', function(ev) {
				var dialogName = ev.data.name;
				var dialogDefinition = ev.data.definition;

				switch (dialogName) {
				case 'image': //Image Properties dialog
					//dialogDefinition.removeContents('info');
					dialogDefinition.removeContents('Link');
					dialogDefinition.removeContents('advanced');
					break;
				}
			});

		});
	</script>
</body>
</html>
