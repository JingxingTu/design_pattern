package bulider.bulider;

public class Client {

	public static void main(String[] args) {
		

		
		CommonHouse ch = new CommonHouse();
		
		HouseDirector hd = new HouseDirector(ch);
		
		House house = hd.constructHouse();
		
		System.out.println("--------------------");
		
		HighBuilding hb = new HighBuilding();
		
		hd.setHouseBuilder(hb);
		
		hd.constructHouse();

	}

}
