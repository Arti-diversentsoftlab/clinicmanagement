package com.diversentsl.bean;

public class doctorbean {
	  int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String Doctorname;
	int fee;
	@Override
	public String toString() {
		return "id=" + id + ", Doctorname=" + Doctorname + ", fee=" + fee + ", specialization="
				+ specialization + ", degree=" + degree + "";
	}
	String specialization;
	String degree;
	public String getDoctorname() {
		return Doctorname;
	}
	public void setDoctorname(String doctorname) {
		Doctorname = doctorname;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	



}
