package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame{
	public MenuSelection() {
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â�ݱ� ��ư�� �������� ���α׷� ����
		
		JPanel panel = new JPanel();						//�⺻�� flow layout
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add Student");
		JButton button2 = new JButton("View Student");
		JButton button3 = new JButton("Edit Student");
		JButton button4 = new JButton("Delete Student");
		JButton button5 = new JButton("Exit Program");
		
		panel.add(label);									//������� Jlabel�� panel���� ���̱�
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		
//		this.setContentPane(panel);							// ��ü���� panel�� ����
		this.add(label, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
}
