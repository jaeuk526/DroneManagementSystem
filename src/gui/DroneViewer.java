package gui;


import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import drone.DroneInput;
import manager.DroneManager;

public class DroneViewer extends JPanel {
	
	WindowFrame frame;
	DroneManager droneManager;
	
	public DroneViewer(WindowFrame frame, DroneManager droneManager) {
		this.frame = frame;
		this.droneManager = droneManager;
		
		System.out.println("***" + droneManager.size() + "***");
		
//		String column[] = {"ID","NAME","E-MAIL","MANUFACTURER"};
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("S/N");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Manufacturer");
		
		for(int i = 0; i< droneManager.size(); i++) {
			Vector row = new Vector();
			DroneInput si = droneManager.get(i);
			row.add(si.getSerialNum());
			row.add(si.getName());
			row.add(si.getEmail());
			row.add(si.getManu());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}
}
