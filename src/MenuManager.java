import java.util.Scanner; //Ŭ���� �Լ� ȣ��

public class MenuManager{ //�޴� ���� Ŭ����
	

	public static void main(String[] args) { //�����Լ�
		Scanner input = new Scanner(System.in);
		DroneManager droneManager = new DroneManager(input);
		int num = -1; 
		//�ʱ� ����
		
		while (num != 5) { //num �Է��� 6�� ���� �ʴ��� �� �ݺ����� ��� �����Ұ�
			System.out.println("1. Add Aircraft");
			System.out.println("2. Delete Aircraft");
			System.out.println("3. Edit Aircraft");
			System.out.println("4. View Aircraft");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1 - 5: ");
			num = input.nextInt(); //�Է°��� num ������ ����
	
			if (num == 1) {
				droneManager.addAircraft(); //num�� 1�� ��� droneManagerŬ������ �װ��� �߰� �޼ҵ� ����
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