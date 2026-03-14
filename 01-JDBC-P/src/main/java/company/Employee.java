package company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employee {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/employee";
        String name = "postgres";
        String password = "root";

        try {
            Connection con = DriverManager.getConnection(url, name, password);
            System.out.println("Connection created");

            Statement stm = con.createStatement();

            //String sql = "UPDATE employee SET location = 'mankhurd' WHERE id=101)";
            String sql = "UPDATE employee SET location = 'mankhurd' WHERE id = 101";
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