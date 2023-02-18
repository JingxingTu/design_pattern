package factory.abcFactory.order;

import factory.abcFactory.pizza.LDCheesePizza;
import factory.abcFactory.pizza.LDGreekPizza;
import factory.abcFactory.pizza.Pizza;

public class LDFactory implements AbsFactory{

	public Pizza createPizza(String orderType) {
		System.out.println("create LD pizza");
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		}else if(orderType.equals("greek")){
			pizza = new LDGreekPizza();
		}
		return pizza;
	}

}
