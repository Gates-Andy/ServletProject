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
<title>자바 제어문 사용하기 2</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
>
</head>

<body>
	<%
	List<Map<String, Object>> list = new ArrayList<>();

	Map<String, Object> map = new HashMap<String, Object>() {
		{
			put("name", "버거킹");
			put("menu", "햄버거");
			put("point", 4.3);
		}
	};
	list.add(map);
	map = new HashMap<String, Object>() {
		{
			put("name", "BBQ");
			put("menu", "치킨");
			put("point", 3.8);
		}
	};
	list.add(map);
	map = new HashMap<String, Object>() {
		{
			put("name", "교촌치킨");
			put("menu", "치킨");
			put("point", 4.1);
		}
	};
	list.add(map);
	map = new HashMap<String, Object>() {
		{
			put("name", "도미노피자");
			put("menu", "피자");
			put("point", 4.5);
		}
	};
	list.add(map);
	map = new HashMap<String, Object>() {
		{
			put("name", "맥도날드");
			put("menu", "햄버거");
			put("point", 3.8);
		}
	};
	list.add(map);
	map = new HashMap<String, Object>() {
		{
			put("name", "BHC");
			put("menu", "치킨");
			put("point", 4.2);
		}
	};
	list.add(map);
	map = new HashMap<String, Object>() {
		{
			put("name", "반올림피자");
			put("menu", "피자");
			put("point", 4.3);
		}
	};
	list.add(map);

	String target = request.getParameter("menu");
	String filter = request.getParameter("filter");
	%>

	<h2 class="text-center">검색 결과</h2>
	<table class="table text-center">
		<thead>
			<tr>
				<td>메뉴</td>
				<td>상호</td>
				<td>별점</td>
			</tr>
		</thead>

		<tbody>
			<%
			for (Map<String, Object> item : list) {
				String menu = (String) item.get("menu");
				double point = (Double) item.get("point");
				// item.get("menu")와 item.get("point")의 반환값이 Object 타입이니까 다운캐스팅 필요
				
				// "point" 라는 문자열이 파라미터name="filter"로 전달된 value 값이 "point" 일때 true or false
				boolean excludeLowRating = "point".equals(request.getParameter("filter")); 
				// type="checkbox": 체크박스 입력 필드

				// name="filter" : 폼 전송 시 서버로 전달될 파라미터 이름

				// value="point": 체크되었을 경우 서버로 전달될 값
				
				// 메뉴 일치 여부 확인
				if (menu.equals(target)) {
					// 체크박스가 체크되어 있고 point가 4.0 이하인 경우 건너뜀
					if (excludeLowRating && point <= 4.0) {
				  //if(menu.equals(target) && (filter == null || point >= 4.0))
				continue;
					}
			%>
			
			<tr>
				<td><%=item.get("menu")%></td>
				<td><%=item.get("name")%></td>
				<td><%=item.get("point")%></td>
			</tr>
			<%
			
				}
			}
			%>

		</tbody>
	</table>
</body>
</html>