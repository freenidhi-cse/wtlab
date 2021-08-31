<%@ page 
    language = "java" 
    import ="java.util.*, java.io.*"
    info = "Example of JSP"
%>

<html>
    <body>
        <%
        String str = "Kewl dude";
        String str2 = "Academy";
        %>

        <h1><%=str%></h1>
        <h4><%=str2%></h4>
        <h5><%
            out.println(new Date().toString());
            %></h5>
    </body>
</html>