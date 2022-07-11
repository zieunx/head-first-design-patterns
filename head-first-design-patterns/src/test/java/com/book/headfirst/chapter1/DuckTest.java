package com.book.headfirst.chapter1;

import org.junit.jupiter.api.Test;

import com.book.headfirst.chapter1.fly.FlyRocketPowered;

class DuckTest {

	@Test
	public void 오리_인터페이스와_분리된_행동_인터페이스() {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performQuack();
		mallardDuck.performFly();
	}

	@Test
	public void 오리_행동_동적변경_setter이용() {
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
	}
}