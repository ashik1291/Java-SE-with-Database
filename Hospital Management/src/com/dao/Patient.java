package com.dao;

public class Patient {
	private int pid;
	private String patient_name;
	private String sex;
	private int age;
	private String phone;
	private String address;
	private String disease;
	private String doct_name;
	public Patient(int pid, String patient_name, String sex, int age, String phone, String address, String disease,
			String doct_name) {
		super();
		this.pid = pid;
		this.patient_name = patient_name;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.disease = disease;
		this.doct_name = doct_name;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getDoct_name() {
		return doct_name;
	}
	public void setDoct_name(String doct_name) {
		this.doct_name = doct_name;
	}
	
	
	
}
