import java.util.Scanner;

public abstract class Drone implements DroneInput{
	protected DroneType type; //캡슐화
	protected String name;
	protected int serialNum;
	protected String manu;
	
	/*getter, setter method*/
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
	public Drone(String name, int serialNum, String manu){
		this.name = name;
		this.serialNum = serialNum;
		this.manu = manu;
	}
	
	public void getUserInput(Scanner input) {
		setDroneSN(input);
		setDroneName(input);
		setDroneManu(input);
		System.out.println("");
	}
	
	public void setDroneSN(Scanner input) {
		System.out.print("Aircraft Serial No. ");
		int serialNum = input.nextInt();
		this.setSerialNum(serialNum);
	}
	
	public void setDroneName(Scanner input) {
		System.out.println("Drone Name: ");
		int name = input.nextInt();
		this.setSerialNum(name);
	}
	
	public void setDroneManu(Scanner input) {
		System.out.println("Drone Manufacturer: ");
		int manufacturer = input.nextInt();
		this.setSerialNum(manufacturer);
	}
}
