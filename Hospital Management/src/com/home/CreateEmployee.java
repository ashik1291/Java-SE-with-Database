package com.home;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.dao.Employee;
import com.dao.Patient;
import com.dboperation.Operation;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateEmployee frame = new CreateEmployee();
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
	public CreateEmployee() {
		setTitle("Create Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(144, 238, 144));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("White Valley Care");
		label.setBounds(146, 25, 242, 43);
		label.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		panel.add(label);
		
		JLabel label_1 = new JLabel("A place where healing starts");
		label_1.setBounds(219, 72, 202, 14);
		label_1.setFont(new Font("Segoe Print", Font.PLAIN, 14));
		panel.add(label_1);
		
		JLabel lblNewEmployeeInformation = new JLabel("New Employee Information ");
		lblNewEmployeeInformation.setBounds(53, 134, 158, 14);
		lblNewEmployeeInformation.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblNewEmployeeInformation);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(21, 129, 22, 19);
		String imagePath = "E:\\Codes\\Intellij\\Hospital Management\\icon\\icons8-add-user-male-96.png";
		label_3.setIcon(MainPage.getAbsoluteImage(imagePath, label_3));
		panel.add(label_3);
		
		JLabel lblEid = new JLabel("EID");
		lblEid.setBounds(21, 186, 46, 14);
		lblEid.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblEid);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmployeeName.setBounds(282, 186, 92, 14);
		panel.add(lblEmployeeName);
		
		JLabel label_6 = new JLabel("Sex");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_6.setBounds(21, 248, 46, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Age");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_7.setBounds(282, 248, 46, 19);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Phone");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_8.setBounds(21, 308, 46, 14);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Address");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_9.setBounds(284, 308, 58, 14);
		panel.add(label_9);
		
		textField = new JTextField();
		textField.setBounds(88, 183, 141, 32);
		textField.setColumns(10);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(384, 183, 134, 32);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(384, 245, 58, 23);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(88, 299, 141, 32);
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		JRadioButton radioButton = new JRadioButton("Male");
		buttonGroup_1.add(radioButton);
		radioButton.setBounds(91, 244, 58, 23);
		panel.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Female");
		buttonGroup_1.add(radioButton_1);
		radioButton_1.setBounds(163, 244, 66, 23);
		panel.add(radioButton_1);
		
		JLabel lblSalary = new JLabel("Salary ($)");
		lblSalary.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSalary.setBounds(21, 363, 57, 14);
		panel.add(lblSalary);
		
		textField_4 = new JTextField();
		textField_4.setBounds(88, 354, 141, 32);
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		JButton button = new JButton("Create");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int e_id = Integer.valueOf(textField.getText());
				String e_name = textField_1.getText();
				radioButton.setActionCommand("Male");
				radioButton_1.setActionCommand("Female");
				String e_sex = String.valueOf(buttonGroup_1.getSelection().getActionCommand());
				int e_age = Integer.valueOf(textField_2.getText());
				String e_phone = textField_3.getText();
				String e_address = textArea.getText();
				Double e_salary = Double.valueOf(textField_4.getText());
				String e_password = String.valueOf(textField_5.getText());
				Employee emp = new Employee(e_id, e_name, e_sex, e_age, e_phone, e_address, e_salary, e_password);
				int result = Operation.insertEmployee(emp);
				if(result>0) {
					JOptionPane.showMessageDialog(null, "Employee successfully created");
				}else {
					JOptionPane.showMessageDialog(null, "Employee creation failed");
				}
			}
		});
		button.setBackground(new Color(46, 139, 87));
		button.setForeground(new Color(255, 255, 255));
		button.setBounds(88, 410, 76, 23);
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(button);
		
		textArea = new JTextArea();
		textArea.setBounds(384, 279, 134, 64);
		panel.add(textArea);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(new Color(255, 255, 255));
		btnClear.setBackground(new Color(178, 34, 34));
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnClear.setBounds(276, 410, 66, 23);
		panel.add(btnClear);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPage ap = new AdminPage();
				ap.setVisible(true);
				dispose();
			}
			
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBack.setBackground(new Color(70, 130, 180));
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setBounds(355, 409, 66, 24);
		panel.add(btnBack);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(282, 364, 76, 14);
		panel.add(lblPassword);
		
		textField_5 = new JTextField();
		textField_5.setBounds(383, 354, 135, 32);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JButton button_1 = new JButton("Update");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_1.setBackground(new Color(176, 224, 230));
		button_1.setBounds(174, 411, 76, 23);
		panel.add(button_1);
	}
}
