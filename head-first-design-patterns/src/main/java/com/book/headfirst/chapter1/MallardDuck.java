package com.book.headfirst.chapter1;

import com.book.headfirst.chapter1.fly.FlyWithWings;
import com.book.headfirst.chapter1.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("물오리ㅎㅎ");
	}
}
