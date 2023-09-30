package com.quancm.baitapbuoi2.dao;

import com.quancm.baitapbuoi2.model.User;

import java.sql.*;

public class UserDao {

    public boolean validate(User user) throws ClassNotFoundException {
        boolean result = false;

        Class.forName("com.mysql.jdbc.Driver");

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/baitapbuoihai", "root", "123456");

            PreparedStatement preparedStatement = connection.prepareStatement("select * from userTbl where username = ? and password = ?");

            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());


            ResultSet rs = preparedStatement.executeQuery();
            result = rs.next();

        } catch (SQLException e) {
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}