import java.util.Scanner;

public class DroneManager {
	
	Drone drone;
	Scanner input;
	
	DroneManager(Scanner input){ //������
		this.input = input; //���� input�� ���� input���� ����ȭ
	}
	
	public void addAircraft() { //�װ��� �߰� �޼ҵ�
		drone = new Drone(); //�⺻ ������ ���
		System.out.print("Aircraft Serial No. ");
		drone.serialNum = input.nextInt();
		System.out.print("Aircraft Name : ");
		drone.name = input.next();
		System.out.print("Aircraft Manufacturer : ");
		drone.manu = input.next();
	}
	
	public void deleteAircraft() { //�װ��� ���� �޼ҵ�
		System.out.print("Enter the Serial Number of the Aircraft to delete : ");
		int AircraftSerialNum = input.nextInt();
		if (drone == null) { //���� �Էµ� ���� �ƹ��͵� �������
			System.out.println("the drone has not been registered");
			return;
		}
		if (AircraftSerialNum == drone.serialNum) { //�Էµ� ���� ������ ���� ��ġ�� �ܿ�
			drone = null; //���� ����
			System.out.println("the drone is deleted");
		}
	}
	
	public void editAircraft() { //�װ��� ���� �޼ҵ�
		System.out.print("Enter the Serial Number of the Aircraft to edit : ");
		int AircraftSerialNum = input.nextInt();
		if (drone.serialNum == AircraftSerialNum) {
			System.out.println("the drone to be edited is " + drone.serialNum);
		}
	}
	
	public void viewAircraft() { //�װ��� ��ȸ �޼ҵ�
		System.out.print("Enter the Serial Number of the Aircraft to edit : ");
		int AircraftSerialNum = input.nextInt();
		if (drone.serialNum == AircraftSerialNum) {
			drone.printInfo(); //��� ���� ���
		}
	}
}
