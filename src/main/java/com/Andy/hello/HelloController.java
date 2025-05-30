package com.Andy.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController extends HttpServlet {
	
	//	HttpServlet을 상속했기 때문에 Serializable 인터페이스도 암묵적으로 구현된 상태입니다.
	//	Java는 Serializable 클래스에 대해 serialVersionUID를 명시적으로 선언하라고 경고할 수 있습니다.
	private static final long serialVersionUID = 1L;
	
	// 메인 함수는 필요가 없다.
	// extends HttpServlet ctrl shift o 상속

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// doGet(파라미터 2개 리퀘스트 그리고 리스폰스) ctrl shift o , 대소문자 그리고 오타까지 확인
		// getWriter 메소드 호출 PrintWriter 객체 리턴 out 이라는 변수에 저장

		PrintWriter out = response.getWriter();

		out.println("Hello,World!");
		// localhost:8080/hello
	}
}