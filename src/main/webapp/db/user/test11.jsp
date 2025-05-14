<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.Andy.common.MysqlService"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>url 목록 창</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body>

	<%
	MysqlService mysqlService = new MysqlService();

	mysqlService.connect();
	%>
	
	<table class="table text-center">
		<thead>
			<tr>
				<td>사이트</td>
				<td>사이트 주소</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>인스타</td> <!-- name -->
				<td>www.instagram.com</td> <!-- url a태그 -->	
			</tr>
		</tbody>
	</table>
</body>
</html>