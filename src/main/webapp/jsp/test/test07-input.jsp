<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바 제어문 사용하기 2</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
>
</head>

<body>
	<h1 class="text-center mt-3">메뉴검색</h1>
	<div class="container text-left">
		<form method="post" action="/jsp/test/test07.jsp">
			<input type="text" name="menu" placeholder="치킨"> 
			<label><input type="checkbox" name="filter" value="point"> 4점 이하 제외</label><br>
			<button type="submit" class="btn btn-success mt-3">검색</button>
		</form>
	</div>
</body>
</html>