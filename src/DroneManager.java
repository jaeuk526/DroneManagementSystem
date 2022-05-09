import java.util.ArrayList;
import java.util.Scanner;

public class DroneManager {
	ArrayList<DroneInput> drones = new ArrayList<DroneInput>();
	Scanner input;
	
	
	DroneManager(){}
	DroneManager(Scanner input){
		this.input = input;
	}
	
	public void addAircraft() { //항공기 추가 메소드
		int type = 0;
		Drone droneInput;
		
		while (type != 1 && type != 2) {
			System.out.print("1 for Multicopter ");
			System.out.println("2 for Helicopter ");
			System.out.print("Select number for Drone Type between 1 and 2: ");
			type = input.nextInt();
			if (type == 1) { //멀티콥터의 경우
				droneInput = new MulticopterDrone();
				droneInput.getUserInput(input);
				drones.add(droneInput);
				break;
			}
			else if (type == 2) { //헬리콥터의 경우 
				droneInput = new HelicopterDrone();
				droneInput.getUserInput(input);
				drones.add(droneInput);
				break;
			}
			else {
				System.out.print("Select number for Drone Type");
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
			DroneInput droneInput = drones.get(i);
			if (droneInput.getSerialNum() == AircraftSerialNum) {
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
						droneInput.setSerialNum(input.nextInt());
					}
					else if(num == 2) {
						System.out.println("Drone Name: ");
						droneInput.setName(input.next());
					}
					else if(num == 3) {
						System.out.println("Drone Manufacturer: ");
						droneInput.setManu(input.next());
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
