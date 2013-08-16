<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SLiPP</title>
<%@ include file="../commons/_header.jspf"%>
</head>
<body>
	<%@ include file="../commons/_top.jspf"%>

	<div class="container">
		<div class="row">
			<div class="span12">

				<div class="page-header">
					<h1>질의 응답 - 글쓰기</h1>
				</div>

				<c:set var="forwardUrl" value="/board/insert" />
				<c:if test="${not empty user.userId}">
					<c:set var="forwardUrl" value="/board/insert" />
				</c:if>

				<form class="form-horizontal" action="${forwardUrl}" method="post">
					<div class="control-group">
						<label class="control-label" for="userId"> 제 목 </label>
						<div class="controls">
							<input type="text" id="subject" name="subject" size=100 maxlength=200>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="name"> 내 용 </label>
						<div class="controls">
							<textarea id="content" name="content" cols=100 rows=15 ></textarea>
						</div>
					</div>
					<c:if test="${not empty errorMessage}">
						<div class="control-group">
							<div class="controls">${errorMessage}</div>
						</div>
					</c:if>
					<div class="control-group">
						<div class="controls">
							<button type="submit" class="btn btn-primary"> 글쓰기 </button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
