package com.Andy.database.ex;

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

@WebServlet("/db/ex01")
public class Ex01Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// used_goods 테이블의 모든행을 조회해서 일부 데이터를 response에 담는다.

		response.setContentType("text/plain");

		PrintWriter out = response.getWriter();

		// 사용법 connector database 접속

		// 1. driver 설정 DriverManager 클래스에 regusterDriver라는 것이 스태틱 메서드로 존재함 등록하는 과

		try { // surround try and catch
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			// 접속에 필요한 정보
			// 접속 주소, 포트, 사용할 데이터 베이스 아래 파란줄
			String url = "jdbc:mysql://localhost:3306/andy";
			String username = "root";
			String password = "root";

			// 사용법
			Connection connection = DriverManager.getConnection(url, username, password); // 3가지 항목으로 접속하는

			String query = "SELECT * FROM `used_goods`";// workbench쿼리를 자바문자열로 다룬다

			// 쿼리 수행 : 접속 정보 기반 statement를 가져와야함 Connection connection = 으로 객체를 만듦
			Statement statement = connection.createStatement();
			// import는 import java.sql.Statement;
			ResultSet resultSet = statement.executeQuery(query); // 조회결과를 resultset에 다가 저장

			// iterator.hasNext() 와 비슷한 .next(); while 반복문
			while (resultSet.next()) {

				// 제목 : ~ 가격 : ~ 설명 : ~ 만 받아와서 response 에다가

				String title = resultSet.getString("title");
				int price = resultSet.getInt("price");
				String description = resultSet.getString("description");

				out.println("제목 : " + title + "가격 : " + price + "설명 : " + description);
			}

			statement.close();

			// insert
			query = "INSERT `used_goods`\r\n" + "(`sellerId`, `title`, `price`,`description`)\r\n" + "VALUE\r\n"
					+ "(3,'고양이 간식 팝니다', 5000, '저희 고양이가..');";

			statement = connection.createStatement();

			// INSERT, UPDATE, DELETE
			// 실행된 행의 개수 INT

			int count = statement.executeUpdate(query);
			out.print("실행 결과:" + count);
			statement.close();

			connection.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
