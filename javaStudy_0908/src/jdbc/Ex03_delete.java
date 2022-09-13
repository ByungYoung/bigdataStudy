package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex03_delete {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pw = "hr";
			
			Connection conn = DriverManager.getConnection(url, id, pw);
			if(conn != null) System.out.println("Connection Success!");
			else System.out.println("Connection Failed...");
			
			String sql = "delete from member where id = 'by'";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			int cnt = psmt.executeUpdate();
			
			if(cnt > 0) System.out.println("Delete Success!");
			else System.out.println("Delete Failed...");
			
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("StaticLoading Failed...");
		} catch (SQLException e) {
			System.out.println("Connection Failed");
		}
	}
}