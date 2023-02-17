package factory.factoryMethod.order;

import factory.factoryMethod.pizza.BJCheesePizza;
import factory.factoryMethod.pizza.BJGreekPizza;
import factory.factoryMethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza{
	Pizza createPizza(String orderType) {
		Pizza pizza = null;
		System.out.println("LD order pizza factory");
		
		if(orderType.equals("greek")) {
			pizza = new BJGreekPizza();
			pizza.setName("LD greek pizza");
		}else if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
			pizza.setName("LD cheese pizza");
		}
		return pizza;
	}
}
