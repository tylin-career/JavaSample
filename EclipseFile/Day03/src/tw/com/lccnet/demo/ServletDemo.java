package tw.com.lccnet.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletone")
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletDemo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Enumeration<String> enu = request.getParameterNames();
//		while(enu.hasMoreElements()) {
//			String name = enu.nextElement();
//			String values = request.getParameter(name);
//			System.out.println(name+":"+values);
//		}
//		
//		Map<String, String[]> map = request.getParameterMap();
//		for(Map.Entry<String, String[]> entry:map.entrySet()) {
//			System.out.println(entry.getKey()+":"+entry.getValue());
//		}
		
		
		response.setContentType("application/pdf");
		PrintWriter out = response.getWriter();
		out.print("hehehexD");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	
}
