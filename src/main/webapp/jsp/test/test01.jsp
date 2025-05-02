<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Arrays"%>
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
	double avg = sum / 5.0;
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
	<h3>3. 1부터 n 까지의 합계를 구하는 함수</h3>
	<%!
		public int sumAll(int number){
		int sum = 0;
		for(int i = 1; i <= number; i++){
			sum+=i;
		}
		return sum;
	}
	%>

	<%= sumAll(50) %>

	<h3>4. 나이 구하기</h3>
	<%
		String birthDay = "20010820";

		int year = Integer.parseInt(birthDay.substring(0,4));
		
		int age = 2025 - year + 1;
	%>
	
	<%= age %>
</body>
</html>