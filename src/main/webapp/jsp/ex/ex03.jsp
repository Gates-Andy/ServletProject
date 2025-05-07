<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Post method</title>
</head>
<body>
	<%
		//nickname을 전달 받고 그대로 보여준다.
		String nickname = request.getParameter("nickname");
	
		// 좋아하는 동물 하나를 전달 받고 보여준다. 고양이 강아지 토끼
		String animal = request.getParameter("animal");
		
		// 좋아하는 과일 하나를 전달 받고 보여준다. 바나나,딸기,복숭아
		String fruit = request.getParameter("fruit");
		
		// 좋아하는 음식을 모두 전달 받고 보여준다.
		String[] foodArray = request.getParameterValues("food");
		
		String foodString = ""; // 왜 null은 안되는가
		
		for(int i = 0; i < foodArray.length; i++){
			foodString  += foodArray[i] + " "; // 뒤에 다른 항목을 구별하기 위한 띄어쓰기 필요
		}
	%>

	<h3><%= nickname %></h3>
	<h3><%= animal %></h3>
	<h3><%= fruit %></h3>
	<h3><%= foodString %></h3>
</body>
</html>