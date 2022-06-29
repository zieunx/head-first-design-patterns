package com.book.headfirst.chapter1.fly;

public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("날수 없는 오리..오리는 원래 못날아");
	}
}
