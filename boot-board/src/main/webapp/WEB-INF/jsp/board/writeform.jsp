<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>게시판 글 작성</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<script src="https://code.jquery.com/jquery-3.2.1.min.js"
	integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
	crossorigin="anonymous"></script>
<script
	src="http://netdna.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.js"></script>
<link
	href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.2/summernote.css"
	rel="stylesheet" />
<script
	src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.2/summernote.js"></script>
</head>

<body class="subpage">
	<div class="container" style="padding-top: 100px;">
		<form action="insert" class="boardSubmit" method="post"
			enctype="multipart/form-data">
			<table class="table table-bordered">
				<tr>
					<th>글 제목</th>
					<td><input type="text" name="boardSubject" class="form-control" /></td>
				</tr>
				<tr>
					<th>글 내용</th>
					<td><textarea class="form-control" id="summernote"
							name="boardContent" placeholder="boardContent" maxlength="140" rows="7"></textarea>
					</td>
				</tr>
				<tr>
					<th>파일</th>
					<td>
						<div class="fileForm">
							<input type="file" name="file" />
						</div>
					</td>
				</tr>
			</table>

			<button class="btn btn-primary" type="submit">작성하기</button>
			<button type="button" class="fileAdd btn btn-success">파일 추가</button>
		</form>
	</div>
	<script>
		$(document)
				.ready(
						function() {
							var sendFile = function(file, el) {
								var form_data = new FormData();
								form_data.append('file', file);
								$
										.ajax({
											data : form_data,
											type : "POST",
											url : 'c:/webupload',
											cache : false,
											contentType : false,
											enctype : 'multipart/form-data',
											processData : false,
											success : function(url) {
												$('#summernote').summernote(
														'insertImage', url);
												$('#imageBoard > ul')
														.append(
																'<li><img src="'+ url +'" width="480" height="auto"/></li>');
											}
										});
							}
							$('#summernote')
									.summernote(
											{
												height : 300,
												minHeight : null,
												maxHeight : null,
												focus : true,
												callbacks : {
													onImageUpload : function(
															file, editor,
															welEditable) {
														for (var i = files.length - 1; i >= 0; i--) {
															sendFile(files[i],
																	this);
														}
													}
												}
											});
						});
	</script>
	<script>
		$(document)
				.ready(
						function() {
							$('.fileAdd')
									.click(
											function() {
												if ($('.fileForm').children().length >= 5) {
													alert("파일은 5개 까지만 추가 가능합니다.");
												} else {
													$('.fileForm')
															.append(
																	'<input type="file" name="file"/>');
												}
											})
						});
	</script>
</body>
</html>
