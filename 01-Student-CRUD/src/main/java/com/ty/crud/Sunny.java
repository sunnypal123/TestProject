package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Sunny{

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/employee";
        String name = "postgres";
        String password = "root";

        try {
            Connection con = DriverManager.getConnection(url, name, password);
            System.out.println("Connection created");

            Statement stm = con.createStatement();

            String sql = "INSERT INTO employee VALUES (102,'suraj',70000,'thane')";
            int rows = stm.executeUpdate(sql);

            System.out.println("Rows inserted: " + rows);

            stm.close();
            con.close();
            System.out.println("Connection closed");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}