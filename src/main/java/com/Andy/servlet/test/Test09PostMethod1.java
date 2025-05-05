package com.Andy.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test09")
public class Test09PostMethod1 extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String self = request.getParameter("self");

		out.println("" + "<html>\n" + "<head><title>입사 지원</title></head>\n" + "<body>\n");

		out.println("" + name + "님 지원이 완료 되었습니다.\n" + "<hr>\n" + "<h5>" + "지원 내용" + "</h5>\n" + "<h5>" + self + "</h5>\n");

		out.println("</body>\n" + "</html>\n");
	}
}
