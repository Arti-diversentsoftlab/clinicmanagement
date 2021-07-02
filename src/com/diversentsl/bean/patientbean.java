package com.diversentsl.bean;

public class patientbean {
	private int id;
	private String patientName;
    private int patientAge;
    private String  patientGender;
    private String disease;
    private String Address;
     
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public String getPatientGender() {
		return patientGender;
	}
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}
	public String getDisease() {
		return disease;
	}
	@Override
	public String toString() {
		return " patientName=" + patientName + ", patientAge=" + patientAge + ", patientGender="
				+ patientGender + ", disease=" + disease + ", Address=" + Address + "";
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
     
}

