<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.HashMap"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바 제어문 사용하기 3</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>
	<%
	List<Map<String, Object>> list = new ArrayList<>();

	Map<String, Object> map = new HashMap<String, Object>() {
		{
			put("id", 1000);
			put("title", "아몬드");
			put("author", "손원평");
			put("publisher", "창비");
			put("image", "https://contents.kyobobook.co.kr/sih/fit-in/458x0/pdt/9791198363503.jpg");
		}
	};
	list.add(map);

	map = new HashMap<String, Object>() {
		{
			put("id", 1001);
			put("title", "사피엔스");
			put("author", "유발 하라리");
			put("publisher", "김영사");
			put("image", "https://contents.kyobobook.co.kr/sih/fit-in/458x0/pdt/9788934972464.jpg");
		}
	};
	list.add(map);

	map = new HashMap<String, Object>() {
		{
			put("id", 1002);
			put("title", "코스모스");
			put("author", "칼 세이건");
			put("publisher", "사이언스북");
			put("image", "https://contents.kyobobook.co.kr/sih/fit-in/458x0/pdt/9788983711892.jpg");
		}
	};
	list.add(map);

	map = new HashMap<String, Object>() {
		{
			put("id", 1003);
			put("title", "나미야 잡화점의 기적");
			put("author", "히가시노 게이고");
			put("publisher", "현대문학");
			put("image", "https://contents.kyobobook.co.kr/sih/fit-in/458x0/pdt/4808972756194.jpg");
		}
	};
	list.add(map);
	%>
 

	<h1 class="text-center">책 목록</h1>
	<table class="table text-center">
		<thead>
			<tr>
				<td>id</td>
				<td>표지</td>
				<td>제목</td>
			</tr>
		</thead>
		<tbody>
			<%for(Map<String, Object> books:list){%>
			<tr>
				<td><%=books.get("id")%></td>
				<td><img src=<%=books.get("image")%> alt="책사진" height="75"></td>
				<td class="text-primary fs-2"><a href="/jsp/test/test08-input.jsp" style="text-decoration: none;"><%= books.get("title") %></a></td>
			</tr>
			<%} %>
		</tbody>
	</table>


</body>
</html>