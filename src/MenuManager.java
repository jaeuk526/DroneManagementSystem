import java.util.Scanner; //클래스 함수 호출

public class MenuManager{ //메뉴 관리 클래스
	

	public static void main(String[] args) { //메인함수
		Scanner input = new Scanner(System.in);
		DroneManager droneManager = new DroneManager(input);
		int num = -1; 
		//초기 설정
		
		while (num != 5) { //num 입력이 6이 되지 않는한 이 반복문을 계속 실행할것
			System.out.println("1. Add Aircraft");
			System.out.println("2. Delete Aircraft");
			System.out.println("3. Edit Aircraft");
			System.out.println("4. View Aircraft");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1 - 5: ");
			num = input.nextInt(); //입력값을 num 변수로 설정
	
			if (num == 1) {
				droneManager.addAircraft(); //num이 1일 경우 droneManager클래스의 항공기 추가 메소드 실행
			}
			else if (num == 2) {
				droneManager.deleteAircraft();
			}
			else if (num == 3){
				droneManager.editAircraft();
			}
			else if (num == 4){
				droneManager.viewAircraft();
			}
		}
		
	}
	
}