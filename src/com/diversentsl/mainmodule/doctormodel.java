package com.diversentsl.mainmodule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.diversentsl.bean.doctorbean;
import com.diversentsl.bean.patientbean;
import com.diversentsl.util.connection1;

public class doctormodel {
	public static  void createdoctor() {
		Connection con=null;
		try {
			con=connection1.getconnection();
			//System.out.println("connection stablish.......");
			String qurey="create table doctor(id int,Doctorname varchar(50),fee int,specialization varchar(50),degree varchar(50))";
			PreparedStatement stmt=con.prepareStatement(qurey);  
             int i=stmt.executeUpdate();
     		System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
	public static void DoctorInfo() throws SQLException {
		ArrayList<doctorbean> list=new ArrayList<doctorbean>();
		doctorbean bean=new doctorbean();
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		con=connection1.getconnection();
		System.out.println("Enter ID of Doctor ....");
		PreparedStatement stmt=con.prepareStatement("select*from doctor where id=?"); 
		int id=sc.nextInt();
        stmt.setInt(1,id);
	  ResultSet rs=stmt.executeQuery();
	  while(rs.next()) {
		  bean.setId(rs.getInt(1));
		  bean.setDoctorname(rs.getString(2));
		  bean.setFee(rs.getInt(3));
		  bean.setSpecialization(rs.getString(4));
		  bean.setDegree(rs.getString(5));
	  }
	  list.add(bean);
	  System.out.println("doctor information......");
	  System.out.println(list);
	}

		public static void addDoctor() throws SQLException {
			Scanner sc=new Scanner(System.in);
			Connection con=null;
			try {
				con=connection1.getconnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("connection stablish.......");
			System.out.println("Enter your Id, name,fee,specialozation,degree respectively:");
			int id=sc.nextInt();
			String name=sc.next();
			int fee=sc.nextInt();
			String specialization=sc.next();
			String degree=sc.next();
			String query="insert into doctor values(?,?,?,?,?)";
			PreparedStatement stmt=con.prepareStatement(query); 
			stmt.setInt(1,id);
			stmt.setString(2,name);
			stmt.setInt(3,fee);
			stmt.setString(4,specialization);
			stmt.setString(5,degree);
			 int i=stmt.executeUpdate();
			System.out.println("record addedd successfully.....");

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
			System.out.println("Enter the ID of doctor:");
			Scanner sc1=new Scanner(System.in);
			int id=sc1.nextInt();
			Connection conn = null;
				try {
					conn = connection1.getconnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String query="DELETE FROM doctor WHERE id=?";
				PreparedStatement pstmt = conn.prepareStatement(query);
				pstmt.setInt(1,id);
				 int i=pstmt.executeUpdate();
				 System.out.println("record deleted succesfully..");
				 System.out.println(i);
				pstmt.close();

			
	
		}


}
