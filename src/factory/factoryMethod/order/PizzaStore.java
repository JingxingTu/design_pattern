package factory.factoryMethod.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaStore {

	public static void main(String[] args) {
		
		String orderLoc = getLoc();
		
		if(orderLoc.equals("bj")) {
			new BJOrderPizza();
		}else if(orderLoc.equals("ld")) {
			new LDOrderPizza();
		}else {
			System.out.println("We don't have this loc!");
		}
		
	}

	private static String getLoc() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please input location:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
