package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CounterApp {
public static void main(String[] args) {
	JFrame frame = new JFrame("Contador");
    frame.setSize(200, 150);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel panel = new JPanel();
    frame.add(panel);
    
    JLabel label = new JLabel("0");
    panel.add(label);
    
    JButton button = new JButton("Incrementar");
    panel.add(button);
    
    button.addActionListener(new ActionListener() {
    	private int count=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			count++;
			label.setText(count+"");
			// TODO Auto-generated method stub
			
		}
    	
    });
    frame.setVisible(true);
}
}
