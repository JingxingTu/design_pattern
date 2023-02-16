package factory.simplefactory.order;

import factory.simplefactory.pizza.CheesePizza;
import factory.simplefactory.pizza.GreekPizza;
import factory.simplefactory.pizza.Pizza;

public class SimpleFactory {

	public Pizza createPizza(String orderType) {
		Pizza pizza = null;
		System.out.println("use simple factory");
		
		if(orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("greek pizza");
		}else if(orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("cheese pizza");
		}
		return pizza;
	}
}
