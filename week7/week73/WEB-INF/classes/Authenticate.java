import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*; 
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Authenticate extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 	throws ServletException, IOException {
		String username = request.getParameter("txtuser");
		String password = request.getParameter("txtpass");
		response.setContentType("text/html"); 
    			PrintWriter pw=response.getWriter();
    		pw.println("<html><body>");  
    		pw.println(username);  
			pw.println(password);  
    		pw.println("</body></html>");  
		
	}
}