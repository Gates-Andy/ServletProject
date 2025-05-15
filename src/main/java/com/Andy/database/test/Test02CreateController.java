package com.Andy.database.test;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Andy.common.MysqlService;

@WebServlet("/db/favorite/create")
public class Test02CreateController extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String name = request.getParameter("name");
		String url = request.getParameter("url");

		MysqlService mysqlService = MysqlService.getInstance(); // 싱글턴패턴 스태틱으로 객체를 생성하는게 아니라 얻어온다.
		
		mysqlService.connect();
		
		String query = "INSERT INTO `favorite`\r\n"
				+ "(`name`,`url`)\r\n" // , `createdAt`, `updatedAt` 생성 수정 시간은 어떻게 전달되는가?
				+ "VALUE\r\n"
				+ "('"+ name +"', '" + url +"');";
		
		int count = mysqlService.update(query);
		
		response.sendRedirect("/db/favorite/list.jsp");
	}
}
