<%-- 
    Document   : DoLogin
    Created on : Nov 13, 2025, 3:53:36 PM
    Author     : dangt
--%>

<%@page import="DAO.DAOManager"%>
<%@page import="model.Manager"%>
<%@page import="DAO.DAOStaff"%>
<%@page import="model.Staff"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
//    Staff staff = new Staff(username, password);
    DAOStaff daoStaff = new DAOStaff();
    Staff staff = daoStaff.checkLogin(username, password);
    if (staff != null) {
        if(staff.getRole().equals("admin")){
        DAOManager daoManager = new DAOManager();
        Manager manager = daoManager.getInfo(staff.getId());
        if (manager != null) {
            //call DAOManager để lấy info.
            session.setAttribute("user", manager);
            response.sendRedirect("ManagerHomeView.jsp");
        } else {
            response.sendRedirect("LoginVIew.jsp");
        }
    }
        
    }


%>