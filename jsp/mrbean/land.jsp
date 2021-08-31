<%@ page 
    language = "java" 
    import ="java.util.*, java.io.*"
    info = "Example of JSP"
%>

<html>

    <head>
        <style>
            .ao,.bo
            {
                text-align: center;
            }

            .bo
            {
                font-weight: bold;
            }     
        </style>
    </head>
    <body>
        
        <%
            int age =  Integer.parseInt(request.getParameter("age"));
            String name = request.getParameter("name");
        %>
        
        <div class="bo">Extracting values from the request sent by the form submission</div><br><br>
        <div class="ao"> The age you've entered in the form is : <span class="bo">
            <%=age%>
        </span></div>
        
        <div class="ao"> The name you've entered in the form is : <span class="bo">
            <%=name%>
        </span></div>
        
       

        <hr>

        <jsp:useBean id="c" class="p.customer" />

        <jsp:setProperty name="c" property="age" value="<%=age%>" />
        <jsp:setProperty name="c" property="name" value="<%=name%>" />
       

        <div class="bo">Extracting property values using JSP :getProperty</div><br><br>
        <div class="ao"> Your age is : <span class="bo">
            <jsp:getProperty name="c" property="age"/>
        </span></div>
        
        <div class="ao"> Your name is : <span class="bo">
            <jsp:getProperty name="c" property="name"/>
        </span></div>
        
        <div class="ao"> Your status is : <span class="bo">
            <jsp:getProperty name="c" property="status"/>
        </span></div>

        <hr>
        

        <div class="bo">Extracting values without the use of JSP :getProperty</div><br><br>
        <div class="ao"> Your age is : <span class="bo">
            <%=c.getAge()%>
        </span></div>
        
        <div class="ao"> Your name is : <span class="bo">
           <%=c.getName()%>
        </span></div>
        
        <div class="ao"> Your status is : <span class="bo">
            <%=c.getStatus()%>
        </span></div>

        <hr>

        <div class="bo">Customizing elements using if-else</div>
        <%
            if(c.getStatus()=="Ticket can be purchased. Proceed.")
            {
                out.println("<h2 style='color:green;text-align:center'>ACCEPTED</h2>");
            }

            else
            {
                out.println("<h2 style='color:red;text-align:center'>REJECTED</h2>");
            }
        %>
        <hr>

        <div class="bo">Using methods ( method body is empty so you won't see anything )</div>
        <%!
        void someMethod()
            {}
        %>

        <%someMethod();%>
        <hr>

         <div class="bo" bgcolor="amber">Implicit objects : "request"</div>
            The following information was received: 
            <ul> 
            <li>Request Method: <%= request.getMethod( ) %>
            <li>Request URI: <%= request.getRequestURI( ) %>
            <li>Request Protocol: <%= request.getProtocol( ) %>
            <li>Servlet Path: <%= request.getServletPath( ) %>
            <li>Query String: <%= request.getQueryString( ) %>
            <li>Server Name: <%= request.getServerName( ) %>
            <li>Server Port: <%= request.getServerPort( ) %>
            <li>Remote Address: <%= request.getRemoteAddr( ) %>
            <li>Remote Host: <%= request.getRemoteHost( ) %>
            <li>Browser Type: <%= request.getHeader("User-Agent") %>
            </ul>    
    </body>
</html>