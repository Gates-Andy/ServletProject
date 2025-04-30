package com.Andy.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex01Controller extends HttpServlet {

	@Override // 응답을 만들기 위한 response 객체를 먼저 만들자
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// 1. Response Header 결과물에 대한 정보 설정

		// 1-1. Character set : utf-8
		response.setCharacterEncoding("utf-8");

		// 1-2. 데이터 타입(ContentType)
		// MIME : 데이터의 타입을 구분하기 위한 정해진 문자열
		response.setContentType("text/plain"); // header에는 필수적 response 2개

		// 2. Response Body 결과물
		PrintWriter out = response.getWriter();
		out.println("Servlet Response!!");

		// 현재 날짜 시간을 보여주는 페이지
		Date now = new Date();

		out.println(now);

		// Date 객체의 날짜 시간 정보를 원하는 규격의 날짜 시간 문자열로 만들기
		// 2025년 4월 25일 16:54:11
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 M월 d일 HH:mm:ss");

		String dateTimeString = formatter.format(now);
		out.println(dateTimeString);

	}

}
