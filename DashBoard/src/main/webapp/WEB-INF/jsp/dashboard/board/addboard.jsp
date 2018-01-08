<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<section>
				<h1 class="entry-title">
					<span>Sign Up</span>
				</h1>
				<hr>
				<form action="insertInfo" method="post" name="insertInfo" id="insertInfo">
					<div class="form-group">
						<label class="control-label col-sm-3">분류 <span
							class="text-danger">*</span></label>
						<div class="col-md-8 col-sm-9">
							<div class="input-group">
								<span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i> 
								<select name="boardlistKind">
										<option value="공지">공지</option>
										<option value="일반">일반</option>
										<option value="Q&A">Q&A</option>
								</select>
							</div>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">게시판 제목 <span
							class="text-danger">*</span></label>
						<div class="col-md-5 col-sm-8">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-lock"></i></span> <input type="text"
									class="form-control" name="boardlistSubject" id="boardlistSubject"
									placeholder="Please Enter the Subject!!!">
							</div>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">권한(Write)<span
							class="text-danger">*</span></label>
						<div class="col-md-5 col-sm-8">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-lock"></i></span> <select name="boardlistWrite">
									<option value="관리자">관리자</option>
									<option value="점주">점주</option>
									<!-- <option value="5">Q&A</option> -->
								</select>
							</div>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">권한(Read)<span
							class="text-danger">*</span></label>
						<div class="col-md-5 col-sm-8">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-lock"></i></span> <select name="boardlistRead">
									<option value="관리자">관리자</option>
									<option value="점주">점주</option>
									<!-- <option value="8">Q&A</option> -->
								</select>
							</div>
						</div>
					</div>
					
					<!-- <div class="form-group">
            <label class="control-label col-sm-3"><span
              class="text-danger">*</span></label>
            <div class="col-md-5 col-sm-8">
              <div class="input-group">
                <span class="input-group-addon"><i
                  class="glyphicon glyphicon-lock"></i></span> <select name="boardlistRead">
                  <option value="관리자">관리자</option>
                  <option value="점주">점주</option>
                  <option value="8">Q&A</option>
                </select>
              </div>
            </div>
          </div> -->
					
					<div>
					 <button type="submit">등록</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>