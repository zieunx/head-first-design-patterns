package com.book.headfirst.chapter1.quack;

public class Squeak implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("삑!");
	}
}
