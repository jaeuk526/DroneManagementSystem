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
		int index = findIndex(AircraftSerialNum);
		removeFromDrones(index, AircraftSerialNum);
	}
	
	public int findIndex(int AircraftSerialNum) {
		int index = -1; // array 에서 index를 못찾았다는 의미
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
	
	public void editAircraft() { //항공기 편집 메소드
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
						drone.setDroneSN(input); //droneInput > drone
						break;
					case 2:
						drone.setDroneName(input);
						break;
					case 3:
						drone.setDroneManu(input);
						break;
					case 4:
						break;
					default:
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
	
	
	public void showEditMenu() { //메뉴화면 표시 메소드
		System.out.println("** Drone Info Edit Menu **");
		System.out.println(" 1. Edit Serial Number");
		System.out.println(" 2. Edit Name");
		System.out.println(" 3. Edit Manufacturer");
		System.out.println(" 4. Exit");
		System.out.println("Select one number between 1 - 4");
	}
}
