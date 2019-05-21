package com.neuedu.dao;

import java.io.IOException;
import java.sql.*;

import static java.sql.DriverManager.*;

/**
 * UserDao实现类
 */
public class UserDaoImpl implements userdao {

    static
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    private static final String URL = "jdbc:mysql://localhost:3307/20190518";

    private static final String USERNAME = "root";

    private static final String PASSWORD = "mysqladmin";

    @Override
    public void regsiter(String user, String psw) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String sql = "INSERT INTO user(username,psw) VALUES (? ?) ";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user);
            pstmt.setString(2, psw);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (null != pstmt) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (null != conn) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}