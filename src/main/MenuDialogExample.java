package main;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuDialogExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Menús y Diálogos");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Archivo");
        JMenuItem menuItem = new JMenuItem("Mostrar mensaje");
        
        menu.add(menuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        
        menuItem.addActionListener(e->JOptionPane.showMessageDialog(frame, "Hola mundo"));
        
        frame.setVisible(true);
	}

}
