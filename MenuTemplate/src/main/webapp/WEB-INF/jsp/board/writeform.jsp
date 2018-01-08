<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link href="http://netdna.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet">
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="${pageContext.servletContext.contextPath}/resources/summernote.css" rel="stylesheet">
<script src="${pageContext.servletContext.contextPath}/resources/summernote.js"></script>
<script src="${pageContext.servletContext.contextPath}/resources/lang/summernote-ko-KR.js"></script>
<link rel="icon" href="${pageContext.servletContext.contextPath}/resources/ico/home_iot.png">
<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/assets/css/clientboard.css" />
<title>게시판 글 작성</title>
<style>
.panel.panel-default {
	background-image: url(${pageContext.servletContext.contextPath}/resources/images/background01.jpg);
	height: 100%;
	width: 100%;
	background-size: cover;
}

.center-block {
	text-align: right;
}

input.upload {
	opacity: 0; /*input type="file" tag 투명하게 처리*/
	position: relative;
}

button.replace { /*button tag 에 원하는 스타일 적용*/
	position: absolute;
	width: 120px;
	height: 38px;
	border-radius: 3px;
	font-weight: 600;
	border-color: transparent;
	font-size: 15px;
	background: hotpink;
	color: #fff;
	cursor: pointer;
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

	<!-- Main body -->

	<div class="panel panel-default">

		<header class="align-center">
		<h2>게시판 작성</h2>
		</header>

		<div class="panel-body">
			<div class="container">
				<div class="table-wrapper">
					<form action="write" method="post" enctype="multipart/form-data">
						<form role="form">
							<table>
								<thead>
									<tr>
										<th>
											<h3>게시글 작성</h3>
										</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>
											<div class="form-group">
												<label for="subject"><strong>제목 입력</strong></label> <input
													type="text" class="form-control" name="boardSubject"
													id="boardSubject" placeholder="Enter title">
												<!-- <label for="subject">제목</label> <input type="text" class="form-control" name="boardType" id="boardType" placeholder="Enter title"> -->
											</div>
										</td>
									</tr>
									<tr>
										<td>
											<div class="form-group">
												<!-- <input type="hidden" name="boardContent" id="boardContent"> -->
												<textarea name="boardContent" id="boardContent"
													class="summernote"></textarea>
											</div>
										</td>
									</tr>
									<tr>
										<td>
											<div class="form-group">
												<label for="File">
													<button class="replace">파일 업로드</button> <input type="file" name="file">
												</label>
											</div>
										</td>
									</tr>
								</tbody>
								<tfoot>
									<tr>
										<td>
											<div class="center-block">
												<input type="submit" id='btn-write' value="저장하기"> <input
													type="reset" value="다시쓰기"> <input type="button"
													value="Back" onclick="history.back(1)">
											</div>
										</td>
									</tr>
								</tfoot>
							</table>
						</form>
					</form>
				</div>
			</div>
		</div>
	</div>

	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/jquery.scrolly.min.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/jquery.scrollex.min.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/skel.min.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/util.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/assets/js/main.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/summernote.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/lang/summernote-ko-KR.js"></script>

	<script>
		$(function() {
			// jQuery활용 데이터 보내보기
			/* $('#btn-write').click(function(){
			    // 썸머노트 안에 작성된 코드 값을 content 변수에
			    let content = $('summernote').summernote('code');
			    // 다시 그걸 바로 위에 숨겨 놓은 input 태그에다가 딱 넘겨준다.
			    // 핵소름 hidden 복선
			    $('#boardContent').val(boardContent);
			    location.href="../board/write";
			}) */
			$('.summernote').summernote({
				height : 300, // 기본 높이값
				minHeight : null, // 최소 높이값(null은 제한 없음)
				maxHeight : null, // 최대 높이값(null은 제한 없음)
				focus : true, // 페이지가 열릴때 포커스를 지정함
				lang : 'ko-KR', // 한국어 지정(기본값은 en-US)
				callbacks : { // summernote에 onImageUpload함수를 지정해 주지 않으면
					// 이미지 파일이 데이터 형식으로 그대로 들어가기 때문에 
					// 상당히 곤란해 진다.
					onImageUpload : function(files, editor, welEditable) {
						for (var i = files.length - 1; i >= 0; i--) {
							sendFile(files[i], this);
						}
					}
				}
			});
		})
	</script>
</body>
</html>
