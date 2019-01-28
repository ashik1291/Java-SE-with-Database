package com.dboperation;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import com.dao.Doctor;
import com.dao.Employee;
import com.dao.Patient;

public class Operation {
	
	public static int insertPatient(Patient p) {
		int r=0;
		Connection con = DbConnect.getDbConnection();
		try{
			PreparedStatement pst = con.prepareStatement("insert into patient values(?,?,?,?,?,?,?,?)");
			pst.setInt(1, p.getPid());
			pst.setString(2, p.getPatient_name());
			pst.setString(3, p.getSex());
			pst.setInt(4, p.getAge());
			pst.setString(5, p.getPhone());
			pst.setString(6, p.getAddress());
			pst.setString(7, p.getDisease());
			pst.setString(8, p.getDoct_name());
			
			r = pst.executeUpdate();
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		
		return r;
	}
	
	public static int insertEmployee(Employee e) {
		int r=0;
		Connection con = DbConnect.getDbConnection();
		try{
			PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?,?,?,?,?,?)");
			pst.setInt(1, e.getEid());
			pst.setString(2, e.getEmp_name());
			pst.setString(3, e.getSex());
			pst.setInt(4, e.getAge());
			pst.setString(5, e.getPhone());
			pst.setString(6, e.getAddress());
			pst.setDouble(7, e.getSalary());
			pst.setString(8, e.getPassword());
			
			r = pst.executeUpdate();
			
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
		
		
		return r;
	}
	
	public static int insertDoctor(Doctor d) {
		int r=0;
		Connection con = DbConnect.getDbConnection();
		try{
			PreparedStatement pst = con.prepareStatement("insert into doctor values(?,?,?,?,?,?,?,?)");
			pst.setInt(1, d.getDid());
			pst.setString(2, d.getDoct_name());
			pst.setString(3, d.getSex());
			pst.setInt(4, d.getAge());
			pst.setString(5, d.getPhone());
			pst.setString(6, d.getAddress());
			pst.setDouble(7, d.getSalary());
			pst.setString(8, d.getDept());
			
			r = pst.executeUpdate();
			
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
		
		
		return r;
	}
	
}
