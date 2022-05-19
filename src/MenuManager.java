


import java.util.*;

public class MenuManager{

	public static void main(String[] args) { //λ©μΈ?¨?
		Scanner input = new Scanner(System.in);
		DroneManager droneManager = new DroneManager(input);
		selectMenu(input,droneManager);
		
	}
	
	public static void selectMenu(Scanner input,DroneManager droneManager) {
		int num = -1;

		while (num != 5) {
			
			try {
				showMenu(); //λ©λ΄?¨?λ₯? ?°λ‘? ??±
				num = input.nextInt();
	
				switch(num) { //if else λ¬? ???  switchλ¬Έμ ?¬?©
				case 1:
					droneManager.addAircraft();
					break;
				case 2:
					droneManager.deleteAircraft();
					break;
				case 3:
					droneManager.editAircraft();
					break;
				case 4:
					droneManager.viewAircrafts();
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
		System.out.print("Select one number between 1 - 5: ");
	}
}
