package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/dbms_db";
		String username ="postgres";
		String password = "root";
		
		try {
			Class.forName(driver);
			System.out.println("driver loaded");
			
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("connection created");
			
			Statement stm = con.createStatement();
			System.out.println("statement create");
			
			String sql = "UPDATE student SET address = 'mankhurd' WHERE sid = 101";
			stm.execute(sql);
			con.close();
			System.out.println("updated version");
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
