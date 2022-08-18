package com.book.headfirst.chapter7.adapter;

import com.book.headfirst.chapter7.Duck;
import com.book.headfirst.chapter7.Turkey;

/* 쓰면서 제대로 공부하기 p278 */
public class DuckAdapter implements Turkey {
    private final Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
