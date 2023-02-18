package factory.abcFactory.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factory.abcFactory.pizza.Pizza;

public class OrderPizza {
	
	AbsFactory abcFactory;
	
	public OrderPizza(AbsFactory factory) {
		setFactory(factory);
	}
	
	private void setFactory(AbsFactory factory) {
		
		Pizza pizza = null;
		String orderType = "";
		this.abcFactory = factory;
		
		do {
			
			orderType = getType();
			pizza = factory.createPizza(orderType);

			if(pizza != null) {
				pizza.setName("BJ pizza");
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
