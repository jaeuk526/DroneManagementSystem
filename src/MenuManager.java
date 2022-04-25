import java.util.Scanner;

public class MenuManager{

	public static void main(String[] args) { //메인함수
		Scanner input = new Scanner(System.in);
		DroneManager droneManager = new DroneManager(input);
		int num = -1;

		while (num != 5) {
			System.out.println("1. Add Aircraft");
			System.out.println("2. Delete Aircraft");
			System.out.println("3. Edit Aircraft");
			System.out.println("4. View Aircrafts");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1 - 5: ");
			num = input.nextInt();
	
			if (num == 1) {
				droneManager.addAircraft();
			}
			else if (num == 2) {
				droneManager.deleteAircraft();
			}
			else if (num == 3){
				droneManager.editAircraft();
			}
			else if (num == 4){
				droneManager.viewAircrafts();
			}
		}
		
	}
	
}
