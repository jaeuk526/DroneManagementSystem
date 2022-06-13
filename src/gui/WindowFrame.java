package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.DroneManager;

public class WindowFrame extends JFrame{

	DroneManager droneManager;
	MenuSelection menuselection;
	DroneAdder droneadder;
	DroneViewer droneviewer;
	
	public WindowFrame(DroneManager droneManager) {
		
		this.droneManager = droneManager;
		menuselection = new MenuSelection(this);
		droneadder = new DroneAdder(this, this.droneManager);
		droneviewer = new DroneViewer(this, this.droneManager);
				
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
		
	}

	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}


	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}


	public DroneAdder getDroneadder() {
		return droneadder;
	}


	public void setDroneadder(DroneAdder droneadder) {
		this.droneadder = droneadder;
	}


	public DroneViewer getDroneviewer() {
		return droneviewer;
	}


	public void setDroneviewer(DroneViewer droneviewer) {
		this.droneviewer = droneviewer;
	}


}
