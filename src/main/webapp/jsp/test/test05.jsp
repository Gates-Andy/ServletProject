<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Post method 2</title>
</head>
<body>
	<%
	int cm = Integer.parseInt(request.getParameter("cm"));
	
	String[] units = request.getParameterValues("unit");
	
	String result = "";
	
	for(int i = 0; i < units.length; i++){
		if(units[i].equals("inch")){
			double inch = cm * 0.3937;
			result += inch + "in<br>";
		} else if(units[i].equals("yard")){
			double yard = cm * 0.01094;
			result += yard + "yd<br>";
		} else if(units[i].equals("feet")){
			double feet = cm * 0.03281;
			result += feet + "ft<br>";
		} else {
			double meter = cm * 0.01;
			result += meter + "m<br>";
		}
	}
	%>
	
	<div class=container>
		<h2>변환 결과</h2>
		<h3><%= cm %>cm</h3>
		<hr>
		<h3>
			<%= result %>
		</h3>
	</div>
	
</body>
</html>