package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import drone.DroneInput;
import drone.MulticopterDrone;
import exception.EmailFormatException;
import manager.DroneManager;

public class DroneAdderListener implements ActionListener {

	JTextField fieldSN;
	JTextField fieldName;
	JTextField fieldEmail;
	JTextField fieldManu;
	
	DroneManager droneManager;
	
	public DroneAdderListener(
			JTextField fieldSN,
			JTextField fieldName, 
			JTextField fieldEmail,
			JTextField fieldManu,
			DroneManager droneManager) {
		
		this.fieldSN = fieldSN;
		this.fieldName = fieldName;
		this.fieldEmail = fieldEmail;
		this.fieldManu = fieldManu;
		this.droneManager = droneManager;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		DroneInput drone = new MulticopterDrone();
		try {
			drone.setSerialNum(Integer.parseInt(fieldSN.getText()));
			drone.setName(fieldName.getName());
			drone.setEmail(fieldEmail.getText());
			drone.setManu(fieldManu.getText());
			droneManager.addAircraft(drone);
			putObject(droneManager, "dronemanager.ser");
			drone.printInfo();
		} catch (EmailFormatException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public static void putObject(DroneManager droneManager,String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(droneManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
