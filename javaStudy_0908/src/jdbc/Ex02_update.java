package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex02_update {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pw = "hr";
			
			Connection conn = DriverManager.getConnection(url, id, pw);
			if(conn != null) System.out.println("Connection Success!");
			else System.out.println("Connection Failed...");
			
			String sql = "Update memberInfo set pw = ? where id = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "0000");
			psmt.setString(2, "admin");
			
			int cnt = psmt.executeUpdate();
			
			if(cnt > 0) System.out.println("Update Success!");
			else System.out.println("Update Failed...");
			
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("StaticLoading Failed...");
		} catch (SQLException e) {
			System.out.println("Connection Failed");
		}
	}
}