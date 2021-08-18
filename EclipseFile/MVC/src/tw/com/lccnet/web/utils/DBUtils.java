package tw.com.lccnet.web.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	private static Connection conn = null;

	private DBUtils() {
		try {
			String URL = "jdbc:mysql://localhost:3306/mvc";
			String ID = "root";
			String PASS = "123456";
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(URL, ID, PASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static DBUtils getDBUtils() {
		return new DBUtils();
	}
	
	
	public  Connection getConnection() {
		return conn;
	}

	public  void getClose(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public   void getClose(PreparedStatement ps) {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public  void getClose(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public  void getClose(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
