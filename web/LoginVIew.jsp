<%-- 
    Document   : LoginVIew
    Created on : Nov 13, 2025, 3:14:38 PM
    Author     : dangt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LoginView</h1>
        <form action="DoLogin.jsp" method="POST">
            <label>Tên đăng nhập</label>
            <input type="text" name="username" required>
            
            <br>
            <br>
            <label>Mật khẩu</label>
            <input type="password" name="password" required>
            <br>
            <br>
            <button type="submit">Login</button>
        </form>
    </body>
</html>
