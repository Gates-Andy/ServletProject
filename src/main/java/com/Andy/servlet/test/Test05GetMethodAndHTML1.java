package com.Andy.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test05")

public class Test05GetMethodAndHTML1 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String number = request.getParameter("number");
		int numberInt = Integer.parseInt(number);
		
		out.println(""
				+ "<html>\n"
				+ "	<head><title>구구단 링크</title></head>\n"
				+ "	<body>\n");
		
					for(int i = 1; i <=9 ; i++) {
						out.println("<li>" + numberInt + " X " + i + " = " + numberInt * i + "</li>\n" );
					}
					
		out.println(""		
				+ "	</body>\n"
				+ "</html>\n");
	}
}
