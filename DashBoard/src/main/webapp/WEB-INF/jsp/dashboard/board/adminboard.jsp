<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 관리</title>
</head>
<body>
	<h1>게시판 관리</h1>
	<hr>
		<div class="">
			<table border="1">
				<!-- 테이블 첫행 -->
				<thead>
					<tr>
						<!-- 게시판 유형,새글수,표시여부등의 것들을 더 추가하려 했으나 비구현 추후 구현 -->
						<th><input type="checkbox" name="chk_idx" /></th>
						<th>게시판ID</th>
						<th>분류</th>
						<th>게시판제목</th>
						<th>권한(Write)</th>
						<th>권한(Read)</th>
						<th>총갯수</th>
						<th>관리</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach items="${adminboard}" var="item">
						<tr>
							<td><input type="checkbox" id="chk_type" name="chk_type" /></td>
							<td>${item.boardlistNo}</td>
							<td>${item.boardlistKind}</td>
							<td>${item.boardlistSubject}</td>
							<!-- 게시판 ID -->
							<td>${item.boardlistWrite}</td>
							<th>${item.boardlistRead}</th>
							<td>${count}개</td>
							<td>
								<!-- 이 외에 관리를 어떻게 해야할지 추후 수정 --> <a href="../../board/list/${item.boardlistNo}" id="board">게시판이동</a>
								<a href="#" id="boardMod">게시판수정/</a> <a href="#" id="delete">글삭제</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
				<tfoot>
				</tfoot>
			</table>
		</div>
	<input type="button" id="addBoard" name="addBoard"><a href="../board/addboard">게시판 추가</a>
	<input type="button" id="deleteBoard" name="deleteBoard" value="게시판삭제" />
	<br />
</body>
</html>