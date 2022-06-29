package com.book.headfirst.chapter1;

import com.book.headfirst.chapter1.fly.FlyNoWay;
import com.book.headfirst.chapter1.quack.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("모형 오리");
	}
}
