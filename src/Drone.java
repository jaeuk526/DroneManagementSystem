
public class Drone {
	String name;
	int serialNum;
	String manu; //�ʵ� ����

	public Drone(){ //�⺻ ������
		
	}
	
	public Drone(String name, int serialNum, String manu){
		this.name = name; //Ŭ������ ������ �Է¹��� ������ ����
		this.serialNum = serialNum;
		this.manu = manu;
	}
	
	public void printInfo(){ //���� ��� �޼ҵ�
		System.out.println("name: " + name + " serialNum: " + serialNum + " maufacturer: " + manu);
	}
}