import java.util.Scanner;

public class MenuManager{

	public static void main(String[] args) { //메인함수
		Scanner input = new Scanner(System.in);
		DroneManager droneManager = new DroneManager(input);
		int num = -1;

		while (num != 5) {
			showMenu(); //메뉴함수를 따로 생성
			num = input.nextInt();

			switch(num) { //if else 문 대신 switch문을 사용
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
