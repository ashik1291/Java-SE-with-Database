package com.home;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.dboperation.DbConnect;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class UserLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin frame = new UserLogin();
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
	public UserLogin() {
		setTitle("Employee User");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 384);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(144, 238, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JLabel lblHelloMr = new JLabel("Please enter your username and password! ");
		lblHelloMr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHelloMr.setBounds(30, 123, 295, 20);
		contentPane.add(lblHelloMr);
		
		JLabel label = new JLabel("White Valley Care");
		label.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		label.setBounds(87, 25, 242, 43);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("A place where healing starts");
		label_1.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		label_1.setBounds(160, 72, 202, 14);
		contentPane.add(label_1);
		
		JLabel lblUsername = new JLabel("E-ID");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsername.setBounds(30, 174, 59, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(30, 220, 59, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(133, 171, 119, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int e_id = Integer.valueOf(textField.getText());
				String password = String.valueOf(passwordField.getPassword());
				Connection con = DbConnect.getDbConnection();
				try {
					PreparedStatement pst = con.prepareStatement("select eid,password from emp where eid = ?");
					pst.setInt(1, e_id);
					ResultSet rs = pst.executeQuery();
					JOptionPane.showMessageDialog(null, rs.getRow());
					if(rs.next()) {
						if(password.equalsIgnoreCase(rs.getString(2))) {
							UserPage up = new UserPage();
							up.setVisible(true);
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null, "Wrong Password");
						}
					}else {
						JOptionPane.showMessageDialog(null, "Wrong username");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(47, 79, 79));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(133, 267, 75, 27);
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxShow = new JCheckBox("Show");
		chckbxShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxShow.isSelected()) {
					passwordField.setEchoChar((char)0);
				}else {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxShow.setFont(new Font("Tahoma", Font.PLAIN, 9));
		chckbxShow.setBounds(270, 218, 51, 18);
		contentPane.add(chckbxShow);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(133, 218, 119, 20);
		contentPane.add(passwordField);
		
		JButton btnHome = new JButton("Back");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainPage mp = new MainPage();
				mp.setVisible(true);
				dispose();
			}
		});
		btnHome.setBackground(new Color(70, 130, 180));
		btnHome.setForeground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnHome.setBounds(308, 308, 75, 27);
		contentPane.add(btnHome);
	}
}
