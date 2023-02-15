package principle.singleresponsbility;

public class SingleResponsbility3 {
	public static void main(String[] args) {
		Vehicle3 v = new Vehicle3();
		v.runRoad("moto");
		v.runRoad("car");
		v.runAir("plane");
	}

}

// method 3:
//1) Reduce the complexity of the class, a class is only responsible for one responsibility.
//2) Improve the readability and maintainability of the class
//3) Reduce the risk caused by changes
//4) Under normal circumstances, we should abide by the single responsibility principle. 
//	Only when the logic is simple enough can we violate it at the code level
//   Anti-Single Responsibility Principle; only the number of methods in the class 
//		is small enough to maintain the Single Responsibility Principle at the method level
class Vehicle3{
	public void runRoad(String vehicle) {
		System.out.println(vehicle + " is running...");
	}
	
	public void runAir(String vehicle) {
		System.out.println(vehicle + " is flying...");
	}
	
	public void runWater(String vehicle) {
		System.out.println(vehicle + " is flying...");
	}
}