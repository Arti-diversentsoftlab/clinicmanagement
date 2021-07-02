package com.diversentsl.bean;

import java.sql.SQLException;
import java.util.Scanner;

import com.diversentsl.mainmodule.Drugmodel;
import com.diversentsl.mainmodule.LabTestModel;
import com.diversentsl.mainmodule.appointmentmodel;
import com.diversentsl.mainmodule.bookappointmentmodel;
import com.diversentsl.mainmodule.doctormodel;
import com.diversentsl.mainmodule.patientmodel;

public class Admin {
	public static void main(String[] args) throws SQLException {
		
		System.out.println("-----------------welcome user-----------------"); 
		System.out.println("Enter 1 for patient...");
		System.out.println("Enter 2 for Doctor..");
		System.out.println("Enter 3 for admin");
		System.out.println("__________________");
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n){
			case 1:
				System.out.println("enter 31 for add your infomation");
				System.out.println("enter 32 for appointment booking");
               System.out.println("enter 33 for see doctors appointments slots");
               int nh=sc.nextInt();
               switch(nh) {
               case 31:
            	   patientmodel.addpatient();
            	   break;
               case 32:
            	   bookappointmentmodel.addbooking();
            	   break;
               case 33:
            	   appointmentmodel.AppointmentInfo();
            	   System.out.println("for booking.....");
            	   bookappointmentmodel.addbooking();
               }
				
				break;
			case 2:
				System.out.println("enter 11 for add  your information");
				System.out.println("enter 12 for see the any patient information");
				System.out.println("enter 13 for add drugs");
				System.out.println("enter 14 for add labtest information");
				System.out.println("enter 15 for add appointments");
				int nu=sc.nextInt();
				switch(nu) {
				case 11:
				doctormodel.addDoctor();
				break;
			case 12:
				patientmodel.patientInfo();
				break;
			case 13:
				Drugmodel.addDrugs();
				break;
			case 14:
				LabTestModel.addTest();
			break;
			case 15:
				appointmentmodel.addappointment();
		}
		break;
			case 3:
				System.out.println("Enter 21 for delete patient....");
				System.out.println("enter 22 for delete Doctor");
				System.out.println("enter 23 for delete Drugs");
				System.out.println("enter 24 for delete Lab test info");
				System.out.println("enter 25 for see patient info");
				System.out.println("enter 26 for doctor info");
				System.out.println("enter 27 for add appointment..");
          int num=sc.nextInt();
          switch(num) {
          case 21:
        	  patientmodel.delete();
        	  break;
          case 22:
        	  doctormodel.delete();
        	  break;
          case 23:
        	  Drugmodel.delete();
        	  break;
          case 24:
        	  LabTestModel.delete();
        	  break;
          case 25:
        	  patientmodel.patientInfo();
        	  break;
          case 26:
        	  doctormodel.DoctorInfo();
        	  break;
          case 27:
        	  appointmentmodel.addappointment();
        	  break;
          }
				
				break;
			
		}
	}
}


