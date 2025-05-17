package com.Andy.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MysqlService {

	
	private Connection connection; // jsp 안에서 쓸 내용들을 module화 하기 위한 클래스 첫번째로 맴버 변수를 만들어 봅시다. 맴버변수 connection

	// 클래스를 설게한 입장에서 해당 클래스의 객체가 두개이상 만들어지지 않도록 하나의 객체를 공유해서 사용하게 한다.

	// singleton pattern
	// static 변수 : 객체 생성 없이 사용할 수 있는 맴버변수 -> 메모리 사용이 많음
	private static MysqlService mysqlService = null;

	// 해당 클래스의 객체를 return 하는 메소드
	// static 메소드 : 객체 생성없이 사용할 수 있는 메서드 - > error
	// 객체 생성없이 수행되는 기능이기 떄문에 객체 생성을 통해서 만들어지는 맴버변수는 사용 불가능

	public static MysqlService getInstance() {

		if (mysqlService == null) {
			mysqlService = new MysqlService();
		}

		return mysqlService;
	}

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
	public List<Map<String, Object>> select(String query) {
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			// 근데 이것만 쓸게 아닌데 모듈화를 할 수가 없음!
			// 조회목록의 컬럼 목록 사용법 ResultSetMetaData rsmd = resultSet.getMetaData();

			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnCount = rsmd.getColumnCount();

			List<String> columnList = new ArrayList<>();

			for (int i = 1; i <= columnCount; i++) {
				columnList.add(rsmd.getColumnName(i));
			}

			List<Map<String, Object>> resultList = new ArrayList<>();

			// 하나의 행에서 컬럼 이름으로 모든 값 얻어 오기

			while (resultSet.next()) {

				Map<String, Object> row = new HashMap<>();

				for (String column : columnList) {
					Object value = resultSet.getObject(column);

					row.put(column, value);

				}

//				String name = resultSet.getString("name");
//				String email = resultSet.getString("email");
//				String introduce = resultSet.getString("introduce");
//
//				Map<String, Object> row = new HashMap<>();
//				row.put("name", name);
//				row.put("email", email);
//				row.put("introduce", introduce); 위에가 완서오디면 필요가 없어져버림 주석 또는 삭제

				resultList.add(row);

			} // --> map으로 구성해보자

			statement.close();
			return resultList;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// INSERT,UPDATE,DELETE
	public int update(String query) {
		
		Statement statement;
		
		try {
			statement = connection.createStatement();
			int count = statement.executeUpdate(query);
			statement.close();
			return count;
			
		} catch (SQLException e) {
			
			e.printStackTrace();	// error 발생 시 return 값
			
			return -1; // 0 이상의 정수가 나와야하는데 잘못됐다는 걸 알려야함
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
