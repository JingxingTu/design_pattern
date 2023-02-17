package factory.factoryMethod.order;

import factory.factoryMethod.pizza.BJCheesePizza;
import factory.factoryMethod.pizza.BJGreekPizza;
import factory.factoryMethod.pizza.Pizza;


public class BJOrderPizza extends OrderPizza{
	@Override
	Pizza createPizza(String orderType) {
		Pizza pizza = null;
		System.out.println("BJ order pizza factory");
		
		if(orderType.equals("greek")) {
			pizza = new BJGreekPizza();
			pizza.setName("BJ greek pizza");
		}else if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
			pizza.setName("BJ cheese pizza");
		}
		return pizza;
	}


}
