<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.Andy.common.MysqlService"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 리스트</title>
</head>
<body>

	<%
	MysqlService mysqlService = new MysqlService();

	mysqlService.connect();

	List<Map<String, Object>> userList = mysqlService.select("SELECT * FROM `new_user`;");
	
	mysqlService.disconnect();
	%>
	
	<%= userList %>
	
	<table border="1">
		<thead>
			<tr>
				<th>이름</th>
				<th>이메일</th>
				<th>자기소개</th>
			</tr>
		</thead>
		<tbody>

			<%
			for (Map<String, Object> user : userList) {
			%>
			<tr>
				<td><%=user.get("name")%></td>
				<td><%=user.get("email")%></td>
				<td><%=user.get("introduce")%></td>
			</tr>
			<%
			}
			%>
			
		</tbody>
	</table>
</body>
</html>