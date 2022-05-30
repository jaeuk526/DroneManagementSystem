package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame{
	public MenuSelection() {
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 버튼을 눌렀을때 프로그램 종료
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();						//기본이 flow layout
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add Drone");
		JButton button2 = new JButton("View Drone");
		JButton button3 = new JButton("Edit Drone");
		JButton button4 = new JButton("Delete Drone");
		JButton button5 = new JButton("Exit Program");
		
		panel1.add(label);									//만들어진 Jlabel을 panel에다 붙이기
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
}
