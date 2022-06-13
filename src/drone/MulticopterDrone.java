package drone;

public class MulticopterDrone extends Drone {
	public MulticopterDrone(){
		setType(DroneType.Multicoptor);
	}

	@Override
	public void printInfo() {
		String type = "Multicopter";
		System.out.println("type: " + type + " name: " + name + " serialNum: " + serialNum + " maufacturer: " + manu + " email: " + email);
	}
}
