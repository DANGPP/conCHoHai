<%-- 
    Document   : DoTimKiem
    Created on : Nov 14, 2025, 1:30:02 PM
    Author     : dangt
--%>

<%@page import="DAO.DAONguyenLieu"%>
<%@page import="model.NguyenLieu"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String tenNguyenLieu = request.getParameter("tennguyenlieu");
    DAONguyenLieu  daoNL = new DAONguyenLieu();
    List<NguyenLieu> listNguyenLieu = daoNL.getNguyenLieu(tenNguyenLieu);
    request.setAttribute("ListNL", listNguyenLieu);
    
    RequestDispatcher rq = request.getRequestDispatcher("DanhSachNLView.jsp");
    rq.forward(request, response);
%>
