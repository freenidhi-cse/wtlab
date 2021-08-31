<%@ page 
    language = "java" 
    import ="java.util.*, java.io.*"
    info = "Example of JSP"
%>

<html>
    <body>
        
        
        <%
        String str = "Nice Header 1";
        String str2 = "Nice Header 2";
        
        %>

        
        <h1><%=str+"nice sk"%></h1>
        <h4><%=str2%></h4>
        <h5 style="color:brown">All contents below this line have been imported from an external file.</h5>
        <%@ include file = "external_file.html"%>
        <h5><%
            out.println(new Date().toString());
            %></h5>
    </body>
</html>