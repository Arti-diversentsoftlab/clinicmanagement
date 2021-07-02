package com.diversentsl.mainmodule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.diversentsl.util.connection1;

public class LabTestModel {
	public static  void createLabTest() {
		Connection con=null;
		try {
			con=connection1.getconnection();
			//System.out.println("connection stablish.......");
			String qurey="create table LabTest(id int primary key,Test varchar(50),Testcost long,patient_ID int ,foreign key (patient_ID) references patient(id))";
			PreparedStatement stmt=con.prepareStatement(qurey);  
             int i=stmt.executeUpdate();
     		System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
		public static void addTest() throws SQLException {
			Scanner sc=new Scanner(System.in);
			Connection con=null;
			try {
				con=connection1.getconnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("connection stablish.......");
			System.out.println("enter id ,test,testcost,patient id:");
			String query="insert into LabTest values(?,?,?,?,?)";
			int id=sc.nextInt();
			String test=sc.next();
			long testcost=sc.nextLong();
			int p_id=sc.nextInt();
			PreparedStatement stmt=con.prepareStatement(query); 
			stmt.setInt(1,id);
			stmt.setString(2,test);
			stmt.setLong(3,testcost);
			stmt.setInt(4,p_id);
			 int i=stmt.executeUpdate();
			System.out.println("add successfully....");

		}
	/*	public static void update() {
System.out.println("whatever you want update in your data you can update it ,enter update value which you want update.");
try(Connection conn =connection1.getconnection());
		String query="UPDATE PATIENT SET patientName=?,patientAge=?,patientgender=?,disases=?,Address=?, WHERE ID=name";
        PreparedStatement stmt = conn.prepareStatement(query);
     {		      

		}
		
		*/
		
		public static void delete() throws SQLException {
			System.out.println("Enter the id of test for deletetion:");
			Scanner sc1=new Scanner(System.in);
			int id=sc1.nextInt();
			Connection conn = null;
				try {
					conn = connection1.getconnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String query="DELETE FROM LabTest WHERE id=?";
				PreparedStatement pstmt = conn.prepareStatement(query);
				pstmt.setInt(1,id);
				 int i=pstmt.executeUpdate();
				 System.out.println("record deleted succesfully..");
				 System.out.println(i);
				pstmt.close();

			
	
		}





}
