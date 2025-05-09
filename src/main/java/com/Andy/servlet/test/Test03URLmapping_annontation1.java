package com.Andy.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test03")
public class Test03URLmapping_annontation1 extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		Date now = new Date();

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/M/dd HH:mm:ss");

		String dateTimeString = formatter.format(now);

		out.println(dateTimeString); // 현 시각 출력 
		
		out.println(""				// 뉴스 기사 html 로 출력
				+ "<html>\n"
				+ "		<head><title>뉴스기사출력</title></head>\n"
				+ "		<body>\n"
				+ "			<h2>[단독] 고양이가 야옹해</h2>\n"
				+ "			<div>기사 입력시간 : " + dateTimeString + "</div>\n"
				+ "			<hr>\n"
				+ "			<div>끝</div>\n"
				+ "		</body>\n"
				+ "</html>\n");
	}
}
