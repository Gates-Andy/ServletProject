<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.Andy.common.MysqlService"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 목록</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body>
	<%
	MysqlService mysqlService = MysqlService.getInstance(); // 싱글턴패턴 스태틱으로 객체를 생성하는게 아니라 얻어온다.

	mysqlService.connect();

	String query = "SELECT * FROM `favorite` ORDER BY `id` DESC";

	List<Map<String, Object>> favoriteList = mysqlService.select(query);
	%>

	<div class="container">
		<table class="table text-center">
			<thead>
				<tr>
					<td>사이트</td>
					<td>사이트 주소</td>
				</tr>
			</thead>
			<tbody>
				<%
				for (Map<String, Object> favorite : favoriteList) {
				%>
				<tr>
					<td><%=favorite.get("name")%></td>
					<td><a href="<%=favorite.get("url")%>" target="_blank"><%=favorite.get("url")%></a></td>
					<td><a href="/db/favorite/delete?id=<%=favorite.get("id")%>">삭제</a></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>