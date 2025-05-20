package com.Andy.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test05")
public class Test05GetMethodAndHTML1 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		int numberInt = Integer.parseInt(request.getParameter("number")); // webapp-servlet에 html 파일을 만들어 놓으면 클라이언트가 접근 할 수 있다. 폴더(servlet) 만들기 html파일 만들기 아래에 있음

		out.println("" + "<html>\n" + "	<head><title>구구단 링크</title></head>\n" + "	<body>\n");

		for (int i = 1; i <= 9; i++) {
			out.println("<li>" + numberInt + " X " + i + " = " + numberInt * i + "</li>\n");
		}

		out.println("" + "	</body>\n" + "</html>\n");
	}
}
