package com.book.headfirst.chapter4.pizza;

import com.book.headfirst.chapter4.pizza.ingredient.NYPizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		NYPizzaIngredientFactory nyPizzaIngredientFactory = new NYPizzaIngredientFactory();

		if (type.equals("cheese")) {
			pizza = new CheesePizza(nyPizzaIngredientFactory);
			pizza.setName("시카고 스타일 치즈 피자");
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza(nyPizzaIngredientFactory);
			pizza.setName("시카고 스타일 야채 피자");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(nyPizzaIngredientFactory);
			pizza.setName("시카고 스타일 조개 피자");
		} else if (type.equals("pepperoni")) {
			pizza = new CheesePizza(nyPizzaIngredientFactory);
			pizza.setName("시카고 스타일 페퍼로니 피자");
		}
		return pizza;
	}
}
