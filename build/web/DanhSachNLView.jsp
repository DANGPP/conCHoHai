<%-- 
    Document   : DanhSachNLView
    Created on : Nov 14, 2025, 1:22:48 PM
    Author     : dangt
--%>

<%@page import="model.NguyenLieu"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Danh sách nguyên liệu</title>
    </head>
    <body>
        <h2>Danh sách nguyên liệu</h2>

        <button onclick="location.href = 'ThemNguyenLieuView.jsp'">Thêm mới</button>

        <form action="DoTimKiem.jsp" method="get">
            <label>Tên nguyên liệu:</label>
            <input type="text" name="tennguyenlieu" />
            <input type="submit" value="Tìm kiếm" />
        </form>

        <%
            List<NguyenLieu> lstNL = (List<NguyenLieu>) request.getAttribute("ListNL");
            if (lstNL != null && !lstNL.isEmpty()) {
        %>
        <table border="1" cellpadding="5">
            <tr>
                <th>ID</th>
                <th>Tên nguyên liệu</th>
                <th>Loại nguyên liệu</th>
                <th>Đơn vị</th>
                <th>Thao tác</th>
            </tr>
            <%
                for (NguyenLieu nl : lstNL) {
            %>
            <tr>
                <td><%= nl.getId()%></td>
                <td><%= nl.getName()%></td>
                <td><%= nl.getLoainguyenlieu().getName()%></td>
                <td><%= nl.getLoainguyenlieu().getDonvi()%></td>
                <td>
                    <button onclick="location.href = 'ChinhSuaNLView.jsp?id=<%= nl.getId() %>&name=<%= nl.getName()%>&loainguyenlieuID=<%= nl.getLoainguyenlieu().getId()%>'">Chỉnh sửa</button>
                    <button onclick="location.href = 'DoXoaNL.jsp?id=<%= nl.getId()%>'">Xóa</button>
                </td>
            </tr>
            <%
                }
            %>
        </table>
        <% }%>
    </body>
</html>
