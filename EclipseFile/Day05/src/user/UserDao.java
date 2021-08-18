package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDao {
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public UserDao() {
		
		try {
			String dbURL = "jdbc:mysql:///AJax";
			String dbID = "root";
			String dbPassword = "123456";
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public ArrayList<User> search(String userName){
		String sql = "select username, userage, usergender, useremail from AJax where username like ?";
		ArrayList<User> userList = new ArrayList<User>();
		
		try {
			ps = conn.prepareStatement(sql);
			// 上面的第一個問號
			ps.setString(1, userName);
			rs = ps.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setUserName(rs.getString(1));
				user.setUserAge(rs.getInt(2));
				user.setUserGender(rs.getString(3));
				user.setUserEmail(rs.getString(4));
				userList.add(user);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
}
