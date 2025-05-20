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
		// 1-1. Character set : utf-8 응답 콘텐츠의 문자 인코딩 방식을 설정
		response.setCharacterEncoding("utf-8");

		// 1-2. 데이터 타입(ContentType) 응답의 콘텐츠 타입을 설정
		// MIME(Multipurpose Internet Mail Extensions) : 데이터의 타입을 구분하기 위한 정해진 문자열
		// ex) text/plain
		
		response.setContentType("text/plain"); //header에는 필수적 response 2개
		//response 객체는 HttpServletResponse 클래스의 인스턴스로 서블릿에서 클라이언트(보통 웹 브라우저)에게 응답을 보내는 역할을 함
		// 2. Response Body 결과물
		PrintWriter out = response.getWriter();
		out.println("Servlet Response!!"); //Servlet Response!!

		// 현재 날짜 시간을 보여주는 페이지
		Date now = new Date();
		out.println(now); //Tue May 20 00:15:51 KST 2025

		// Date 객체의 날짜 시간 정보를 원하는 규격의 날짜 시간 문자열로 만들기
		// 2025년 4월 25일 16:54:11
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 M월 d일 HH:mm:ss");

		String dateTimeString = formatter.format(now);
		out.println(dateTimeString); // 2025년 5월 20일 00:15:51

	}

}

//1. HttpServlet을 상속받는 이유:
//HttpServlet은 웹 애플리케이션에서 HTTP 요청을 처리하는 기본 클래스야. 이 클래스를 상속받는 이유는, HTTP 요청을 처리하는 기능을 제공하기 때문이야.
//
//왜 HttpServlet을 상속받을까?
//HttpServlet 클래스는 이미 HTTP 요청(GET, POST 등)을 처리하는 기본적인 메서드를 제공해.
//
//예를 들어, **doGet()**이나 doPost() 같은 메서드가 있는데, 이 메서드를 오버라이드하면 HTTP 요청을 처리하는 로직을 정의할 수 있어.
//
//서블릿은 **클라이언트(브라우저)**로부터 HTTP 요청을 받아 그에 대한 응답을 생성하는 역할을 하기 때문에, HttpServlet을 상속받는 것이 HTTP 요청을 처리하는 표준 방식이야.
//
//2. 오버라이드 하는 이유:
//HttpServlet 클래스를 상속받으면, 기본적으로 제공되는 **doGet()**이나 doPost() 메서드가 있는데, 이 메서드는 빈 메서드(아무 일도 하지 않는 메서드)야. 즉, 클라이언트가 GET 요청을 보낼 때, 기본적으로 아무 작업도 하지 않기 때문에, doGet() 메서드를 오버라이드해야 클라이언트의 요청에 대한 적절한 응답을 작성할 수 있어.
//
//왜 오버라이드 해야 할까?
//doGet() 메서드는 클라이언트가 GET 요청을 보냈을 때 실행되는 메서드야.
//
//예를 들어, 사용자가 웹 브라우저에서 URL을 입력해서 서버에 GET 요청을 보내면, doGet()이 실행돼서 그 요청에 대한 응답을 처리하게 돼.
//
//**doPost()**도 마찬가지로 POST 요청을 처리하는 메서드야. 하지만 여기서는 **doGet()**을 오버라이드하고 있으므로, GET 방식으로 들어오는 요청에 대한 응답을 처리하는 부분을 작성하는 거지.
//
//정리하면:
//HttpServlet을 상속받는 이유는 HTTP 요청을 처리하기 위해서야. HttpServlet 클래스는 HTTP 요청을 다룰 수 있는 기본 메서드를 제공하므로, 이를 상속받아서 웹 애플리케이션을 쉽게 구현할 수 있어.
//
//doGet() 메서드를 오버라이드하는 이유는, 클라이언트가 GET 요청을 보냈을 때 우리가 원하는 방식으로 응답을 처리하기 위해서야. doGet() 메서드는 기본적으로 빈 메서드이기 때문에 우리가 맞춤형 응답 로직을 작성하려면 오버라이드해서 그 안에 로직을 추가해야 해.

