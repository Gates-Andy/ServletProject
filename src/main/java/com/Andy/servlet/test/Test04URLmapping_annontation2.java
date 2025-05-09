package com.Andy.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test04")
public class Test04URLmapping_annontation2 extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println(""
				+ "<html>\n"
				+ "		<head><title>리스트 출력</title></head>\n"
				+ "		<body>\n"
				+ "			<ul>\n"); // 끊어주기 for 문을 사용하기 위하여
		
		for (int i = 1; i <= 30; i++) {
			out.println("<li>" + i + "번째 리스트</li>\n");
		}
		
		out.println(""
				+ "			</ul>\n"
				+ "		</body>\n"
				+ "</html>\n");
		
	}
}
