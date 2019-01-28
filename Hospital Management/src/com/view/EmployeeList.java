package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.dboperation.DbConnect;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class EmployeeList extends JFrame {

	private JPanel contentPane;
	private JTable table;
	//ResultSet rst = null;
	
	public void displayTable() {
		try {
			
			Connection conn = DbConnect.getDbConnection();
			PreparedStatement pst = conn.prepareStatement("select * from emp");
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
					EmployeeList frame = new EmployeeList();
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
	public EmployeeList() {
		setTitle("Employee List");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 506);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		

		
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "Sex", "Age", "Phone", "Address", "Password", "Salary"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, true, false, true, true, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(36);
		table.getColumnModel().getColumn(0).setMaxWidth(36);
		table.getColumnModel().getColumn(1).setMaxWidth(800);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(55);
		table.getColumnModel().getColumn(2).setMaxWidth(55);
		table.getColumnModel().getColumn(3).setMaxWidth(30);
		table.getColumnModel().getColumn(4).setMaxWidth(400);
		table.getColumnModel().getColumn(5).setResizable(false);
		table.getColumnModel().getColumn(6).setResizable(false);
		table.getColumnModel().getColumn(7).setResizable(false);
		table.setBounds(26, 114, 607, 296);
		contentPane.add(table);
		displayTable();
		
		JLabel label = new JLabel("White Valley Care");
		label.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		label.setBounds(135, 11, 242, 43);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("A place where healing starts");
		label_1.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		label_1.setBounds(208, 58, 202, 14);
		contentPane.add(label_1);
		
		JLabel lblEmployeeList = new JLabel("Employee List");
		lblEmployeeList.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmployeeList.setBounds(42, 91, 104, 23);
		contentPane.add(lblEmployeeList);
		
		JButton button = new JButton("Back");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBackground(new Color(70, 130, 180));
		button.setBounds(189, 421, 75, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Delete");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_1.setBackground(Color.RED);
		button_1.setBounds(274, 421, 75, 23);
		contentPane.add(button_1);
	}
}
