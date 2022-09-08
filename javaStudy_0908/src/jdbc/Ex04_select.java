package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex04_select {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			Connection conn = DriverManager.getConnection(url, db_id, db_pw);
			if(conn != null) System.out.println("Connection Success!");
			else System.out.println("Connection Failed...");
			
			String sql = "select * from member";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// CURD : Create, Update, Read, Delete
			// ExcuteUpdate : 테이블에 직접적으로 영향을 주는 insert, update, delete
			// -> return type : int
			// ExcuteQuery() : 테이블에 직접적으로 영향을 주지 않는 select
			// -> return type : ResultSet
			ResultSet rs = psmt.executeQuery();
			int index =  0;
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				System.out.printf("%d. %4s(%2d) -> id:%5s pw:%5s\n",++index, name, age, id, pw);
			}
			
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("StaticLoading Failed...");
		} catch (SQLException e) {
			System.out.println("Connection Failed");
		}
	}
}