package tw.com.lccnet.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tw.com.lccnet.web.dao.StudentDao;
import tw.com.lccnet.web.dao.impl.StudentDaoImpl;
import tw.com.lccnet.web.entity.Student;


@WebServlet("/lass")
public class ListAllStudentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDao dao=new StudentDaoImpl();
		List<Student> students=dao.getAll();
		
		request.setAttribute("students", students);
		request.getRequestDispatcher("student.jsp").forward(request, response);
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
