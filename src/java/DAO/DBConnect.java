package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    private static final String JDBC_URL = 
        "jdbc:mysql://localhost:3306/quanlynhahangdb?useUnicode=true&characterEncoding=utf8&useSSL=false";
    
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "Dang@211204";

    protected Connection conn; // cho phép DAO con dùng

    // Load driver
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println(">> MySQL JDBC Driver Loaded!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Constructor: tất cả DAO gọi để có connection
    public DBConnect() {
        try {
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            System.out.println(">> Connected to MySQL Database!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Hàm đóng kết nối
    public void close() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println(">> Connection closed!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

//    public static void main(String[] args) {
//        Connection testConn = DBConnect.getConnection();
//
//        String sql = "SELECT * FROM Staff";
//
//        try {
//            PreparedStatement ps = testConn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            System.out.println(">> Danh sách Staff:");
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String username = rs.getString("username");
//                String password = rs.getString("password");
//
//                System.out.println(
//                        "ID: " + id
//                        + ", Username: " + username
//                        + ", Password: " + password
//                );
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


