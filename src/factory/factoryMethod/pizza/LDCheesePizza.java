package factory.factoryMethod.pizza;

public class LDCheesePizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("preparing London cheese pizza...");
	}

}
