package com.Andy.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test08")
public class Test08GetMethodAndform2 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String keyword = request.getParameter("keyword");

		List<String> list = new ArrayList<>(Arrays.asList("강남역 최고 맛집 소개 합니다.", "오늘 기분 좋은 일이 있었네요.",
				"역시 맛집 데이트가 제일 좋네요.", "집에 가는 길에 동네 맛집 가서 안주 사갑니다.", "자축 저 오늘 생일 이에요."));

		out.println("" + "<html>\n" + "<head><title>맛집 검색</title></head>\n" + "<body>\n");

		for (String text : list) { // 향상된 for 문 list 리스트에서 text라는 문자열을 리스트 안 문자열들을 반복 저장
			if (text.contains(keyword)) { //파라미터로 받은 keyword라는 문자열을 text가 포함하는지 비교
				String newText = text.replace(keyword, "<b>" + keyword + "</b>"); //replace로 볼드체로바꾼 놈을 newText로 저장하여 
				out.println("" + "<div>" + newText + "</div><hr>"); 
			}
		}

		out.println("" + "</body>\n" + "</html>\n");

	}

}
