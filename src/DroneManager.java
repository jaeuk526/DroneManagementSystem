import java.util.Scanner;

public class DroneManager {
	
	Drone drone;
	Scanner input;
	
	DroneManager(Scanner input){ //생성자
		this.input = input; //받은 input을 여기 input으로 동기화
	}
	
	public void addAircraft() { //항공기 추가 메소드
		drone = new Drone(); //기본 생성자 사용
		System.out.print("Aircraft Serial No. ");
		drone.serialNum = input.nextInt();
		System.out.print("Aircraft Name : ");
		drone.name = input.next();
		System.out.print("Aircraft Manufacturer : ");
		drone.manu = input.next();
	}
	
	public void deleteAircraft() { //항공가 삭제 메소드
		System.out.print("Enter the Serial Number of the Aircraft to delete : ");
		int AircraftSerialNum = input.nextInt();
		if (drone == null) { //만약 입력된 값이 아무것도 없을경우
			System.out.println("the drone has not been registered");
			return;
		}
		if (AircraftSerialNum == drone.serialNum) { //입력된 값이 기존의 값과 일치할 겨우
			drone = null; //정보 삭제
			System.out.println("the drone is deleted");
		}
	}
	
	public void editAircraft() { //항공기 편집 메소드
		System.out.print("Enter the Serial Number of the Aircraft to edit : ");
		int AircraftSerialNum = input.nextInt();
		if (drone.serialNum == AircraftSerialNum) {
			System.out.println("the drone to be edited is " + drone.serialNum);
		}
	}
	
	public void viewAircraft() { //항공기 조회 메소드
		System.out.print("Enter the Serial Number of the Aircraft to edit : ");
		int AircraftSerialNum = input.nextInt();
		if (drone.serialNum == AircraftSerialNum) {
			drone.printInfo(); //드론 정보 출력
		}
	}
}
