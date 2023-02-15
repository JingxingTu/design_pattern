package principle.singleresponsbility;

public class SingleResponsbility2 {

	public static void main(String[] args) {
		RoadVehicle moto = new RoadVehicle();
		AirVehicle plane = new AirVehicle();
		WaterVehicle ship = new WaterVehicle();
		
		moto.run("moto");
		plane.run("car");
		ship.run("plane");

	}

}


//method 2:
//create 3 classes，Comply with the principle of single responsibility,
// but the changes are very large. 
// Decompose the class and change the client at the same time
// Improvement: directly modify the vehicle class

class RoadVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle + " is running on the road...");
	}
}

class AirVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle + " is flying in the sky...");
	}
}

class WaterVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle + " is swimming in the water...");
	}
}