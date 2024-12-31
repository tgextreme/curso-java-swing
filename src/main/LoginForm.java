package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm {
public static void main(String[] args) {
	JFrame frame =new JFrame("formulario de Login");
	frame.setSize(300,150);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel panel =new JPanel();
	frame.add(panel);
	panel.setLayout(null);
	
	JLabel userLabel = new JLabel("Usuario:");
    userLabel.setBounds(10, 20, 80, 25);
    panel.add(userLabel);
    
    JTextField userText = new JTextField();
    userText.setBounds(100, 20, 165, 25);
    panel.add(userText);
    
    JLabel passwordLabel = new JLabel("Contraseña:");
    passwordLabel.setBounds(10, 50, 80, 25);
    panel.add(passwordLabel);
    
    JPasswordField passwordText = new JPasswordField();
    passwordText.setBounds(100, 50, 165, 25);
    panel.add(passwordText);
    
    JButton loginButton = new JButton("Login");
    loginButton.setBounds(10, 80, 80, 25);
    
    panel.add(loginButton);
    
    frame.setVisible(true);
    
	
}
}
