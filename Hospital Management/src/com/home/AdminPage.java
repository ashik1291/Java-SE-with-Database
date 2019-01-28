package com.home;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.view.DoctorsListAdm;
import com.view.EmployeeList;
import com.view.PatientList;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JTree;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		setTitle("Admin");
		setBackground(new Color(152, 251, 152));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 462);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("White Valley Care");
		label.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		label.setBounds(119, 11, 242, 43);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("A place where healing starts");
		label_1.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		label_1.setBounds(192, 58, 202, 14);
		contentPane.add(label_1);
		
		JButton button = new JButton("View Patients");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientList pl = new PatientList();
				pl.setVisible(true);
				dispose();
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBackground(new Color(102, 205, 170));
		button.setBounds(164, 254, 119, 30);
		contentPane.add(button);
		
		JButton button_1 = new JButton("View Employees");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeList el = new EmployeeList();
				el.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_1.setBackground(new Color(102, 205, 170));
		button_1.setBounds(164, 295, 139, 33);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Doctor's List");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorsListAdm dl = new DoctorsListAdm();
				dl.setVisible(true);
				dispose();
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_2.setBackground(new Color(102, 205, 170));
		button_2.setBounds(164, 342, 105, 30);
		contentPane.add(button_2);
		
		JButton btnCreateNewEmployee = new JButton("Create New Employee");
		btnCreateNewEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateEmployee ce = new CreateEmployee();
				ce.setVisible(true);
				dispose();
			}
		});
		btnCreateNewEmployee.setForeground(Color.WHITE);
		btnCreateNewEmployee.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCreateNewEmployee.setBackground(new Color(46, 139, 87));
		btnCreateNewEmployee.setBounds(164, 128, 167, 33);
		contentPane.add(btnCreateNewEmployee);
		
		JButton btnCreateNewDoctor = new JButton("Create New Doctor");
		btnCreateNewDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateDoctor cd = new CreateDoctor();
				cd.setVisible(true);
				dispose();
			}
		});
		btnCreateNewDoctor.setForeground(Color.WHITE);
		btnCreateNewDoctor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCreateNewDoctor.setBackground(new Color(46, 139, 87));
		btnCreateNewDoctor.setBounds(164, 172, 167, 33);
		contentPane.add(btnCreateNewDoctor);
		
		JLabel lblHj = new JLabel("");
		//lblHj.setIcon(new ImageIcon("E:\\Codes\\Intellij\\Hospital Management\\icon\\icons8-add-user-male-96.png"));
		lblHj.setIcon(new ImageIcon(new ImageIcon("E:\\\\Codes\\\\Intellij\\\\Hospital Management\\\\icon\\\\icons8-add-user-male-96.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
		lblHj.setBounds(55, 139, 46, 43);
		contentPane.add(lblHj);
		
		JLabel label_2 = new JLabel("");
		//label_2.setIcon(new ImageIcon("E:\\Codes\\Intellij\\Hospital Management\\icon\\icons8-eye-96.png"));
		label_2.setIcon(new ImageIcon(new ImageIcon("E:\\\\Codes\\\\Intellij\\\\Hospital Management\\\\icon\\\\icons8-eye-96.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
		label_2.setBounds(55, 295, 46, 33);
		contentPane.add(label_2);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage mp = new MainPage();
				mp.setVisible(true);
				dispose();
			}
		});
		btnLogout.setBackground(new Color(72, 61, 139));
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLogout.setBounds(414, 230, 75, 23);
		contentPane.add(btnLogout);
	}
}
