//http://www.javaschubla.de/2007/javaerst0040.html

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fenster extends JFrame {

	public static void main(String[] args){
		new Fenster();
	}
	
	public Fenster()
	{
		super("Der Quadrator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());
		
		JTextField textField = new JTextField("Zahl eingeben");
		getContentPane().add(textField);
		
		JButton button = new JButton("Quadrieren");
		getContentPane().add(button);
		
		JLabel label = new JLabel("Ergebnis");
		getContentPane().add(label);
		
		button.addActionListener(new MyListener(textField, label));
		
		setLocation(250, 190);
		setSize(400, 90);
		setVisible(true);
		
	}
	
}