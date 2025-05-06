<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 기본 문법</title>
</head>
<body>
	<h3>기본 문법</h3>
	<!-- html 주석 (소스에는 보임) -->
	<%-- jsp 주석 (소스에도 안보임)--%>

	<h3>1. 1부터 10까지의 합을 h3 태그로 표시</h3>
	<%
		int sum = 0;	
		for (int i = 0; i <= 10; i ++){
			sum += i;
		}
		
		// out.println("<h3>합계 : " + sum + "</h3>"); html에서는 이렇게 했는데
	%>

	<h3>
		합계 :
		<%= sum %>
	</h3>

	<input type="text" value="<%= sum %>">
	<%-- <div <%= sum %>></div> (가능하긴 함)--%>

	<h3>2. 리스트 다루기</h3>

	<%
	  // 동물이름 리스트
	  List<String> animalList = new ArrayList<>();
	  animalList.add("고양이");
	  animalList.add("강아지");
	%>

	<ul>
		<li><%= animalList.get(0) %></li>
		<li><%= animalList.get(1) %></li>
	</ul>

	<h3>3. 메소드 만들기</h3>
	<%!
		// Hello World를 문자열로 리턴하는 메소드 
		public String getHelloWorld(){
			return "Hello World";
		}
	%>

	<%
	 	String message = getHelloWorld();
	%>

	<h3><%= message %></h3>
	<h3><%= getHelloWorld() %></h3>

</body>
</html>