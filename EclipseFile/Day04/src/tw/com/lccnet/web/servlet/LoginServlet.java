package tw.com.lccnet.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String userpass = request.getParameter("userpass");
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		PrintWriter out = response.getWriter();
		
		
		String sql = "SELECT count(id) FROM USER WHERE USERNAME = ? AND USERPASS = ?";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql:///testdb1";
			String user = "root";
			String pass = "123456";
			conn=DriverManager.getConnection(url, user, pass);
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, userpass);
			
			rs=ps.executeQuery();
			
			if(rs.next()) {
				int count = rs.getInt(1);
				if(count>0) {
//					out.print("WELCOME"+username);
					request.getRequestDispatcher("index.html").forward(request, response);
				}else {
//					out.print("sorry"+username);
					response.sendRedirect("Login.html");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
