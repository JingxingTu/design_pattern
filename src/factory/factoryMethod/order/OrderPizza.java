package factory.factoryMethod.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factory.factoryMethod.pizza.Pizza;

public abstract class OrderPizza {

	abstract Pizza createPizza( String orderType);
	

	public OrderPizza() {
		Pizza pizza = null;
		String orderType = "";
		String orderLoc = "";
		
		do {

			orderType = getType();
			
			pizza = this.createPizza(orderType);
			
			if(pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else {
				System.out.println("We don't have this pizza!");
				break;
			}
		}while(true);
		
		
	}
	

	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please input pizza:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
	
	
}
