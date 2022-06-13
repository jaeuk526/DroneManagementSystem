package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import drone.Drone;
import drone.DroneInput;
import drone.HelicopterDrone;
import drone.MulticopterDrone;

public class DroneManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<DroneInput> drones = new ArrayList<DroneInput>();
	transient Scanner input;
	
	
	DroneManager(){}
	DroneManager(Scanner input){
		this.input = input;
	}
	
	public void addAircraft(String ID, String Name, String Email, String manu) {
		DroneInput droneInput = new MulticopterDrone();
		droneInput.getUserInput(input);
		drones.add(droneInput);
	}
	
	public void addAircraft(DroneInput droneInput) {
		drones.add(droneInput);
	}
	
	public void addAircraft() {
		int type = 0;
		Drone droneInput;
		
		while (type != 1 && type != 2) {
			try {
				System.out.print("1 for Multicopter ");
				System.out.println("2 for Helicopter ");
				System.out.print("Select number for Drone Type between 1 and 2: ");
				type = input.nextInt();
				if (type == 1) {
					droneInput = new MulticopterDrone();
					droneInput.getUserInput(input);
					drones.add(droneInput);
					break;
				}
				else if (type == 2) {
					droneInput = new HelicopterDrone();
					droneInput.getUserInput(input);
					drones.add(droneInput);
					break;
				}
				else {
					System.out.print("Select number for Drone Type");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 and 3");
				if (input.hasNext()) {
					input.next();
				}
				type = 0;
			}
		}
	}
	
	public void deleteAircraft() {
		System.out.print("Enter the Serial Number of the Aircraft to delete : ");
		int AircraftSerialNum = input.nextInt();
		int index = findIndex(AircraftSerialNum);
		removeFromDrones(index, AircraftSerialNum);
	}
	
	public int findIndex(int AircraftSerialNum) {
		int index = -1;
		for (int i = 0; i < drones.size(); i++) {
			if (drones.get(i).getSerialNum() == AircraftSerialNum) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removeFromDrones(int index,int AircraftSerialNum) {
		if (index >= 0) {
			drones.remove(index);
			System.out.println("The drone " + AircraftSerialNum + " is deleted");
			return 1;
		}
		else {
			System.out.println("the drone has not been registered");
			return -1;
		}
	}
	
	public void editAircraft() {
		System.out.print("Enter the Serial Number of the Aircraft to edit : ");
		
		int AircraftSerialNum = input.nextInt();
		for(int i = 0; i < drones.size(); i++) {
			DroneInput drone = drones.get(i);
			if (drone.getSerialNum() == AircraftSerialNum) {
				int num = -1;
				while(num != 5) {
					showEditMenu();
					num = input.nextInt();
					
					switch(num) {
					case 1:
						drone.setDroneSN(input);
						break;
					case 2:
						drone.setDroneName(input);
						break;
					case 3:
						drone.setDroneManu(input);
						break;
					case 4:
						drone.setEmail(input);
						break;
					default:
						continue;
					}
				
				}
				break;
			}
		}
	}
	
	public void viewAircrafts() {
		System.out.println("# of registered drones: " + drones.size());
		for (int i = 0; i < drones.size(); i++) {
			drones.get(i).printInfo();
		}
	}
	
	public int size() {
		return drones.size();
	}
	
	public DroneInput get(int index) {
		return (Drone) drones.get(index);
	}
	
	public void showEditMenu() {
		System.out.println("** Drone Info Edit Menu **");
		System.out.println(" 1. Edit Serial Number");
		System.out.println(" 2. Edit Name");
		System.out.println(" 3. Edit Manufacturer");
		System.out.println(" 4. Edit Email");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5");
	}
}
