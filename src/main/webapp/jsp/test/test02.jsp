<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bmi</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>
	<%
	int height = Integer.parseInt(request.getParameter("height"));
	int weight = Integer.parseInt(request.getParameter("weight"));
	
	double bmi = weight / ((height / 100.0) * (height / 100.0));
	
	String result = null;
	
	if (bmi < 18.5) {
		result = "저체중";
	} else if (bmi < 25) {
		result = "정상";
	} else if (bmi < 30) {
		result = "과체중";
	} else {
		result = "비만";
	}
	%>
	
	<div class="container">
		<h2>BMI 측정 결과</h2>
		<div class="display-4">당신은<span class="text-info"><%= result %></span>입니다.</div><br>
		<div> BMI 수치 :<%=bmi%></div>
	</div>
</body>
</html>