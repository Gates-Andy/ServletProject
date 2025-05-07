<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Post input</title>
</head>
<body>
	<form method="post" action="/jsp/ex/ex03.jsp"> <!-- post 메소드 사용인데 인터넷 검사에는 왜 get으로 나오는가 -->
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
			<option value="peach">복숭아</option>
		</select> <br>
		
		<h4>좋아 하는 음식을 "모두" 고르세요</h4>
		<br>
		<label>민트초코<input type="checkbox" name="food" value="mintchoco"></label>
		<label>번데기<input type="checkbox" name="food" value="earth-worm"></label>
		<label>하와이안피자<input type="checkbox" name="food" value="HawaianPizza"></label>
		
		<button type="submit">입력</button>
	</form>
</body>
</html>