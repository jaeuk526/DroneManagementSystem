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
	
	public void printInfo(){ //정보 출력
		String type = getTypeString();
		System.out.println("type: " + type + " name: " + name + " serialNum: " + serialNum + " maufacturer: " + manu + " email: " + email);
	}
	
	
	public String getTypeString() {
		String dtype = "none";
		switch(this.type) {
		case Multicoptor:
			dtype = "Multicopter";
			break;
		case CoaxialRotor:
			dtype = "CoaxialRotor";
			break;
		case Ctol:
			dtype = "Ctol";
			break;
		case Helicopter:
			dtype = "Helicopter";
			break;
		case Stol:
			dtype = "Stol";
			break;
		case Vtol:
			dtype = "Vtol";
			break;
		default:
			break;
		}
		return dtype;
	}
	
}
