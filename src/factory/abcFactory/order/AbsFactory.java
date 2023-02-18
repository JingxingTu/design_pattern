package factory.abcFactory.order;

import factory.abcFactory.pizza.Pizza;

// 一个抽象工厂模式的抽象层
public interface AbsFactory {
	public Pizza createPizza(String orderType);
}
