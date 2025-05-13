package com.Andy.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlService {

	// jsp 안에서 쓸 내용들을 module화 하기 위한 클래스 첫번째로 맴버 변수를 만들어 봅시다. 맴버변수 connection
	private Connection connection;

	// 1. 데이터베이스 접속 기능
	public boolean connect() { // 접속 실패 성공을 가르기 위한 boolean
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url = "jdbc:mysql://localhost:3306/andy";
			String username = "root";
			String password = "root";
			connection = DriverManager.getConnection(url, username, password); // 지역 변수
		} catch (SQLException e) {
			e.printStackTrace();
			// 접속 실패 했을 때
			return false;
		}
		return true;
	}

	// 2. 쿼리 수행기능
	public ResultSet select(String query) {
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			return resultSet;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// 3. 데이터베이스 접속 끊기
	public boolean disconnect() {
		try {

			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
