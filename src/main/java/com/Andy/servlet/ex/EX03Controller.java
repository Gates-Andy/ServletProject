package com.Andy.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex03")
public class EX03Controller extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 이름과 생년월일을 전달받고,
		// 이름과 나이를 html 로 구성
		
		// 데이터만 필요하면 이름과 나이만을 정보만 전달
		response.setCharacterEncoding("utf-8");
		// response.setContentType("text/html");
		response.setContentType("application/json"); // JSON 형식으로 응답 출력
		
		PrintWriter out = response.getWriter();
		
		// 이름과 생년월일을 전달 받는다.
		// request 에서 name 이라는 이름으로 값을 꺼내 쓸거니 채우세요.
		// request 에서 birthday 이라는 이름으로 20041211 형식으로 값을 꺼내 쓸거니 채우세요.
		// 기능을 만드는쪽에서 사용법을 정한다
		
		// http://localhost:8080/servlet/ex03?name=신윤식&birthday=19950809 해야하는데 원래는
		// webapp-servlet에 html 파일을 만들어 놓으면 클라이언트가 접근 할 수 있다. 폴더(servlet) 만들기 html파일 만들기 아래에 있음
		
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		
		String yearString = birthday.substring(0,4);
		int year = Integer.parseInt(yearString);
		int age = 2025 - year + 1;
		
		// 김인규, 31
		// 데이터를 전달하기 위한 문자열 규격 - JSON(JavaScriptObjectNotation)
		// {key,value} - {"name":"김인규", "age":"31"}
		// ["abc","def","ghi"]
		out.println("{\"name\":\"" + name + "\", \"age\":" + age +"}"); //eclipse 복사 붙여넣기, name age 수정
//		out.println(""
//				+ "<html>\n"
//				+ "		<head><title>정보</title></head>\n"
//				+ "		<body>\n"
//				+ "			<h3>이름 : " + name + "<h3>\n"
//				+ "			<h3>나이 : " + age + "</h3>\n"
//				+ "		</body>\n"
//				+ "</html>\n");
	}
}
