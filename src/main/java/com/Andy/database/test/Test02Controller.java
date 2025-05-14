package com.Andy.database.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Andy.common.MysqlService;

@WebServlet("/db/user/test11")
public class Test02Controller extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String url = request.getParameter("url");

		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		String query = "INSERT INTO `new_user`\r\n" 
						+ "(`name`, `url`)\r\n" 
						+ "value\r\n" 
						+ "('" + name + "', '" + url + "')";

		response.sendRedirect("/db/user/test11.jsp");
	}
}
