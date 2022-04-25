import java.util.ArrayList;
import java.util.Scanner;

import drone.Drone;
import drone.HelicopterDrone;

public class DroneManager {
	ArrayList<Drone> drones = new ArrayList<Drone>();
	Scanner input;
	
	
	DroneManager(){}
	DroneManager(Scanner input){
		this.input = input;
	}
	
	public void addAircraft() { //항공기 추가 메소드
		int kind = 0;
		Drone drone;
		
		while (kind != 1 && kind != 2) {
			System.out.print("1 for Multicopter ");
			System.out.print("2 for Helicopter ");
			System.out.print("Select num for Drone Type between 1 and 2: ");
			kind = input.nextInt();
			if (kind == 1) {
				drone = new Drone();
				drone.getUserInput(input);
				drones.add(drone);
				break;
			}
			else if (kind == 2) {
				drone = new HelicopterDrone();
				drone.getUserInput(input);
				drones.add(drone);
				break; 
			}
			else {
				System.out.print("Select num for Drone Type");
			}
		}
	}
	
	public void deleteAircraft() { //항공기 삭제 메소드
		System.out.print("Enter the Serial Number of the Aircraft to delete : ");
		int AircraftSerialNum = input.nextInt();
		int index = -1; // array 에서 index를 못찾았다는 의미
		for (int i = 0; i < drones.size(); i++) {
			if (drones.get(i).getSerialNum() == AircraftSerialNum) {
				index = i;
				break;
			}
			else {
				System.out.println("the drone has not been registered");
				return;
			}
		}
		
		if (index >= 0) {
			drones.remove(index);
			System.out.println("The drone " + AircraftSerialNum + " is deleted");
		}
	}
	
	public void editAircraft() { //항공기 편집 메소드
		System.out.print("Enter the Serial Number of the Aircraft to edit : ");
		
		int AircraftSerialNum = input.nextInt();
		for(int i = 0; i < drones.size(); i++) {
			Drone drone = drones.get(i);
			if (drone.getSerialNum() == AircraftSerialNum) {
				int num = -1;
				while(num != 5) {
					System.out.println("** Drone Info Edit Menu **");
					System.out.println(" 1. Edit Serial Number");
					System.out.println(" 2. Edit Name");
					System.out.println(" 3. Edit Manufacturer");
					System.out.println(" 4. Exit");
					System.out.println("Select one number between 1 - 4");
					num = input.nextInt();
					if(num == 1) {
						System.out.println("Drone Serial Number: ");
						drone.setSerialNum(input.nextInt());
					}
					else if(num == 2) {
						System.out.println("Drone Name: ");
						drone.setName(input.next());
					}
					else if(num == 3) {
						System.out.println("Drone Manufacturer: ");
						drone.setManu(input.next());
					}
					else if(num == 4) {
						break;
					}
					else {
						continue;
					}
				
				}
				break;
			}
		}
	}
	
	public void viewAircrafts() { //항공기 조회 메소드
		System.out.println("# of registered drones: " + drones.size());
		for (int i = 0; i < drones.size(); i++) {
			drones.get(i).printInfo();
		}
	}
}
