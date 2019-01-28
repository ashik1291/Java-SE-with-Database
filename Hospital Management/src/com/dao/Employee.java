package com.dao;

public class Employee {
	private int eid;
	private String emp_name;
	private String sex;
	private int age;
	private String phone;
	private String address;
	private double salary;
	private String password;
	
	public Employee(int eid, String emp_name, String sex, int age, String phone, String address, double salary,
			String password) {
		super();
		this.eid = eid;
		this.emp_name = emp_name;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.salary = salary;
		this.password = password;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
