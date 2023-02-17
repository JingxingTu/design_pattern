package factory.factoryMethod.pizza;

public class BJCheesePizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("preparing Beijing cheese pizza...");
	}

}
