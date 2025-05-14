package com.Andy.database.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/db/test01")
public class Test01Controller extends HttpServlet { // 요청 과 응답을

	@Override // 오버라이드를 위해 필요한 메서드
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");

		PrintWriter out = response.getWriter();

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			String url = "jdbc:mysql://localhost:3306/andy"; // 자바코드로 데이터 베이스 접속 먼저 -> 드라이버 매니저 먼저하셈 & try catch
			String username = "root";
			String password = "root";

			Connection connection = DriverManager.getConnection(url, username, password); // 인자 3개를 받아 메서드로 가져옴
																							// connection 클래스를 사용하는 객체

//			String query = "INSERT INTO `real_estate` \r\n"
//					+ "(`realtorId`, `address`,  `area`, `type`, `price`, `rentPrice`)\r\n"
//					+ "VALUE\r\n"
//					+ "(3,'헬라펠리스 101동 5305호', 350, '매매', 1500000);"; // 
//			
//			Statement statement = connection.createStatement();
//			
//			int count = statement.executeUpdate(query); // 쿼리 수행 하는거 자체가 의미를 가지는 
//			
//			out.print("실행 결과:" + count);

			String query = "SELECT * FROM `real_estate` ORDER BY `id` DESC LIMIT 10;";

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {

				String address = resultSet.getString("address");
				int area = resultSet.getInt("area");
				String type = resultSet.getString("type");

				out.println("매물 주소 : " + address + "면적 : " + area + "타입 : " + type);
			}

			statement.close();
			connection.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
