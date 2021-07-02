package com.diversentsl.bean;

public class bookAppointment {
	int id;
@Override
	public String toString() {
		return "id=" + id + ", patientname=" + patientname + ", Doctorname=" + Doctorname
				+ ", timeslot=" + timeslot + ", specialization=" + specialization + "";
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
String patientname;
public String getPatientname() {
	return patientname;
}
public void setPatientname(String patientname) {
	this.patientname = patientname;
}
public String getDoctorname() {
	return Doctorname;
}
public void setDoctorname(String doctorname) {
	Doctorname = doctorname;
}
public String getTimeslot() {
	return timeslot;
}
public void setTimeslot(String timeslot) {
	this.timeslot = timeslot;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
String Doctorname;
String timeslot;
String specialization;
}
