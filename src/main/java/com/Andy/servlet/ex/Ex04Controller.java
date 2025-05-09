package com.Andy.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex04")
public class Ex04Controller extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		
		int year = Integer.parseInt(birthday.substring(0,4)); // short cut 바로 넣어버려
		
		int age = 2025 - year + 1;
		
		out.println(""
				+ "<html>\n"
				+ "		<head><title>정보</title></head>"
				+ "		<body>\n");
		
		out.println(""
				+ "			<h3>이름 : " + name + "</h3>\n"
				+ "			<h3>나이 : " + age +  "</h3>\n");
		
		out.println(""
				+ "		</body>\n"
				+ "</html>\n"); // 먼저 만들어놓는 요령

	}
}
