package org.iuea.oop.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;

public class LoginView  {

	public static void main(String[] args) {
		
		 JFrame frame;
		 
		frame = new JFrame();
		frame.setTitle("Login View");
		frame.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		frame.setVisible(true);
//		frame.setBounds(100, 100, 450, 300);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		frame.getContentPane().add(panel);
		panel.setMaximumSize(new Dimension(100, 100));
		panel.setLayout(null);
		
		JLabel lblTitle = new JLabel("LOGIN PAGE");
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setBounds(140, 22, 153, 29);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel.add(lblTitle);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(10, 71, 80, 22);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(10, 128, 77, 22);
		panel.add(lblPassword);
		
		JTextField textField = new JTextField();
		textField.setBounds(97, 70, 312, 29);
		panel.add(textField);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.GRAY);
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBounds(10, 182, 414, 7);
		panel.add(separator);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(20, 200, 153, 34);
		panel.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancel.setBounds(255, 200, 153, 34);
		panel.add(btnCancel);
		
		JPasswordField password = new JPasswordField();
		password.setBounds(97, 127, 311, 29);
		panel.add(password);

	}
	
}
