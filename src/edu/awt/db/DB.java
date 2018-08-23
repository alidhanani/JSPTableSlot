package edu.awt.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	public static Connection getConnetion(){
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3311/labs", "root", "root");
		} 
		catch (ClassNotFoundException e) {e.printStackTrace();} 
		catch (SQLException e) {e.printStackTrace();}	
		
		return conn;
	}
}
