<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 추가 post 로 파라미터로</title>
</head>
<body>

	<form method="post" action="/db/user/create">
		<label>이름 : </label> <input type="text"> <Br> 
		<label>생년월일 : </label> <input type="text"> <br> 
		<label>이메일 : </label> <input type="text"> <br> <label>자기소개 : </label><br>
		<textarea rows="5" cols="30"></textarea> <br>
		<button type="submit">추가</button>
	</form>
	
</body>
</html>