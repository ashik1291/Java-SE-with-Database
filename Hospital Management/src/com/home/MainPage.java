package com.home;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainPage extends JFrame {

	private JPanel contentPane;
	
	public static ImageIcon getAbsoluteImage(String path, JLabel imageLabel) {
        ImageIcon oldIcon = new ImageIcon(path);
        Image oldImage = oldIcon.getImage();
        Image newImage = oldImage.getScaledInstance(imageLabel.getHeight(), imageLabel.getWidth(), Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImage);
        return newIcon;
    }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setTitle("Hospital Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 420);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(144, 238, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JLabel lblHospitalManagementSystem = new JLabel("White Valley Care");
		lblHospitalManagementSystem.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		lblHospitalManagementSystem.setBounds(74, 42, 242, 43);
		contentPane.add(lblHospitalManagementSystem);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				UserLogin empUser = new UserLogin();
				empUser.setVisible(true);
				dispose();
			}
		});
		label_1.setBackground(new Color(220, 20, 60));
		label_1.setBounds(114, 155, 71, 70);
		String firstPath = "E:\\Codes\\Intellij\\Hospital Management\\icon\\icons8-conference-480.png";
		label_1.setIcon(getAbsoluteImage(firstPath, label_1));
		contentPane.add(label_1);
		
		
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				AdminLogin al = new AdminLogin();
				al.setVisible(true);
				dispose();
			}
		});
		label_2.setBackground(new Color(220, 20, 60));
		label_2.setBounds(259, 155, 71, 63);
		String secondPath = "E:\\Codes\\Intellij\\Hospital Management\\icon\\icons8-businessman-48.png";
		label_2.setIcon(getAbsoluteImage(secondPath, label_2));
		contentPane.add(label_2);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUser.setBounds(136, 245, 38, 14);
		contentPane.add(lblUser);
		
		JLabel lblAdmin = new JLabel("Admin");
		lblAdmin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdmin.setBounds(270, 247, 46, 14);
		contentPane.add(lblAdmin);
		
		JLabel lblAPlaceWhere = new JLabel("A place where healing starts");
		lblAPlaceWhere.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		lblAPlaceWhere.setBounds(147, 89, 202, 14);
		contentPane.add(lblAPlaceWhere);
	}
}
