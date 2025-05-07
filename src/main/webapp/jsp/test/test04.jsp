<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST Method 1</title>
</head>
<body>
	<%
	int num1 = Integer.parseInt(request.getParameter("number1"));
	int num2 = Integer.parseInt(request.getParameter("number2"));
	String calculator = request.getParameter("calculator");
	
	int result = 0;
	
	if (calculator.equals("+")) {
		result = num1 + num2; 
	} else if (calculator.equals("-")) {
		result = num1 - num2;
	} else if (calculator.equals("*")) {
		result = num1 * num2;
	} else if (calculator.equals("%")) {
		result = num1 / num2;
	} 
	%>
	
	<h3><%=result%></h3>

</body>
</html>