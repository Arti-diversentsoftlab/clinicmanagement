package com.diversentsl.bean;

public class Appointmentbean {
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String doctorName;
	String specialization;
	int contactNumber;
	int fee;
	String Address;
	String timeslot;
	int experience;
	public String getDoctorName() {
		return doctorName;
	}
	@Override
	public String toString() {
		return "id=" + id + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ ", contactNumber=" + contactNumber + ", fee=" + fee + ", Address=" + Address + ", timeslot="
				+ timeslot + ", experience=" + experience + "";
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getTimeslot() {
		return timeslot;
	}
	public void setTimeslot(String timeslot) {
		this.timeslot = timeslot;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experinece) {
		this.experience = experience;
	}
	

}
