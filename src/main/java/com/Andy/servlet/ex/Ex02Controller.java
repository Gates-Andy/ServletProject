package com.Andy.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex02") // 정해진이름은 없음 지정하고 싶은 path
public class Ex02Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// 1 ~ 10 까지 합을 보여주는 html 문서를 만들어보자 "text/plain" 이 아님 "text/html"
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}

		out.println("" + "<html>\n" + "		<head><title>합계</title></head>\n" + " 	<body>\n" + " 		<h2> 합계 : "
				+ sum + "</h2>\n" + "		<body2>\n" + "</html>");
	}
}
