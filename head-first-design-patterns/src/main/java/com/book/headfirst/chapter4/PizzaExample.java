package com.book.headfirst.chapter4;

import com.book.headfirst.chapter4.pizza.ChicagoPizzaStore;
import com.book.headfirst.chapter4.pizza.Pizza;
import com.book.headfirst.chapter4.pizza.PizzaStore;
import com.book.headfirst.chapter4.pizza.NYPizzaStore;

public class PizzaExample {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("에단이 주문한 피자는 " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("조엘이 주문한 피자는 " + pizza.getName());
	}
}
