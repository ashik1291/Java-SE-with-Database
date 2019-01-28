package com.home;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.dao.Patient;
import com.dboperation.Operation;
import com.view.DoctorsListAdm;
import com.view.DoctorsListEmp;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextArea;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.Choice;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPage frame = new UserPage();
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
	public UserPage() {
		setTitle("Employee User");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 514);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(144, 238, 144));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);

		JLabel label = new JLabel("White Valley Care");
		label.setBounds(146, 25, 242, 43);
		label.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		contentPane.add(label);

		JLabel label_1 = new JLabel("A place where healing starts");
		label_1.setBounds(219, 72, 202, 14);
		label_1.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		contentPane.add(label_1);

		JLabel lblCreateNewPatient = new JLabel("New Patient's Information ");
		lblCreateNewPatient.setBounds(53, 134, 158, 14);
		lblCreateNewPatient.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblCreateNewPatient);

		JLabel label_2 = new JLabel("");
		label_2.setBounds(21, 129, 22, 19);
		String imagePath = "E:\\Codes\\Intellij\\Hospital Management\\icon\\icons8-add-user-male-96.png";
		label_2.setIcon(MainPage.getAbsoluteImage(imagePath, label_2));
		contentPane.add(label_2);
		
		JLabel lblPid = new JLabel("PID");
		lblPid.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPid.setBounds(21, 186, 46, 14);
		contentPane.add(lblPid);
		
		JLabel lblPatientName = new JLabel("Patient Name");
		lblPatientName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPatientName.setBounds(282, 186, 81, 14);
		contentPane.add(lblPatientName);
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSex.setBounds(21, 248, 46, 14);
		contentPane.add(lblSex);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAge.setBounds(282, 248, 46, 19);
		contentPane.add(lblAge);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPhone.setBounds(21, 308, 46, 14);
		contentPane.add(lblPhone);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddress.setBounds(284, 308, 58, 14);
		contentPane.add(lblAddress);
		
		textField = new JTextField();
		textField.setBounds(88, 183, 141, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(384, 183, 134, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(384, 245, 58, 32);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(88, 299, 141, 32);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup_1.add(rdbtnMale);
		rdbtnMale.setBounds(91, 244, 58, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup_1.add(rdbtnFemale);
		rdbtnFemale.setBounds(163, 244, 66, 23);
		contentPane.add(rdbtnFemale);
		
		JLabel lblDisease = new JLabel("Disease");
		lblDisease.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDisease.setBounds(21, 363, 46, 14);
		contentPane.add(lblDisease);
		
		textField_4 = new JTextField();
		textField_4.setBounds(88, 354, 141, 32);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		JLabel lblDoctorsName = new JLabel("Doctor's name");
		lblDoctorsName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDoctorsName.setBounds(282, 368, 92, 14);
		contentPane.add(lblDoctorsName);
		
		textField_5 = new JTextField();
		textField_5.setBounds(384, 354, 141, 32);
		textField_5.setColumns(10);
		contentPane.add(textField_5);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int p_id = Integer.valueOf(textField.getText());
				String p_name = textField_1.getText();
				rdbtnMale.setActionCommand("Male");
				rdbtnFemale.setActionCommand("Female");
				String p_sex = String.valueOf(buttonGroup_1.getSelection().getActionCommand());
				int p_age = Integer.valueOf(textField_2.getText());
				String p_phone = textField_3.getText();
				String p_address = textArea.getText();
				String p_disease = textField_4.getText();
				String p_doct_name = textField_5.getText();
				Patient p = new Patient(p_id, p_name, p_sex, p_age, p_phone, p_address, p_disease, p_doct_name);
				int result = Operation.insertPatient(p);
				if(result>0) {
					JOptionPane.showMessageDialog(null, "Patient successfully created");
				}else {
					JOptionPane.showMessageDialog(null, "Patient creation failed");
				}
				
			}
			
		});
		btnCreate.setBackground(new Color(60, 179, 113));
		btnCreate.setForeground(new Color(255, 255, 255));
		btnCreate.setBounds(88, 430, 81, 23);
		btnCreate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(btnCreate);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserLogin ul = new UserLogin();
				ul.setVisible(true);
				dispose();
			}
		});
		btnBack.setBackground(new Color(70, 130, 180));
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setBounds(222, 431, 75, 23);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(btnBack);
		
		JButton btnDoctorsList = new JButton("Doctor's List");
		btnDoctorsList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorsListEmp dl = new DoctorsListEmp();
				dl.setVisible(true);
				dispose();
			}
		});
		btnDoctorsList.setBackground(new Color(102, 205, 170));
		btnDoctorsList.setForeground(new Color(255, 255, 255));
		btnDoctorsList.setBounds(356, 430, 105, 23);
		btnDoctorsList.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(btnDoctorsList);
		
		textArea = new JTextArea();
		textArea.setBounds(384, 288, 134, 55);
		contentPane.add(textArea);
	}
}
