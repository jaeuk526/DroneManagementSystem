package drone;
import java.util.Scanner;

public class HelicopterDrone extends Drone {
	
	public HelicopterDrone(){
		setType(DroneType.Helicopter);
	}
	

	
	public void getUserInput(Scanner input) {

		char answer = 'x';

		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			
			System.out.print("does this drone has a email address? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				setEmail(input);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				break;
			}
			else {}
		}		
		setDroneSN(input);
		setDroneName(input);
		setDroneManu(input);
	}
}
