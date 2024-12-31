package main;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Ejemplo de JTable");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String[] columnNames = {"ID", "Nombre", "Edad"};
        
        Object[][] data = {
                {1, "Juan", 25},
                {2, "Ana", 30},
                {3, "Luis", 35}
        };
        
        JTable table =new JTable(data, columnNames);
        JScrollPane scroll=new JScrollPane(table);
        frame.add(scroll);
        frame.setVisible(true);

	}

}
