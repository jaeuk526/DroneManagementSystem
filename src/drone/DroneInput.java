package drone;
import java.util.Scanner;

import exception.EmailFormatException;

public interface DroneInput {
	public void getUserInput(Scanner input);
	
	public void setSerialNum(int serialNum);
	
	public String getName();
	
	public void setName(String name);
	
	public String getEmail();
	
	public void setManu(String manu);
	
	public String getManu();
	
	public int getSerialNum();
	
	public void printInfo();
	
	public void setDroneSN(Scanner input);
	
	public void setDroneName(Scanner input);
	
	public void setDroneManu(Scanner input);
	
	public void setEmail(Scanner input);
	public void setEmail(String string) throws EmailFormatException;
}
