package com.diversentsl.mainmodule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.diversentsl.bean.patientbean;
import com.diversentsl.util.connection1;

public class patientmodel {
	
	public static  void createpatient() {
		Connection con=null;
		try {
			con=connection1.getconnection();
			//System.out.println("connection stablish.......");
			PreparedStatement stmt=con.prepareStatement("create table patient( id int,patientName varchar(50),patientAge int ,patientGender varchar(20),disease varchar(100),Address varchar(200))");  
             int i=stmt.executeUpdate();
     		System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
	public static void patientInfo() throws SQLException {
		ArrayList<patientbean> list=new ArrayList<patientbean>();
		patientbean bean=new patientbean();
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		con=connection1.getconnection();
		System.out.println("Enter ID of patient ....");
		PreparedStatement stmt=con.prepareStatement("select *from patient where id=?"); 
		int id=sc.nextInt();
        stmt.setInt(1,id);
	  ResultSet rs=stmt.executeQuery();
	  while(rs.next()) {
		  bean.setId(rs.getInt(1));
		  bean.setPatientName(rs.getString(2));
		  bean.setPatientAge(rs.getInt(3));
		  bean.setPatientGender(rs.getString(4));
		  bean.setDisease(rs.getString(5));
		  bean.setAddress(rs.getString(6)); 
	  }
	  list.add(bean);
	  System.out.println("patient information......");
	  System.out.println(list);
	}
		public static void addpatient() throws SQLException {
			
			Scanner sc=new Scanner(System.in);
			Connection con=null;
			try {
				con=connection1.getconnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("connection stablish.......");
			System.out.println("Enter your name,age,gender,disease,address in same sequence manner:");
			int id=sc.nextInt();
			String name=sc.next();
			int age=sc.nextInt();
			String gender=sc.next();
			String disease=sc.next();
			String Address=sc.next();
			String query="insert into patient values(?,?,?,?,?,?)";
			PreparedStatement stmt=con.prepareStatement(query); 
			stmt.setInt(1,id);
			stmt.setString(2,name);
			stmt.setInt(3,age);
			stmt.setString(4,gender);
			stmt.setString(5,disease);
			stmt.setString(6,Address);
			 int i=stmt.executeUpdate();
			System.out.println("record addedd successfully......");

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
			System.out.println("Enter the ID of patient :");
			Scanner sc1=new Scanner(System.in);		
			Connection conn = null;
				try {
					conn = connection1.getconnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String na=sc1.next();
				PreparedStatement pstmt = conn.prepareStatement("delete from patient where id=?");
				int ID=sc1.nextInt();
				pstmt.setInt(1,ID);
				 int i=pstmt.executeUpdate();
				 System.out.println("record deleted succesfully..");
				 System.out.println(i);
				pstmt.close();

		
	
		}
}
