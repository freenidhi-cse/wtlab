import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class login extends HttpServlet
{
  public void doPost(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException
  {
	response.setContentType("text/html");
	String obtainedUsername = request.getParameter("uname");
	String obtainedPassword = request.getParameter("pass");
	PrintWriter out = response.getWriter();

	Cookie u1 = new Cookie("user1","us1");
	Cookie u2 = new Cookie("user2","us2");	
	Cookie u3 = new Cookie("user3","us3");
	Cookie u4 = new Cookie("user4","us4");

	Cookie p1 = new Cookie("pass1","pw1");
	Cookie p2 = new Cookie("pass2","pw2");
	Cookie p3 = new Cookie("pass3","pw3");
	Cookie p4 = new Cookie("pass4","pw4");
	
	int flag = 0;
	String u[] = {u1.getValue(),u2.getValue(),u3.getValue(),u4.getValue()};
	String p[] = {p1.getValue(),p2.getValue(),p3.getValue(),p4.getValue()};

	for(int i=0;i<4;i++)
	{
		if(u[i].equals(obtainedUsername)&&p[i].equals(obtainedPassword))
		{
			flag = 1;
		}
	}

	if(flag==1)
	{
		out.println("Login Successful. Welcome, "+obtainedUsername+" !");
	}

	else
	{
		out.println("Sorry, Authentication Failed.");
	}
}
}
	