package factory.factoryMethod.pizza;

public class LDGreekPizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("preparing London greek pizza...");
	}

}
