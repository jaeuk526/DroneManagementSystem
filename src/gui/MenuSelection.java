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
		
		JPanel panel = new JPanel();						//기본이 flow layout
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add Student");
		JButton button2 = new JButton("View Student");
		JButton button3 = new JButton("Edit Student");
		JButton button4 = new JButton("Delete Student");
		JButton button5 = new JButton("Exit Program");
		
		panel.add(label);									//만들어진 Jlabel을 panel에다 붙이기
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		
//		this.setContentPane(panel);							// 전체판이 panel로 설정
		this.add(label, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
}
