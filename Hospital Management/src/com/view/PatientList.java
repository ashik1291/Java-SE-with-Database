package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.dboperation.DbConnect;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;

public class PatientList extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	public void displayTable() {
		try {
			
			Connection conn = DbConnect.getDbConnection();
			PreparedStatement pst = conn.prepareStatement("select * from patient");
			ResultSet rst = pst.executeQuery();
			while(rst.next()) {
				table.setModel(DbUtils.resultSetToTableModel(rst));
			}
			
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientList frame = new PatientList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PatientList() {
		setTitle("Patient List");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 499);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.setBounds(46, 118, 503, 288);
		contentPane.add(table);
		displayTable();
		
		JLabel label = new JLabel("White Valley Care");
		label.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		label.setBounds(137, 11, 242, 43);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("A place where healing starts");
		label_1.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		label_1.setBounds(210, 58, 202, 14);
		contentPane.add(label_1);
		
		JLabel lblPatientList = new JLabel("Patient List");
		lblPatientList.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPatientList.setBounds(49, 92, 82, 20);
		contentPane.add(lblPatientList);
		
		JButton button = new JButton("Back");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBackground(new Color(70, 130, 180));
		button.setBounds(193, 417, 75, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Delete");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_1.setBackground(Color.RED);
		button_1.setBounds(289, 417, 75, 23);
		contentPane.add(button_1);
	}

}
