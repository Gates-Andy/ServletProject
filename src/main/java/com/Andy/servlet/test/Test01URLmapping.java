package com.Andy.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test01URLmapping extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");

		PrintWriter out = response.getWriter(); // out 변수를 out.println("오늘의 날짜는 yyyy년 M월 dd일");
		Date now = new Date(); // out.println(now); //Fri Apr 25 17:31:07 KST 2025
		SimpleDateFormat formatter = new SimpleDateFormat("오늘의 날짜는 yyyy년 M월 dd일");

		String dateTimeString = formatter.format(now);
		out.println(dateTimeString);

	}
}
