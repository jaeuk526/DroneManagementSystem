import java.util.Scanner; //Ŭ���� �Լ� ȣ��

public class MenuManager{ //�޴� ���� Ŭ����
	

	public static void main(String[] args) { //�����Լ�
		
		Scanner input = new Scanner(System.in);
		int num = 5; 
		//�ʱ� ����
		
		while (num != 6) { //num �Է��� 6�� ���� �ʴ��� �� �ݺ����� ��� �����Ұ�
			System.out.println("1. Add Aircraft");
			System.out.println("2. Delete Aircraft");
			System.out.println("3. Edit Aircraft");
			System.out.println("4. View Aircraft");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1 - 6: ");
			num = input.nextInt(); //�Է°��� num ������ ����
	
			if (num == 1) { //num�� 1�� �Էµɰ�� �Ʒ� �޼ҵ带 ����
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
	//==============================�޼ҵ� ��Ʈ ����=================================
	public static void addAircraft() { //�װ��� �߰� �޼ҵ�
		Scanner input = new Scanner(System.in);
		System.out.print("Aircraft Serial No. ");
		int AircraftSerialNum = input.nextInt();
		System.out.print("Aircraft Name : ");
		String AircraftName = input.next();
		System.out.print("Aircraft Manufacturer : ");
		String AircraftManu = input.next();
	}
	
	public static void deleteAircraft() { //�װ��� ���� �޼ҵ�
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Serial Number of the Aircraft to delete : ");
		int AircraftSerialNum = input.nextInt();
	}
	
	public static void editAircraft() { //�װ��� ���� �޼ҵ�
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Serial Number of the Aircraft to edit : ");
		int AircraftSerialNum = input.nextInt();
	}
	
	public static void viewAircraft() { //�װ��� ��ȸ �޼ҵ�
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Serial Number of the Aircraft to edit : ");
		int AircraftSerialNum = input.nextInt();
	}
	
}