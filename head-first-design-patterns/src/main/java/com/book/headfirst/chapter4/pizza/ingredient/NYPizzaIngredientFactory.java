package com.book.headfirst.chapter4.pizza.ingredient;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		return new Veggies[] {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicePepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}
}
