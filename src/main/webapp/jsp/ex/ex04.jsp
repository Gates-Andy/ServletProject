<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!-- *로 유틸 너어어어무 많이가져오면 안댐 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// 과일 이름 리스트
	List<String> fruitList = new ArrayList<>();
	fruitList.add("사과");
	fruitList.add("바나나");
	fruitList.add("딸기");
	%>

	<table border="1">
		<%
		for (String fruit : fruitList) {
		%>
		<tr>
			<td><%=fruit%></td>
		</tr>
		<%
		}
		%>
	</table>

	<%
	// 여러 학생의 국어,수학,영어
	// 학생 1 : 국어 : 90, 수학 : 95, 영어 : 80
	// 학생 2 : 국어 : 100, 수학 : 90, 영어 : 70
	
	// {"국어" : 90, "수학" : 95, "영어" : 80}
	// {"국어" : 100, "수학" : 90, "영어" : 70}
	
	// [{"국어" : 90, "수학" : 95, "영어" : 80},{"국어" : 100, "수학" : 90, "영어" : 70}]
	
	Map<String, Integer> score1 = new HashMap<>();
	score1.put("국어",90);
	score1.put("수학",95);
	score1.put("영어",80);
	
	Map<String, Integer> score2 = new HashMap<>();
	score2.put("국어",100);
	score2.put("수학",90);
	score2.put("영어",70);
	
	List<Map<String, Integer>> scoreList = new ArrayList<>();
	
	scoreList.add(score1);
	
	scoreList.add(score2);
	
	%>
	<table>
		<thead>
			<tr>
				<th>국어</th>
				<th>수학</th>
				<th>영어</th>
			</tr>
		</thead>
		<tbody>
			<% for(Map<String, Integer> score:scoreList) { %>
			<tr>
				<td><%= score.get("국어") %></td>
				<td><%= score.get("수학") %></td>
				<td><%= score.get("영어") %></td>
			</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>