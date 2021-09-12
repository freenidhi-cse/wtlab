import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class FirstServlet extends HttpServlet {  
public void doGet(HttpServletRequest request, HttpServletResponse response){  
        try{  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        String n=request.getParameter("userName");  
        out.print("Welcome "+n+"<br>");  
        out.print("You are now in the first servlet.");

   
        out.print("<form action='servlet2'>");  
        out.print("<input type='hidden' name='uname' value='"+n+"'>");  
        out.print("<input type='submit' value='Go To The Second Servlet'>");  
        out.print("</form>");  
        out.close();  
  
                }catch(Exception e){System.out.println(e);}  
    }  
  
}  