import java.util.Scanner; //Ŭ���� �Լ� ȣ��

public class MenuManager{
	
	public static void main(String[] args) {
		
		int num = 0; //num ���� ����
		Scanner input = new Scanner(System.in); //input ���� ����
		
		while (num != 6){
			
			int AircraftSerialNum = 0;
			String AircraftName = null;
			String AircraftManu = null;
			//���� ������ ���� �� �ʱ�ȭ
			
			System.out.println("1. Add Aircraft");
			System.out.println("2. Delete Aircraft");
			System.out.println("3. Edit Aircraft");
			System.out.println("4. View Aircraft");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1 - 6: ");
			num = input.nextInt(); //�Է°��� num ������ ����

			switch(num) {
			
			case 1: //��ü �߰�
				System.out.print("Aircraft Serial No. "); //��ü�� �ø��� �ѹ�
				AircraftSerialNum = input.nextInt(); //���� ���� �Է°��� AircraftSerialNum ������ ����
				System.out.print("Aircraft Name : "); //��ü��
				AircraftName = input.next(); //�Է°��� AircraftName ������ ����
				System.out.print("Aircraft Manufacturer : "); //��ü ���ۻ�
				AircraftManu = input.next(); //�Է°��� AircraftManu ������ ����
				break; //Case 1 �������� ����������
			case 2: //��ü ����
				System.out.print("Enter the Serial Number of the Aircraft to delete : ");
				AircraftSerialNum = input.nextInt();
				break; //Case 2 �������� ����������
			case 3: //��ü ����
				System.out.print("Enter the Serial Number of the Aircraft to edit : ");
				AircraftSerialNum = input.nextInt();
				break; //Case 3 �������� ����������
			case 4: //��ü ��ȸ
				System.out.print("Enter the Serial Number of the Aircraft to view : ");
				AircraftSerialNum = input.nextInt();
				break; //Case 4 �������� ����������
			case 5: //�޴�
				break; //Case 5 �������� ����������
			case 6: //����
				System.out.print("�ý����� �����մϴ�");
				break; //Case 6 �������� ����������
			}
		}
	}
}