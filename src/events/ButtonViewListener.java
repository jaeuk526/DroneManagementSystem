package events;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.DroneViewer;
import gui.WindowFrame;
import manager.DroneManager;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DroneViewer droneViewer = frame.getDroneviewer();
		DroneManager droneManager = getObject("dronemanager.ser");
		droneViewer.setDroneManager(droneManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(droneViewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static DroneManager getObject(String filename) {
		DroneManager droneManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			droneManager = (DroneManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return droneManager;			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return droneManager;
	}

}
