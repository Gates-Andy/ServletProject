<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Post input</title>
</head>
<body>
	<form method="post" action="/jsp/ex/ex03.jsp">
		<label>닉네임 : </label> <input type="text" name="nickname"> <br>

		<h4>좋아 하는 동물을 고르세요</h4>
		<br>
		<!-- 라벨 안에 라디오 버튼 -->
		<label>고양이<input type="radio" name="animal" value="cat"
			checked></label> <label>강이지<input type="radio" value="dog"
			name="animal"></label> <label>토끼<input type="radio"
			value="rabbit" name="animal"></label> <br>

		<h4>좋아 하는 과일을 고르세요</h4>
		<br>
		<!-- 라벨 안에 라디오 버튼 -->
		<select name="fruit">
			<option value="banana">바나나</option>
			<option value="strawberry">딸기</option>
			<option >복숭아</option>
		</select> <br>



		<button type="submit">입력</button>
	</form>
</body>
</html>