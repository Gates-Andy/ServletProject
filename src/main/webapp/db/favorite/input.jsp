<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨 찾기 추가</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h2>즐겨찾기 추가</h2>

		<form method="post" action="/db/favorite/create">
			<label>사이트 명</label> <input type="text" class="form-control col-3" name="name">
			<label>사이트 주소</label> <input type="text" class="form-control col-6" name="url">
			<button type="submit" class="btn btn-success mt-3">추가</button>
		</form>

	</div>
</body>
</html>