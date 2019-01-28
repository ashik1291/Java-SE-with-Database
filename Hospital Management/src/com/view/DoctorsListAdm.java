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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class DoctorsListAdm extends JFrame {

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
					DoctorsListAdm frame = new DoctorsListAdm();
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
	public DoctorsListAdm() {
		setTitle("Doctors List");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 501);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(23, 140, 502, 280);
		contentPane.add(table);
		displayTable();
		
		JLabel label = new JLabel("White Valley Care");
		label.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		label.setBounds(134, 22, 242, 43);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("A place where healing starts");
		label_1.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		label_1.setBounds(207, 69, 202, 14);
		contentPane.add(label_1);
		
		JLabel lblDoctorsList = new JLabel("Doctors List");
		lblDoctorsList.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDoctorsList.setBounds(37, 110, 83, 19);
		contentPane.add(lblDoctorsList);
		
		JButton button = new JButton("Back");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBackground(new Color(70, 130, 180));
		button.setBounds(176, 429, 75, 23);
		contentPane.add(button);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setBackground(new Color(255, 0, 0));
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDelete.setBounds(261, 429, 75, 23);
		contentPane.add(btnDelete);
	}

}
