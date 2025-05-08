<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
	<form method="post" action="/jsp/test/test04.jsp">
		<input type="text" name="number1"> 
		<select name="calculator" >
			<option value="+">+</option>
			<option value="-">-</option>
			<option value="*">×</option>
			<option value="%">%</option>
		</select> <input type="text" name="number2">
		<button type="submit" class = "btn btn-primary">계산</button>
	</form>
</body>
</html>