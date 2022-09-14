package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.memberVO;

public class DAO {
	// DAO : Data Access Object <데이터 접근을 위한 객체>
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	// Connection
	private void getConnection() {
		// 1. driver 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String dbId = "hr";
			String dbPw = "hr";

			conn = DriverManager.getConnection(url, dbId, dbPw);

			if (conn != null)
				System.out.println("Connection Success!");
			else
				System.out.println("Connection Failed...");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int insert(String id, String pw, String name, String nick) {
		int cnt = 0;
		try {
			getConnection();
			String sql = "INSERT INTO memberInfo values (?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, nick);
			cnt = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	public int update(String id, String nick) {
		int cnt = 0;
		try {
			getConnection();
			String sql = "UPDATE memberInfo SET nick = ? where id = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, nick);
			psmt.setString(2, id);
			cnt = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	public int delete(String id) {
		int cnt = 0;
		try {
			getConnection();
			String sql = "DELETE FROM memberInfo WHERE id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			cnt = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	public memberVO selectOne(String id2) {
		memberVO vo = null;
		 try {
			getConnection();
			String sql = "select * from memberInfo where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id2);
			rs = psmt.executeQuery();
			if (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String nick = rs.getString(4);
				vo = new memberVO(id, pw, name, nick);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}

	public ArrayList<memberVO> select() {
		ArrayList<memberVO> list = new ArrayList<memberVO>();
		try {
			getConnection();
			String sql = "select * from memberInfo";
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String nick = rs.getString(4);
				
				memberVO vo = new memberVO(id, pw, name, nick);
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
}