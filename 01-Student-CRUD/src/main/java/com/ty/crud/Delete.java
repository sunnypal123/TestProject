package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
public static void main(String[] args) {
	String driver = "org.postgresql.Driver";
	String url = "jdbc:postgresql://localhost:5432/dbms_db";
	String username ="postgres";
	String password = "root";
	
	try {
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, username,password);
		
		
		Statement stm = con.createStatement();
		
		String sql = "DELETE FROM student WHERE sid = 101";
		System.out.println(stm.execute(sql));
		
		con.close();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
