package com.book.headfirst.chapter1.quack;

public class MuteQuack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("(침묵)");
	}
}
