package com.Andy.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test02URLmapping extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");

		PrintWriter out = response.getWriter();
		Date now = new Date();
//		out.println(now);

		SimpleDateFormat formatter = new SimpleDateFormat("현재 시간은 HH시 mm분 ss초 입니다.");
		String dateTimeString = formatter.format(now);
		out.println(dateTimeString);
	}
}
