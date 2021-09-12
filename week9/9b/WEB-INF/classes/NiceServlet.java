import javax.servlet.*;
import java.io.*;
public class NiceServlet extends GenericServlet
{
   private String username1,username2,username3,username4;
   private String password1,password2,password3,password4;
   
   public void init(ServletConfig sc)
   {
     username1=sc.getInitParameter("username1");
     password1=sc.getInitParameter("password1");

     username2=sc.getInitParameter("username2");
     password2=sc.getInitParameter("password2");

     username3=sc.getInitParameter("username3");
     password3=sc.getInitParameter("password3");

     username4=sc.getInitParameter("username4");
     password4=sc.getInitParameter("password4");   
   }

   public void service(ServletRequest req,ServletResponse res)
   throws ServletException,IOException
  
   {
      res.setContentType("text/html");
      PrintWriter out=res.getWriter();
      String ou=req.getParameter("user");
      String op=req.getParameter("pwd");

      String u[] = {username1,username2,username3,username4};
      String p[] = {password1,password2,password3,password4};

      int flag = 0;

      for(int i=0;i<4;i++)
      {
          if(ou.equals(u[i])&&op.equals(p[i]))
            flag = 1;
      }
      
      if(flag==1)
        out.println("<h2>Authentication Successful. Welcome,"+ou+"! </h2>");
      else
         out.println("<h2>Wrong Password. Access Denied.</h2>");
  }
}