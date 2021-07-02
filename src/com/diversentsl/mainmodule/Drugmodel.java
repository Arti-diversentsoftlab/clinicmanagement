package com.diversentsl.mainmodule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.diversentsl.bean.drugbean;
import com.diversentsl.util.connection1;

public class Drugmodel {
	public static  void createDrug() {
		Connection con=null;
		try {
			con=connection1.getconnection();
			//System.out.println("connection stablish.......");
			String qurey="create table Drugs(id int primary key ,drugNum varchar(70),drugName varchar(80),Drug_quantity varchar(60),doctorName varchar(50),patient_ID int,foreign key(patient_ID) references patient (id))";
			PreparedStatement stmt=con.prepareStatement(qurey);  
             int i=stmt.executeUpdate();
     		System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
		public static void addDrugs() throws SQLException {
			Scanner sc=new Scanner(System.in);
			Connection con=null;
			try {
				con=connection1.getconnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("connection stablish.......");
			System.out.println("Enter your id ,drugnumber,drugname,drugQuantity,doctorname patient id:");
			String query="insert into Drugs values(?,?,?,?,?,?)";
			int id=sc.nextInt();
			String D_num=sc.next();
			String D_name=sc.next();
			String D_quantity=sc.next();
		    String Doc_name=sc.next();
		    int p_id=sc.nextInt();
			PreparedStatement stmt=con.prepareStatement(query); 
			stmt.setInt(1,id);
			stmt.setString(2,D_num);
			stmt.setString(3,D_name);
			stmt.setString(4,D_quantity);
			stmt.setString(5,Doc_name);
			stmt.setInt(6,p_id);
			 int i=stmt.executeUpdate();
			System.out.println("rows effected:"+i);

		}
	/*	public static void update() {
System.out.println("whatever you want update in your data you can update it ,enter update value which you want update.");
try(Connection conn =connection1.getconnection());
		String query="UPDATE PATIENT SET patientName=?,patientAge=?,patientgender=?,disases=?,Address=?, WHERE ID=name";
        PreparedStatement stmt = conn.prepareStatement(query);
     {		      

		}
		
		*/
		public static void DrugInfo() throws SQLException {
			 drugbean bean=new drugbean();
			ArrayList<drugbean> list=new ArrayList<drugbean>();
			Scanner sc=new Scanner(System.in);
			Connection con=null;
			con=connection1.getconnection();
			System.out.println("Enter ID of drug ....");
			PreparedStatement stmt=con.prepareStatement("select*from Drugs where id=?"); 
			int id=sc.nextInt();
	        stmt.setInt(1,id);
		  ResultSet rs=stmt.executeQuery();
		 while(rs.next()){
				bean.setId(rs.getInt(1));
				bean.setDrugNum(rs.getString(2));
				bean.setDrugName(rs.getString(3));
				bean.setDrug_quantity(rs.getString(4));
				bean.setDoctorName(rs.getString(5));
		  }
		           list.add(bean);
		           System.out.println(list);
		  System.out.println("Drugs information......");

	        
			
		}

		public static void delete() throws SQLException {
			System.out.println("Enter the id of drug for deletetion:");
			Scanner sc1=new Scanner(System.in);
			int id=sc1.nextInt();
			Connection conn = null;
				try {
					conn = connection1.getconnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String query="DELETE FROM Drugs WHERE id=?";
				PreparedStatement pstmt = conn.prepareStatement(query);
				pstmt.setInt(1,id);
				 int i=pstmt.executeUpdate();
				 System.out.println("record deleted succesfully..");
				 System.out.println(i);
				pstmt.close();

			
	
		}




}
