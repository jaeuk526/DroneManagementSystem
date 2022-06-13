package manager;


import log.EventLogger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import gui.WindowFrame;

public class MenuManager{
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DroneManager droneManager = getObject("dronemanager.ser");

		if(droneManager == null) {
			droneManager = new DroneManager(input); 
		}
		
		WindowFrame frame = new WindowFrame(droneManager);
		
		selectMenu(input,droneManager);
		putObject(droneManager,"dronemanager.ser");
	}
	
	public static void selectMenu(Scanner input,DroneManager droneManager) {
		int num = -1;

		while (num != 5) {
			
			try {
				showMenu();
				num = input.nextInt();
	
				switch(num) {
				case 1:
					droneManager.addAircraft();
					logger.log("add a drone");
					break;
				case 2:
					droneManager.deleteAircraft();
					logger.log("delete a drone");
					break;
				case 3:
					droneManager.editAircraft();
					logger.log("edit a drone");
					break;
				case 4:
					droneManager.viewAircrafts();
					logger.log("view a list of drone");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e){
				System.out.println("please put an integer between 1 and 5");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("1. Add Aircraft");
		System.out.println("2. Delete Aircraft");
		System.out.println("3. Edit Aircraft");
		System.out.println("4. View Aircrafts");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5: ");
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
