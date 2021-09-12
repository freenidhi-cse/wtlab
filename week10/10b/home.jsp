<%@ page
language = "java"
import = "java.sql.*,java.io.*,java.util.*"
info = "Nice"
%>

<html>
    <head>
        <title>User Auth</title>
    </head>

    <body>
        <%

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String query = "select * from users where username='"+username+"' and password='"+password+"';";
        String a;


        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection c = DriverManager.getConnection("jdbc:ucanaccess://D:/nice.accdb");
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(query);

        if(rs.next())
            a = "<h2>"+"Welcome, "+username+" !"+"</h2>";
        else
            a = "<h2>"+"Invalid user credentials."+"</h2>";
        out.println(a);
        
        %>
    </body>
</html>