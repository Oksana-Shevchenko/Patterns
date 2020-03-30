package com.example1.pizza;

import com.example1.pizza.model.NYStyleCheesePizza;
import com.example1.pizza.model.NYStyleClamPizza;
import com.example1.pizza.model.NYStylePepperoniPizza;
import com.example1.pizza.model.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore  {
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza();
		}
		else if (type.equals("calm")) {
			pizza = new NYStyleClamPizza();
		}
		else if (type.equals("veggie")) {
			pizza = new NYStyleVeggiePizza();
		}
		return pizza;
	}
}
