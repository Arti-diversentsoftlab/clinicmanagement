package com.diversentsl.mainmodule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.diversentsl.bean.Appointmentbean;
import com.diversentsl.bean.patientbean;
import com.diversentsl.util.connection1;

public class appointmentmodel {
	public static void AppointmentInfo() throws SQLException {
		ArrayList<Appointmentbean> list=new ArrayList<Appointmentbean>();
		Appointmentbean bean=new Appointmentbean();
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		con=connection1.getconnection();
		System.out.println("Enter specialization of Dr  ....");
		PreparedStatement stmt=con.prepareStatement("select*from appointmentInfo where specialization=?"); 
		String spe=sc.next();
        stmt.setString(1,spe);
	  ResultSet rs=stmt.executeQuery();
	  while(rs.next()) {
		  bean.setId(rs.getInt(1));
		  bean.setDoctorName(rs.getString(2));
		  bean.setSpecialization(rs.getString(3));
		  bean.setContactNumber(rs.getInt(4));
		  bean.setFee(rs.getInt(5));
		  bean.setAddress(rs.getString(6));
		  bean.setTimeslot(rs.getString(7));
		  bean.setExperience(rs.getInt(8)); 
	  }
	  list.add(bean);
	  System.out.println("appoinment information......");
	  System.out.println(list);
	}
		public static void addappointment() throws SQLException {
			
			Scanner sc=new Scanner(System.in);
			Connection con=null;
			try {
				con=connection1.getconnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("connection stablish.......");
			System.out.println("Enter your doctor Id,name,specialization,contactnumber,fee,Address,timeslot,experience :");
			int id=sc.nextInt();
			String name=sc.next();
			String spe=sc.next();
			int connum=sc.nextInt();
			int fee=sc.nextInt();
			String Address=sc.next();
			String times=sc.next();
			int ex=sc.nextInt();
			String query="insert into appointmentInfo values(?,?,?,?,?,?,?,?)";
			PreparedStatement stmt=con.prepareStatement(query); 
			stmt.setInt(1,id);
			stmt.setString(2,name);
			stmt.setString(3,spe);
			stmt.setInt(4,connum);
			stmt.setInt(5,fee);
			stmt.setString(6,Address);
			stmt.setString(7,times);
			stmt.setInt(8,ex);
			 int i=stmt.executeUpdate();
			System.out.println("record addedd successfully......");

		}


}
