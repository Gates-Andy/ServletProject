<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Post method 2</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>

	<h1>길이 변환</h1>

	<form method="post" action="/jsp/test/test05.jsp">
		<div class="d-flex align-items-end">
			<input type="text" class="form-control col-2" name="cm"> <div>cm</div>
		</div>

		<h4>구하고 싶은 단위를 "모두" 고르세요</h4>
		<div class="mt-2">
		<label>인치<input type="checkbox" name="unit" value="inch"></label>
		<label>야드<input type="checkbox" name="unit" value="yard"></label>
		<label>피트<input type="checkbox" name="unit" value="feet"></label>
		<label>미터<input type="checkbox" name="unit" value="meter"></label><br>
		</div>

		<button type="submit" class="btn btn-success">변환</button>

	</form>

</body>
</html>