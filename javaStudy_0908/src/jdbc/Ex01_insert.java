package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex01_insert {
	public static void main(String[] args) {
		// JDBC 연결 순서 (step 4)
		// ojdbc6.jar 연동
		
		try {
			// 1. JDBC 동적 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. DB Connection
			// DB 접근 -> 번수 이용
			// url, id, pw : String
			// localhost = 127.0.0.1 <기본 IP>
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pw = "hr";

			Connection conn = DriverManager.getConnection(url, id, pw);
			
			/*
			 * if(conn != null) System.out.println("Success!"); else
			 * System.out.println("Fail...");
			 */
			
			// 3. DB sql문 작성, 전송
			// "id", "pw", "name", age
			// Connection 객체의 prepareStatement : 
			String sql = "insert into member values('hello','1234','누구','20')";
			PreparedStatement psmt = conn.prepareStatement(sql);
			int cnt = psmt.executeUpdate();
			System.out.println(cnt);
			
			if(cnt > 0) System.out.println("insert Success!!");
			else System.out.println("insert Failed...");
			
			// 4. DB Close
			if(psmt!= null)	psmt.close();
			if(conn!= null) conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("동적로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
		}
		
	}
}