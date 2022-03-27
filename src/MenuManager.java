import java.util.Scanner; //클래스 함수 호출

public class MenuManager{ //메뉴 관리 클래스
	

	public static void main(String[] args) { //메인함수
		
		Scanner input = new Scanner(System.in);
		int num = 5; 
		//초기 설정
		
		while (num != 6) { //num 입력이 6이 되지 않는한 이 반복문을 계속 실행할것
			System.out.println("1. Add Aircraft");
			System.out.println("2. Delete Aircraft");
			System.out.println("3. Edit Aircraft");
			System.out.println("4. View Aircraft");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1 - 6: ");
			num = input.nextInt(); //입력값을 num 변수로 설정
	
			if (num == 1) { //num이 1로 입력될경우 아래 메소드를 실행
				addAircraft();
			}
			else if (num == 2) {
				deleteAircraft();
			}
			else if (num == 3){
				editAircraft();
			}
			else if (num == 4){
				viewAircraft();
			}
		}
		
	}
	//==============================메소드 파트 시작=================================
	public static void addAircraft() { //항공기 추가 메소드
		Scanner input = new Scanner(System.in);
		System.out.print("Aircraft Serial No. ");
		int AircraftSerialNum = input.nextInt();
		System.out.print("Aircraft Name : ");
		String AircraftName = input.next();
		System.out.print("Aircraft Manufacturer : ");
		String AircraftManu = input.next();
	}
	
	public static void deleteAircraft() { //항공가 삭제 메소드
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Serial Number of the Aircraft to delete : ");
		int AircraftSerialNum = input.nextInt();
	}
	
	public static void editAircraft() { //항공기 편집 메소드
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Serial Number of the Aircraft to edit : ");
		int AircraftSerialNum = input.nextInt();
	}
	
	public static void viewAircraft() { //항공기 조회 메소드
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Serial Number of the Aircraft to edit : ");
		int AircraftSerialNum = input.nextInt();
	}
	
}