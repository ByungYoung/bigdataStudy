package javaStudy_0914;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class controller {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String dbId = "hr";
			String dbPw = "hr";

			conn = DriverManager.getConnection(url, dbId, dbPw);

			if (conn != null)
				System.out.println("Connection Success");
			else
				System.out.println("Connection Failed");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
		} catch (SQLException e) {
			System.out.println("SQL not found");
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
		} catch (Exception e) {
			System.out.println("Disclosed");
		}
	}

	public int insert(String name, int age, String address, String phonenum) {
		int cnt = 0;
		try {
			getConnection();
			String sql = "insert into memberTable values (?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, name);
			psmt.setInt(2, age);
			psmt.setString(3, address);
			psmt.setString(4, phonenum);
			cnt = psmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("Insert Failed");
		} finally {
			close();
		}
		return cnt;
	}

	public int delete(String name) {
		int cnt = 0;
		try {
			getConnection();
			String sql = "delete from memberTable where name = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, name);
			cnt = psmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("Delete Failed");
		} finally {
			close();
		}
		return cnt;
	}

	public int update(String name, int age) {
		int cnt = 0;
		try {
			getConnection();
			String sql = "update memberTable set age = ? where name = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, age);
			psmt.setString(2, name);
			cnt = psmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("Update Failed");
		} finally {
			close();
		}
		return cnt;
	}

	public ArrayList<model> select() {
		ArrayList<model> list = new ArrayList<model>();
		try {
			getConnection();
			String sql = "select * from memberTable";
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString(1);
				int age = rs.getInt(2);
				String address = rs.getString(3);
				String phonenum = rs.getString(4);

				model vo = new model(name, age, address, phonenum);
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