<%-- 
    Document   : ChinhSuaNLView
    Created on : Nov 17, 2025, 9:16:58 PM
    Author     : dangt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int idNL = Integer.parseInt(request.getParameter("id"));
    String nameNL = request.getParameter("name");
    int idLNL = Integer.parseInt(request.getParameter("loainguyenlieuID"));
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chỉnh sửa nguyên liệu view</title>
    </head>
    <body>
        <h1>Chỉnh sửa nguyên liệu</h1>
        <table border="1" cellpadding="2">
            <tr>
                <th>Tên nguyên liệu</th>
                <th><%=nameNL%></th>
            </tr>
            <tr>
                <th>Loại nguyên liệu</th>
                <th><%=idLNL%></th>
            </tr>
        </table>
    </body>
</html>
