package com;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class CallingClassFromJsp {

    private static Connection connection = null;

    public static String toLowerCase(String data) {
        return data.toLowerCase();
    }

    public static List<Student> getStudent() throws SQLException {
        connection = createConnection();

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }

        return allStudent();
    }



    private static List<Student> allStudent() throws SQLException {
        PreparedStatement ps = connection.prepareStatement("select * from student");
     //  ps.setString(1,sex);
        ResultSet rs = ps.executeQuery();
        List<Student> students = new ArrayList<>();
        while (rs.next()) {
            System.out.println("name " + rs.getString(1) + " , last name: " + rs.getString(2)+ " , last name: " + rs.getString(2)+ " , sex: " + rs.getString(6));
            students.add(new Student(rs.getString(1), rs.getString(2), rs.getString(6)));
        }
        return students;
    }



    private static Connection createConnection() throws SQLException {
//        Connection connection = null;
//        System.out.println("-------- PostgreSQL JDBC Connection Testing ------------");
//        try {
//            //    Class.forName("org.postgresql.Driver");
//            connection = DriverManager.getConnection(
//                    "jdbc:postgresql://localhost:5432/test", "postgres",
//                    "postgres");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("Connection Failed! Check output console");
//            e.printStackTrace();
//        }
//        System.out.println("PostgreSQL JDBC Driver Registered!");
//        return connection;

        Driver drv = new org.postgresql.Driver();
        Properties p = new Properties();
        p.put("user", "postgres");
        p.put("password", "postgres");
        Connection con = drv.connect("jdbc:postgresql://localhost:5432/test", p);

        return con;
    }

}
