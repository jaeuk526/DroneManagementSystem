package gui;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DroneViewer extends JFrame {
	public DroneViewer() {
//		String column[] = {"ID","NAME","E-MAIL","MANUFACTURER"};
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("S/N");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Manufacturer");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		/* 기본적인 부분 */
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
	}
}
