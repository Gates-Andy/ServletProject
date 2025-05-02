<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>
	<h1>BMI 계산기</h1>
	<form method=get action="/jsp/test/test02.jsp">
		<div class="d-flex align-items-end">
			<input type="text" name="height"><label>cm</label>

			<input type="text" name="weight"><label>kg</label>

			<button type="submit" class="btn btn-primary">계산</button>
		</div>
	</form>
</body>
</html>