<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST Method 1</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>
	<%
          int num1 = Integer.parseInt(request.getParameter("number1"));
    int num2 = Integer.parseInt(request.getParameter("number2"));
	%>
	
	<div class="container">
		<form method="post">

			<input type="text" name="number1"> 
			<select name="calculator">
				<option value="+">+</option>
				<option value="-">-</option>
				<option value="*">×</option>
				<option value="%">%</option>
			</select> <input type="text" name="number2">

			<button type="submit">계산</button>

		</form>
	</div>

</body>
</html>