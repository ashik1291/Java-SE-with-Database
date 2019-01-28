package com.home;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.dao.Doctor;
import com.dao.Employee;
import com.dboperation.Operation;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateDoctor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextArea textArea;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateDoctor frame = new CreateDoctor();
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
	public CreateDoctor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 474);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JLabel label = new JLabel("");
		label.setBounds(22, 96, 22, 19);
		String imagePath = "E:\\Codes\\Intellij\\Hospital Management\\icon\\icons8-add-user-male-96.png";
		label.setIcon(MainPage.getAbsoluteImage(imagePath, label));
		contentPane.add(label);
		
		JLabel lblNewDoctorInformation = new JLabel("New Doctor Information ");
		lblNewDoctorInformation.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewDoctorInformation.setBounds(54, 101, 158, 14);
		contentPane.add(lblNewDoctorInformation);
		
		JLabel lblDid = new JLabel("DID");
		lblDid.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDid.setBounds(22, 153, 46, 14);
		contentPane.add(lblDid);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(89, 150, 141, 32);
		contentPane.add(textField);
		
		JLabel label_3 = new JLabel("Sex");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setBounds(22, 215, 46, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Phone");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_4.setBounds(22, 275, 46, 14);
		contentPane.add(label_4);
		
		JRadioButton radioButton = new JRadioButton("Male");
		buttonGroup_1.add(radioButton);
		radioButton.setBounds(92, 211, 58, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Female");
		buttonGroup_1.add(radioButton_1);
		radioButton_1.setBounds(164, 211, 66, 23);
		contentPane.add(radioButton_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(89, 266, 141, 32);
		contentPane.add(textField_1);
		
		JLabel label_5 = new JLabel("Age");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_5.setBounds(283, 215, 46, 19);
		contentPane.add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(385, 212, 58, 23);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(385, 150, 134, 32);
		contentPane.add(textField_3);
		
		textArea = new JTextArea();
		textArea.setBounds(385, 270, 134, 28);
		contentPane.add(textArea);
		
		JButton button = new JButton("Create");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int d_id = Integer.valueOf(textField.getText());
				String d_name = textField_3.getText();
				radioButton.setActionCommand("Male");
				radioButton_1.setActionCommand("Female");
				String d_sex = String.valueOf(buttonGroup_1.getSelection().getActionCommand());
				int d_age = Integer.valueOf(textField_2.getText());
				String d_phone = textField_1.getText();
				String d_address = textArea.getText();
				Double d_salary = Double.valueOf(textField_4.getText());
				String d_dept = String.valueOf(comboBox.getSelectedItem());
				Doctor doct = new Doctor(d_id, d_name, d_sex, d_age, d_phone, d_address, d_salary, d_dept);
				int result = Operation.insertDoctor(doct);
				if(result>0) {
					JOptionPane.showMessageDialog(null, "Doctor successfully created");
				}else {
					JOptionPane.showMessageDialog(null, "Doctor creation failed");
				}
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBackground(new Color(46, 139, 87));
		button.setBounds(89, 377, 76, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Clear");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				comboBox.setSelectedIndex(1);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_1.setBackground(new Color(178, 34, 34));
		button_1.setBounds(261, 377, 66, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Back");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPage ap = new AdminPage();
				ap.setVisible(true);
				dispose();
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_2.setBackground(new Color(70, 130, 180));
		button_2.setBounds(342, 376, 66, 24);
		contentPane.add(button_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(89, 321, 141, 32);
		contentPane.add(textField_4);
		
		JLabel label_6 = new JLabel("White Valley Care");
		label_6.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		label_6.setBounds(133, 11, 242, 43);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("A place where healing starts");
		label_7.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		label_7.setBounds(206, 58, 202, 14);
		contentPane.add(label_7);
		
		JLabel lblDoctorName = new JLabel("Doctor Name");
		lblDoctorName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDoctorName.setBounds(283, 153, 92, 14);
		contentPane.add(lblDoctorName);
		
		JLabel label_9 = new JLabel("Address");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_9.setBounds(285, 275, 58, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("Salary");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_10.setBounds(22, 329, 46, 14);
		contentPane.add(label_10);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDepartment.setBounds(283, 330, 76, 23);
		contentPane.add(lblDepartment);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Accidents & Emergency", "Anaesthetics", "Breast screening", "Cardiology", "Diagnostic imaging", "Ear nose and throat (ENT)", "Gastroenterology", "General surgery", "Gynaecology", "Haematology", "Microbiology", "Nephrology", "Neurology", "Nutrition and dietetics", "Oncology", "Ophthalmology", "Orthopaedics", "Rheumatology", "Urology"}));
		comboBox.setSelectedIndex(1);
		comboBox.setMaximumRowCount(20);
		comboBox.setBounds(385, 334, 106, 23);
		contentPane.add(comboBox);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(new Color(176, 224, 230));
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnUpdate.setBounds(175, 377, 76, 23);
		contentPane.add(btnUpdate);
	}
}
