package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.User;
import user.UserDao;

@WebServlet("/uss")
public class UserSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String userName = request.getParameter("username");

		response.getWriter().write(getJsonVal(userName));

	}

	public String getJsonVal(String userName) {
		
		if(userName==null) {
			userName="";
		}
		
		StringBuffer result = new StringBuffer();
		result.append("{\"result\":[");
		UserDao userDao = new UserDao();
		ArrayList<User> userList = userDao.search(userName);
		
		for(int i=0;i<userList.size();i++) {
			result.append("[{\"value\":\""+userList.get(i).getUserName()+"\"},");
			result.append(""+userList.get(i).getUserAge()+"\"},");
			result.append(""+userList.get(i).getUserGender()+"\"},");
			result.append(""+userList.get(i).getUserEmail()+"\"},");
		}
		
		
		
		
		result.append("]}");
		return result.toString();

	}

}
