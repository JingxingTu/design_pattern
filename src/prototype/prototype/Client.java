package prototype.prototype;

public class Client {

	public static void main(String[] args) {
		
		Sheep sheep = new Sheep("tom",1,"white");
		
		Sheep sheep2 = (Sheep)sheep.clone();

		System.out.print(sheep2);
	}

}
