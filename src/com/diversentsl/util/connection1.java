package com.diversentsl.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection1 {
	public static Connection getconnection() throws SQLException {
		 {
			    Connection con = null;
			    String url = "jdbc:mysql://localhost:3307/clinicmanagement"; 
			    String username = "root";
			    String password = "root"; 
			    //System.out.println("In DBConnection.java class ");
			     
			           try {
					Class.forName("com.mysql.cj.jdbc.Driver");
						//System.out.println("class load....");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} //loading MySQL drivers. This differs for database servers 
			        con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
			       // System.out.println("Printing connection object "+con);
			    return  con; 
		
		
	}

}
}
