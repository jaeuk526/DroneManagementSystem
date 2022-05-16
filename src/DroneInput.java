import java.util.Scanner;

public interface DroneInput {
	public void getUserInput(Scanner input);
	
	public void setSerialNum(int serialNum);
	
	public void setName(String name);
	
	public void setManu(String manu);
	
	public int getSerialNum();
	
	public void printInfo();
	
	public void setDroneSN(Scanner input);
	
	public void setDroneName(Scanner input);
	
	public void setDroneManu(Scanner input);
	
	public void setEmail(Scanner input);
}
