package principle.singleresponsbility;

public class SingleResponsbility1 {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.run("moto");
		v.run("car");
		v.run("plane");
	}

}

// method 1:
// "plane" Violates the Single Responsibility Principle
class Vehicle{
	public void run(String vehicle) {
		System.out.println(vehicle + " is running...");
	}
}