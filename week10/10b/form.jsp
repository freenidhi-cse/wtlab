<html>
    <head>
        <title>Form</title>
    </head>

    <body>
        <form action="home.jsp" method="POST">
            <h3>Login Here.</h3>
            Username : <input type="text" name="username">
            <% out.println("<br><br>"); %>
            Password : <input type="text" name="password">
            <% out.println("<br><br>"); %>
            <input type="submit" value="Login">
        </form>
    </body>
</html>