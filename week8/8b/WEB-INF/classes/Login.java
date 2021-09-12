import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class Login extends HttpServlet {  
  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("userName");  
    String p=request.getParameter("userPass");  
          
    if(p.equals("123")){  
        RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
        rd.forward(request, response);  
    }  
    
    else{  
        out.print("Sorry, UserName or Password Error!<br>"); 
        out.print("Because of this error, your request still remains in Servlet 1.<br>"); 
        RequestDispatcher rd=request.getRequestDispatcher("/index.html");             
        }  
    }  
  
}  