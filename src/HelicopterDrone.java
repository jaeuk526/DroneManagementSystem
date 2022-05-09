import java.util.Scanner;

public class HelicopterDrone extends Drone implements DroneInput {
	
	HelicopterDrone(){
		setType(DroneType.Helicopter);
	}
	
	public void getUserInput(Scanner input) {

		char answer = 'x';

		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			
			System.out.print("does this drone has a serial number? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Aircraft Serial No. ");
				int serialNum = input.nextInt();
				this.setSerialNum(serialNum);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setSerialNum(0);
				break;
			}
			else {}
		}		
		System.out.print("Aircraft Name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Aircraft Manufacturer : ");
		String manu = input.next();
		this.setManu(manu);
	}
	
	
	
}
