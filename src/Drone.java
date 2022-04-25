package drone;
import java.util.Scanner;

public class Drone {
	protected DroneType type = DroneType.Multicoptor; //캡슐화
	protected String name;
	protected int serialNum;
	protected String manu;
	
	public DroneType getType() {
		return type;
	}
	
	public void setType(DroneType type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSerialNum() {
		return serialNum;
	}
	
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	
	public String getManu() {
		return manu;
	}
	
	public void setManu(String manu) {
		this.manu = manu;
	}

	
	public Drone(){}
	public Drone(String name, int serialNum, String manu){ //생성자
		this.name = name;
		this.serialNum = serialNum;
		this.manu = manu;
	}
	
	public void printInfo(){ //정보 출력
		System.out.println("name: " + name + " serialNum: " + serialNum + " maufacturer: " + manu);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Aircraft Serial No. ");
		int serialNum = input.nextInt();
		this.setSerialNum(serialNum);
		
		System.out.print("Aircraft Name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Aircraft Manufacturer : ");
		String manu = input.next();
		this.setManu(manu);
	}
}
