package tw.com.lccnet.demo;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo01
 */
@WebServlet(
		urlPatterns = { "/Demo01" }, 
		initParams = { 
				@WebInitParam(name = "name", value = "Tom"), 
				@WebInitParam(name = "Pass", value = "123456")
		},loadOnStartup = 1)
public class Demo01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	@Override
		public void init(ServletConfig config) throws ServletException {
		
			String name = config.getInitParameter("name");
			String pass = config.getInitParameter("Pass");
			System.out.println(name+":"+pass);
			String s = config.getServletContext().getInitParameter("jdbc");
			System.out.println(s);
		}
	
	
	
    public Demo01() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String myname = request.getParameter("user");
		System.out.println(myname);
		System.out.println("doGet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
	}

}
