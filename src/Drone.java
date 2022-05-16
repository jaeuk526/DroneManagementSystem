import java.util.Scanner;

public abstract class Drone implements DroneInput{
	protected DroneType type; //캡슐화
	protected String name;
	protected int serialNum;
	protected String manu;
	protected String email;
	
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
	
	public void setEmail(String email) throws EmailFormatException {
		if (!email.contains("@") && !email.equals("")) {
			throw new EmailFormatException();
		}
		this.email = email;
	}

	
	public Drone(){}
	public Drone(String name, int serialNum, String manu,String email){
		this.name = name;
		this.serialNum = serialNum;
		this.manu = manu;
		this.email = email;
	}
	
	public void getUserInput(Scanner input) {
		setDroneSN(input);
		setDroneName(input);
		setDroneManu(input);
		setEmail(input);
		System.out.println("");
	}
	
	
	
	public void setDroneSN(Scanner input) {
		System.out.print("Aircraft Serial No. ");
		int serialNum = input.nextInt();
		this.setSerialNum(serialNum);
	}
	
	public void setDroneName(Scanner input) {
		System.out.println("Drone Name: ");
		String name = input.next();
		this.setName(name);
	}
	
	public void setDroneManu(Scanner input) {
		System.out.println("Drone Manufacturer: ");
		String manufacturer = input.next();
		this.setManu(manufacturer);
	}
	
	public void setEmail(Scanner input) {
		String email = "";
		while (!email.contains("@") || email.equals("")) {
			System.out.println("Email: ");
			email = input.next();
			try {
				this.setEmail(email);
			} catch(EmailFormatException e) {
				System.out.println("Incorrect Email Format, put the e-mail address that contains @");
			}
		}
	}
}
