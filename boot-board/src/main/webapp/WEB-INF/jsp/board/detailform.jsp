<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/resources/assets/css/clientboard.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>게시판 글 확인</title>
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
	<header class="align-center">
	<h1>여긴 어디 나는 누구?</h1>
	</header>

	<div id="sub_wrap">
		<div class="container">
			<table class="table table-view">
				<colgroup>
					<col width="7%">
					<!-- 글 번호 -->
					<col width="*">
					<!--  제목   -->
					<col width="10%">
					<!-- 작성자 -->
					<col width="10%">
					<!-- 작성일 -->
					<col width="7%">
					<!-- 조회수 -->
				</colgroup>
				<thead>
					<tr>
						<th class="subject">${board.boardTitle}</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td class="infocell"><b>등록일 </b>${board.boardDate}" <b>조회수</b>${board.boardHit}
						</td>
					</tr>
					<tr>
						<td class="contents">${board.boardContent}</td>
					</tr>
				</tbody>
			</table>
			<!-- 작성자의 권한으로만 동작하는 기능 -->
			<div class="huge-top">
				<c:if test="${sessionScope.bmasterEmail == board.boardWriter}">
					<button class="btn btn-normal" id="update">수정</button>
					<button class="btn btn-normal btn-black" id="delete">삭제</button>
				</c:if>
				<button class="btn btn-normal btn-blue pull-right" onclick="list(1)">목록</button>
			</div>

			<div id="replyList">
				<table style="width: 700px">
					<c:forEach var="item" items="${list}">
						<tr>
							<td>${item.email}(<fmt:formatDate value="${item.replyDate}"
									pattern="yyyy-MM-dd HH:mm:ss" />) <br> ${item.replyContent}
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>


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
	<script>
		
		$(function() {
		    // call replyList
		    replyList();
		    
		    $('#btn').click(function(){
		    	let replyContent=$("#replyContent").val()
		    	let boardNo = "${~~~.boardNo}"
		    	let param = "replyContent="+replyContent+"&boardNo"+boardNo
		    	$.ajax({
		    		type: "post",
		    		url: "../reply/insert",
		    		data: param,
		    		success: function(){
		    		    replyList();	
		    		}
		    	})
		    })
		    
		    $('#update').click(function() {
                /* location.href = "../board/update"; */
            })
        
            $('#delete').click(function() {
                location.href = "../board/delete?boardNo=${board.boardNo}";
            })
		})
		
		function replyList(){
			$.ajax({
				type: "get",
				url: "../reply/list?boardNo=${~~~.boardNo}",
				success: function(result){
					$('#replyList').html(result);
				}
			})
		}
		 
	</script>
</body>
</html>