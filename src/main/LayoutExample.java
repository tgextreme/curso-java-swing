package main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("Ejemplo de Layouts");
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel =new JPanel();
		panel.setLayout(new GridLayout(2,2));
		
		panel.add(new JButton("Boton 1"));
		panel.add(new JButton("Boton 2"));
		panel.add(new JButton("Boton 3"));
		panel.add(new JButton("Boton 4"));
		
		frame.add(panel);
		frame.setVisible(true);

	}

}
