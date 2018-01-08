<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/assets/css/style.css" />
<script src="${pageContext.servletContext.contextPath}/assets/js/location.js"></script>
<script>
function remove(){
	location.href = 'delete?boardNo=${detail.boardNo}'
}
</script>
<title>게시판 상세</title>
</head>
<body>
  <div id="sub_wrap">
    <div class="container">
      <table class="table table-view">
        <colgroup>
          <col width="7%">  <!-- 글 번호 -->
          <col width="*">   <!--  제목   -->
          <col width="10%"> <!-- 작성자 -->
          <col width="10%"> <!-- 작성일 -->
          <col width="7%">  <!-- 조회수 -->
        </colgroup>
        <thead>
          <tr>
            <th class="subject">${detail.boardTitle}</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td class="infocell"><b>등록일  </b>${detaiil.boardDate}"<b>조회수  </b>${detail.boardHit}</td>
          </tr>
          <tr>
            <td class="contents">
              ${detail.boardContent}
            </td>
          </tr>
          <!-- 이전글 & 다음글  -->
          <%-- <c:choose>
            <c:when test="${fn:length(list) == 2 and tb_write.idx == list[0].idx }"> <!-- 내가클릭한 게시물이 list[0]번째 글이면 최신글이다.  -->
            <tr>
              <td><span class="prev">이전</span>이전글이 없습니다.</td> <!-- 최신글보다 더 최신글이 없다는 의미이다. -->
            </tr>
            <tr>
              <td><span class="next">다음</span><a href="/View?idx=${list[1].idx}">${list[1].title}</a></td> 
            </tr>
            </c:when>
            
            <c:when test="${fn:length(list) == 2 and tb_write.idx < list[0].idx }"> <!-- 내가 클릭한 게시물이 list[0]번째 글(최신글)보다 이전에 만들어 졌으면 -->
            <tr>                   
              <td><span class="prev">이전</span><a href="/View?idx=${list[0].idx}">${list[0].title}</a></td> <!-- list[0]번쨰 글이 나온다. -->
            </tr>                                     <!-- 내가 클릭한 글은 무조건 list[1]번째 글이다. -->
            <tr>
              <td><span class="next">다음</span>다음글이 없습니다.</td>
            </tr>
            </c:when>
            <c:when test="${fn:length(list) == 3 and tb_write.idx < list[0].idx}"> <!-- 내가 클릭한 게시물이 [l  -->
            <tr>
              <td><span class="prev">이전</span><a href="/View?idx=${list[0].idx}">${list[0].title}</a></td>
            </tr>
            <tr>
              <td><span class="next">다음</span><a href="/View?idx=${list[2].idx}">${list[2].title}</a></td>
            </tr>
            </c:when>
          </c:choose> --%>
        </tbody>
      </table>
      <!-- 작성자의 권한으로만 동작하는 기능 -->
      <div class="huge-top">
        <%-- <c:if test="${sessionScope.id == 'elvis'}"> --%>
          <button class="btn btn-normal" <%-- onclick="location.href='/Modify_View?idx=${board.boardNo}'" --%>>수정</button>
          <button class="btn btn-normal btn-black" onclick="remove()" id="delete">삭제</button>
        <%-- </c:if> --%>
          <button class="btn btn-normal btn-blue pull-right" onclick="list(1)">목록</button>
      </div>
    </div>
  </div>
</body>
</html>