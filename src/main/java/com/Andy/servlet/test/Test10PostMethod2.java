package com.Andy.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test10")
public class Test10PostMethod2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		String password = request.getParameter("password");

		out.println("" + "<html>\n" + "<head><title>로그인</title></head>\n" + "<body>\n");

		if (!userMap.get("id").equals(id)) {
			out.println("id가 일치하지 않습니다."); // 아이디를 usermap에서 키로서 가져와 그 키의 value 값을 request한 id와 비교한다.
		} else if (!userMap.get("password").equals(password)) { // 또한 비번도 비교한다 
			out.println("password가 일치하지 않습니다.");
		} else { // 이 모든 사항이 괜찮으면 로그인을 하며 이름정보와 환영하는 메세지를 보낸다.
			out.println("<h1>" + userMap.get("name") + "님 환영합니다.</h1>");
		}

		out.println("</body>\n" + "</html>\n");
	}

	// doPost 메소드 바깥쪽에 위치
//	private final Map<String, String> userMap = new HashMap<String, String>() {
//		{
//			put("id", "hagulu");
//			put("password", "asdf");
//			put("name", "김인규");
//		}
//	};
	private final Map<String, String> userMap = createUserMap();

	private Map<String, String> createUserMap() {
	    Map<String, String> map = new HashMap<>();
	    map.put("id", "AndyGates");
	    map.put("password", "qwer");
	    map.put("name", "신윤식");
	    return map;
	}
}
