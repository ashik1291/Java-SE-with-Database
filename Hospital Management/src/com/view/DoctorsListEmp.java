package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.dboperation.DbConnect;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTable;
import javax.swing.JButton;

public class DoctorsListEmp extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	public void displayTable() {
		try {
			
			Connection conn = DbConnect.getDbConnection();
			PreparedStatement pst = conn.prepareStatement("select * from doctor");
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
					DoctorsListEmp frame = new DoctorsListEmp();
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
	public DoctorsListEmp() {
		setTitle("Doctors List");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 497);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("White Valley Care");
		label.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		label.setBounds(149, 11, 242, 43);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("A place where healing starts");
		label_1.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		label_1.setBounds(222, 58, 202, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Doctors List");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setBounds(52, 99, 83, 19);
		contentPane.add(label_2);
		
		table = new JTable();
		table.setBounds(38, 129, 502, 280);
		contentPane.add(table);
		displayTable();
		
		JButton button = new JButton("Back");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBackground(new Color(70, 130, 180));
		button.setBounds(258, 420, 75, 23);
		contentPane.add(button);
	}
}
