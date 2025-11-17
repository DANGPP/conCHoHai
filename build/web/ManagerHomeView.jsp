<%-- 
    Document   : ManagerHomeView
    Created on : Nov 13, 2025, 9:53:54 PM
    Author     : dangt
--%>

<%@page import="model.Manager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Manager mng = (Manager) session.getAttribute("user");
    if (mng == null) {
        response.sendRedirect("LoginVIew.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang quản lý</title>
    </head>
    <body>
        <h1>MANAGER HOME VIEW</h1>
        <h2>Người dùng: <%=mng.getName()%> </h2>
        <br>
        <br>
        <button onclick="location.href = 'DanhSachNLView.jsp'">
            Quản lý nguyên liệu
        </button>
        <br>
        <br>
        <button onclick="location.href = 'TKNLTieuThu.jsp'">
            Thống kê nguyên liệu theo mục tiêu thu
        </button>
        <br>
        <br>
        <button onclick="location.href = 'LoginView.jsp'">
            Đăng xuất
        </button>
    </body>
</html>
