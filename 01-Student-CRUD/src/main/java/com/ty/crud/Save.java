package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Save {
	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/dbms_db";
		String username ="postgres";
		String password = "root";
		
		//step 1 load the driver;
		
		try {
			Class.forName(driver);
			
			System.out.println("driver loaded");
			
			
			//step 2: create a connection
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			System.out.println("connection created");
			
			
			//step 3 : create a statement
			
			Statement stm = con.createStatement();
			System.out.println("statement is created");
			
			String sql = "INSERT INTO student VALUES(103,'Vishnu','Vishnu@gmail.com','Chembur')";
			
			//step 4 execute the query
			
			
			System.out.println(stm.execute(sql));
			System.out.println("record is inserted");
			
			//step 5 close the connection
			
			con.close();
			System.out.println("connection is closed");

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
