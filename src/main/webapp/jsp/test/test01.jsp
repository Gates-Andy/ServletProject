<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>1. 점수들의 평균 구하기</h3>
	<%
	int[] scores = { 80, 90, 100, 95, 80 };
	int sum = 0;
	for (int i = 0; i < scores.length; i++) {
		sum += scores[i];
	}
	int avg = sum / 5;
	%>

	<%= avg %>
	
	<h3>2. 채점 결과</h3>
	<%
    List<String> scoreList = Arrays.asList("X", "O", "O", "O", "X", "O", "O", "O", "X", "O");
    int score = 0;

    for (int i = 0; i < scoreList.size(); i++) {
        if (scoreList.get(i).equals("O")) {
            score += 10;
        }
    }
	%>

	<%= score %>
	
</body>
</html>