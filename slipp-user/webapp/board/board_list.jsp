<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SLiPP</title>
<%@ include file="../commons/_header.jspf"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
	<%@ include file="../commons/_top.jspf"%>

	<div class="container">
		<div class="row">
			<div class="span12">

				<div class="page-header">
					<h1>질의 응답</h1>
				</div>

				<table border=1 cellspacing=0 width=1000>
				
					<tr>
						<td bgcolor=#CCCCCC width=100>
							<p align=center> 넘 버 </p>
						</td>
						<td bgcolor=#CCCCCC width=500>
							<p align=center> 제 목 </p>
						</td>
					</tr>

					<tr>
						<td width=100% colspan=5>
							<p align=center>[처음][이전] [1][2][3] [다음][마지막]</p>
						</td>
					</tr>

					<tr>
						<td width=100% colspan=5>
							<p align=center>
								<a href="/board/write"> [글쓰기] </a>
							</p>
						</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
