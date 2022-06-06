package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class DroneAdder extends JPanel {
	
	WindowFrame frame;
	
	public DroneAdder(WindowFrame frame) {
		
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("S/N: ", JLabel.TRAILING); //Trailing edge left to right/ right to left
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelEmail = new JLabel("Email: ", JLabel.TRAILING);
		JTextField fieldEmail = new JTextField(10);
		labelName.setLabelFor(fieldEmail);
		panel.add(labelEmail);
		panel.add(fieldEmail);
	
		JLabel labelManu = new JLabel("Manufacturer: ", JLabel.TRAILING);
		JTextField fieldManu = new JTextField(10);
		labelName.setLabelFor(fieldManu);
		panel.add(labelManu);
		panel.add(fieldManu);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
		
	}
}
