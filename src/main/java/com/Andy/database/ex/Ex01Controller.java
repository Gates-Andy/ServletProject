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
			
//			응답을 텍스트로 보내겠다는 설정이야. PrintWriter를 이용해서 사용자에게 결과를 보낼 수 있어.
			response.setContentType("text/plain");
			PrintWriter out = response.getWriter();
			
			// 사용법 connector database 접속
			
			// 1. driver 설정 DriverManager 클래스에 regusterDriver라는 것이 스태틱 메서드로 존재함 등록하는 과
			
			try {	// surround try and catch
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//				MySQL JDBC 드라이버를 등록해. JDBC 드라이버는 Java가 MySQL 데이터베이스와 연결할 수 있도록 도와줘.
				
				// 접속에 필요한 정보
				// 접속 주소, 포트, 사용할 데이터 베이스 아래 파란줄
				String url = "jdbc:mysql://localhost:3306/andy";
				String username = "root";
				String password = "root";
				
//				데이터베이스 접속 정보야. localhost: 내 컴퓨터 3306: MySQL 기본 포트 
//				andy: 사용할 데이터베이스 이름 host 사용자 이름과 비밀번호는 root로 설정돼 있음
				
			// 사용법	
				Connection connection = DriverManager.getConnection(url,username,password); // 3가지 항목으로 접속하는
//				데이터베이스에 실제로 접속하는 부분이야. 성공하면 connection 객체가 만들어져.
				
				String query = "SELECT * FROM `used_goods`";// workbench쿼리를 자바문자열로 다룬다
				
				// 쿼리 수행 : 접속 정보 기반 statement를 가져와야함 Connection connection = 으로 객체를 만듦
				Statement statement = connection.createStatement();
				// import는 import java.sql.Statement;
				ResultSet resultSet = statement.executeQuery(query); // 조회결과를 resultset에 다가 저장
				
//				used_goods 테이블에서 모든 데이터를 가져오는 쿼리야. statement는 이 쿼리를 실행하고, 결과는 resultSet에 담겨.
				
				// iterator.hasNext() 와 비슷한 .next(); while 반복문
				while(resultSet.next()){
				
				// 제목 : ~ 가격 : ~ 설명 : ~ 만 받아와서 response 에다가
				
				String title = resultSet.getString("title");
				int price = resultSet.getInt("price");
				String description = resultSet.getString("description");
				
				out.println("제목 : " + title + "가격 : " + price + "설명 : " + description);
				}
				
				
				statement.close();
				
				// insert 새로운 데이터를 used_goods 테이블에 추가하는 쿼리야. executeUpdate는 실행된 행의 수를 반환해. (여기선 1이 나올 가능성이 높아)
				query = "INSERT `used_goods`\r\n"
						+ "(`sellerId`, `title`, `price`,`description`)\r\n"
						+ "VALUES\r\n"
						+ "(3,'고양이 간식 팝니다', 5000, '저희 고양이가..');";
				
				statement = connection.createStatement();
				
				// INSERT, UPDATE, DELETE
				// 실행된 행의 개수 INT
				
				int count = statement.executeUpdate(query);
				out.print("실행 결과:" + count);
				
//				자원 정리
				statement.close();
				connection.close();
				
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			

		}
}

//✅ 설명 정리 (다듬은 버전)
//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//→ JDBC 드라이버를 등록하여 Java(Eclipse)와 MySQL 데이터베이스를 연결할 수 있도록 설정합니다.
//
//데이터베이스에 접속하기 위해 URL, 사용자 이름(username), 비밀번호(password)를 변수로 선언합니다.
//이 정보들을 사용해 Connection 객체를 생성합니다.
//
//Connection 객체를 기반으로 Statement 객체를 만들고,
//ResultSet 객체를 통해 SQL SELECT 쿼리의 결과를 받아옵니다.
//
//SQL 쿼리는 String query = "SELECT * FROM used_goods"; 와 같이 문자열로 작성합니다.
//statement.executeQuery(query);를 사용해 쿼리를 실행하고 결과를 ResultSet에 저장합니다.
//
//while(resultSet.next()) 반복문을 사용하여 결과 집합을 한 줄씩 읽습니다.
//이때 getString(...), getInt(...) 등을 사용해 각 컬럼의 값을 읽어 출력합니다.
//반복문은 더 이상 읽을 데이터가 없을 때(next()가 false가 될 때) 종료됩니다.
//
//데이터 누수(리소스 낭비)를 방지하기 위해 모든 작업이 끝난 뒤 statement.close() 와 connection.close()로 자원을 정리합니다.
//
//이후에는 INSERT INTO 쿼리를 이용하여 새로운 데이터를 used_goods 테이블에 추가할 수 있습니다.
//이때는 executeUpdate(query)를 사용하며, 성공 시 몇 행이 추가되었는지를 반환합니다.
