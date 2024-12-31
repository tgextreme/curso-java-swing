package main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Calculadora");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        
        JTextField textField = new JTextField();
        frame.add(textField, BorderLayout.NORTH);
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };
        
        for(String text:buttons) {
        	JButton button = new JButton(text);
            panel.add(button);
        	button.addActionListener(new ActionListener (){
                private String operand1 = "", operand2 = "", operator = "";

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String input = ((JButton) e.getSource()).getText();
                    if ("+-*/".contains(input)) {
                        operator = input;
                        operand1 = textField.getText();
                        textField.setText("");
                    } else if (input.equals("=")) {
                        operand2 = textField.getText();
                        double result = switch (operator) {
                            case "+" -> Double.parseDouble(operand1) + Double.parseDouble(operand2);
                            case "-" -> Double.parseDouble(operand1) - Double.parseDouble(operand2);
                            case "*" -> Double.parseDouble(operand1) * Double.parseDouble(operand2);
                            case "/" -> Double.parseDouble(operand1) / Double.parseDouble(operand2);
                            default -> 0;
                        };
                        textField.setText(String.valueOf(result));
                    } else {
                        textField.setText(textField.getText() + input);
                    }
				}
        		
        	});
        	
        	
        }
        
        
        
        
        
        
        
        
        
	}

}
