package main;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutExample {
public static void main(String[] args) {
	JFrame frame = new JFrame("CardLayout");
    frame.setSize(400, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel cards = new JPanel(new CardLayout());
    JPanel card1 = new JPanel();
    card1.add(new JLabel("Esta es la tarjeta 1"));
    JPanel card2 = new JPanel();
    card2.add(new JLabel("Esta es la tarjeta 2"));
    
    cards.add(card1,"Tarjeta 1");
    cards.add(card2,"Tarjeta 2");
    
    JButton button1 = new JButton("Mostrar Tarjeta 1");
    JButton button2 = new JButton("Mostrar Tarjeta 2");
    
    button1.addActionListener(e -> {
        CardLayout cl = (CardLayout) (cards.getLayout());
        cl.show(cards, "Tarjeta 1");
    });
    
    button2.addActionListener(e -> {
        CardLayout cl = (CardLayout) (cards.getLayout());
        cl.show(cards, "Tarjeta 2");
    });
    
    JPanel controlPanel = new JPanel();
    controlPanel.add(button1);
    controlPanel.add(button2);
    
    frame.setLayout(new BorderLayout());
    frame.add(cards, BorderLayout.CENTER);
    frame.add(controlPanel, BorderLayout.SOUTH);
    
    frame.setVisible(true);
    
}
}
