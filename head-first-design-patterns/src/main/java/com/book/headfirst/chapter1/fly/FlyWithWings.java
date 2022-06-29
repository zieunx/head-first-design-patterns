package com.book.headfirst.chapter1.fly;

public class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("나는 오리..파닥파닥");
	}
}
