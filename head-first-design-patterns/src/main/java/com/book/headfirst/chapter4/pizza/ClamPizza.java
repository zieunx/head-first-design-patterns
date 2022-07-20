package com.book.headfirst.chapter4.pizza;

import com.book.headfirst.chapter4.pizza.ingredient.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	private final PizzaIngredientFactory pizzaIngredientFactory;

	public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("준비중: " + name);
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
		clams = pizzaIngredientFactory.createClam();
	}
}
