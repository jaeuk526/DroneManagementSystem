
public class Drone {
	String name;
	int serialNum;
	String manu; //필드 선언

	public Drone(){ //기본 생성자
		
	}
	
	public Drone(String name, int serialNum, String manu){
		this.name = name; //클래스의 변수를 입력받은 변수로 선언
		this.serialNum = serialNum;
		this.manu = manu;
	}
	
	public void printInfo(){ //정보 출력 메소드
		System.out.println("name: " + name + " serialNum: " + serialNum + " maufacturer: " + manu);
	}
}