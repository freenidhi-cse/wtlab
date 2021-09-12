    import javax.servlet.http.*;  
    import javax.servlet.*;  
    import java.io.*;  
    public class nice extends HttpServlet{  
    public void doGet(HttpServletRequest req,HttpServletResponse res)  
    throws ServletException,IOException  
    {  
    res.setContentType("text/html"); 
    PrintWriter pw=res.getWriter();
      
    //writing html in the stream  
    pw.println("<html><body>");  
    pw.println("Welcome to this page.");  
    pw.println("</body></html>");  
      
    pw.close();//closing the stream  
    }}  