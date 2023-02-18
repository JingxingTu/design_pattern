package factory.abcFactory.order;

import factory.abcFactory.pizza.BJCheesePizza;
import factory.abcFactory.pizza.BJGreekPizza;
import factory.abcFactory.pizza.Pizza;

public class BJFactory implements AbsFactory{

	public Pizza createPizza(String orderType) {
		System.out.println("create BJ pizza");
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		}else if(orderType.equals("greek")){
			pizza = new BJGreekPizza();
		}
		return pizza;
	}

}
