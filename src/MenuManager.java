import java.util.Scanner; //클래스 함수 호출

public class MenuManager{
	
	public static void main(String[] args) {
		
		int num = 0; //num 변수 선언
		Scanner input = new Scanner(System.in); //input 변수 선언
		
		while (num != 6){
			
			int AircraftSerialNum = 0;
			String AircraftName = null;
			String AircraftManu = null;
			//각종 변수들 선언 및 초기화
			
			System.out.println("1. Add Aircraft");
			System.out.println("2. Delete Aircraft");
			System.out.println("3. Edit Aircraft");
			System.out.println("4. View Aircraft");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1 - 6: ");
			num = input.nextInt(); //입력값을 num 변수로 설정

			switch(num) {
			
			case 1: //기체 추가
				System.out.print("Aircraft Serial No. "); //기체의 시리얼 넘버
				AircraftSerialNum = input.nextInt(); //다음 정수 입력값을 AircraftSerialNum 변수로 설정
				System.out.print("Aircraft Name : "); //기체명
				AircraftName = input.next(); //입력값을 AircraftName 변수로 설정
				System.out.print("Aircraft Manufacturer : "); //기체 제작사
				AircraftManu = input.next(); //입력값을 AircraftManu 변수로 설정
				break; //Case 1 구문에서 빠져나오기
			case 2: //기체 제거
				System.out.print("Enter the Serial Number of the Aircraft to delete : ");
				AircraftSerialNum = input.nextInt();
				break; //Case 2 구문에서 빠져나오기
			case 3: //기체 변경
				System.out.print("Enter the Serial Number of the Aircraft to edit : ");
				AircraftSerialNum = input.nextInt();
				break; //Case 3 구문에서 빠져나오기
			case 4: //기체 조회
				System.out.print("Enter the Serial Number of the Aircraft to view : ");
				AircraftSerialNum = input.nextInt();
				break; //Case 4 구문에서 빠져나오기
			case 5: //메뉴
				break; //Case 5 구문에서 빠져나오기
			case 6: //종료
				System.out.print("시스템을 종료합니다");
				break; //Case 6 구문에서 빠져나오기
			}
		}
	}
}