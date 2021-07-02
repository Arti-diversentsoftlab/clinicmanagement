package com.diversentsl.mainmodule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.diversentsl.bean.Appointmentbean;
import com.diversentsl.bean.bookAppointment;
import com.diversentsl.util.connection1;

public class bookappointmentmodel {
	public static void bookinginfo() throws SQLException {
	ArrayList<bookAppointment> list=new ArrayList<bookAppointment>();
	bookAppointment bean=new bookAppointment();
	Scanner sc=new Scanner(System.in);
	Connection con=null;
	con=connection1.getconnection();
	PreparedStatement stmt=con.prepareStatement("select*from bookingInfo"); 
  ResultSet rs=stmt.executeQuery();
  while(rs.next()) {
	  bean.setId(rs.getInt(1));
	  bean.setPatientname(rs.getString(2));
	  bean.setDoctorname(rs.getString(3));
	  bean.setSpecialization(rs.getString(3));
	  bean.setTimeslot(rs.getString(4));
	  bean.setSpecialization(rs.getString(5)); 

  }
  list.add(bean);
  System.out.println("patient information......");
  System.out.println(list);
}
	public static void addbooking() throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		try {
			con=connection1.getconnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("connection stablish.......");
		System.out.println("Enter  Id of doctor,yourname,doctorname,specialization,timeslot :");
		int id=sc.nextInt();
		String patientname=sc.next();
		String doctorname=sc.next();
		String spe=sc.next();
		String times=sc.next();
		String query="insert into bookingInfo values(?,?,?,?,?)";
		PreparedStatement stmt=con.prepareStatement(query); 
		stmt.setInt(1,id);
		stmt.setString(2,patientname);
		stmt.setString(3,doctorname);
		stmt.setString(4,spe);
		stmt.setString(5,times);
		 int i=stmt.executeUpdate();
		System.out.println("Appointment has been booked.......");

	}


}
