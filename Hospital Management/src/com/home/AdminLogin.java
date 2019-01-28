package com.home;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

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
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setTitle("Employee Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(144, 238, 144));
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblHelloAdminPlease = new JLabel("Hello, Admin. Please enter your username and password! ");
		lblHelloAdminPlease.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHelloAdminPlease.setBounds(30, 123, 378, 14);
		panel.add(lblHelloAdminPlease);
		
		JLabel label_1 = new JLabel("White Valley Care");
		label_1.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		label_1.setBounds(87, 25, 242, 43);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("A place where healing starts");
		label_2.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		label_2.setBounds(160, 72, 202, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Username");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setBounds(30, 174, 59, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Password");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_4.setBounds(30, 220, 59, 14);
		panel.add(label_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(133, 171, 119, 20);
		panel.add(textField);
		
		JButton button = new JButton("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = textField.getText();
				String passWord = String.valueOf(passwordField.getPassword());
				
				if(userName.equalsIgnoreCase("admin") && passWord.equalsIgnoreCase("12354")) {
					AdminPage up = new AdminPage();
					up.setVisible(true);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Username or Password is wrong!");
				}
			}
		});
		button.setBackground(new Color(47, 79, 79));
		button.setForeground(new Color(255, 255, 255));
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.setBounds(133, 267, 75, 23);
		panel.add(button);
		
		JCheckBox checkBox = new JCheckBox("Show");
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkBox.isSelected()) {
					passwordField.setEchoChar((char)0);
				}else {
					passwordField.setEchoChar('*');
				}
			}
		});
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 9));
		checkBox.setBounds(270, 218, 51, 18);
		panel.add(checkBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(133, 218, 119, 20);
		panel.add(passwordField);
		
		JButton btnChangePassword = new JButton("Change Password");
		btnChangePassword.setForeground(new Color(240, 248, 255));
		btnChangePassword.setBackground(new Color(46, 139, 87));
		btnChangePassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnChangePassword.setBounds(181, 316, 144, 23);
		panel.add(btnChangePassword);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage mp = new MainPage();
				mp.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setBackground(new Color(70, 130, 180));
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBack.setBounds(71, 316, 75, 23);
		panel.add(btnBack);
	}

}
