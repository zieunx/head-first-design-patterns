package com.book.headfirst.chapter4.pizza;

import java.util.ArrayList;
import java.util.List;

import com.book.headfirst.chapter4.pizza.ingredient.Cheese;
import com.book.headfirst.chapter4.pizza.ingredient.Clams;
import com.book.headfirst.chapter4.pizza.ingredient.Dough;
import com.book.headfirst.chapter4.pizza.ingredient.Pepperoni;
import com.book.headfirst.chapter4.pizza.ingredient.Sauce;
import com.book.headfirst.chapter4.pizza.ingredient.Veggies;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clams;

	abstract void prepare();

	void bake() {
		System.out.println("175도에서 25분 간 굽기");
	}

	void cut() {
		System.out.println("피자를 사선으로 자르기");
	}

	void box() {
		System.out.println("상자에 피자 담기");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Pizza{" +
			"name='" + name + '\'' +
			'}';
	}
}
