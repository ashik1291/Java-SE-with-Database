package com.dao;

public class Doctor {
	private int did;
	private String doct_name;
	private String sex;
	private int age;
	private String phone;
	private String address;
	private double salary;
	private String dept;
	
	public Doctor(int did, String doct_name, String sex, int age, String phone, String address, double salary,
			String dept) {
		super();
		this.did = did;
		this.doct_name = doct_name;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.salary = salary;
		this.dept = dept;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDoct_name() {
		return doct_name;
	}

	public void setDoct_name(String doct_name) {
		this.doct_name = doct_name;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
}
