package com.book.headfirst.chapter7.adapter;

import com.book.headfirst.chapter7.Duck;
import com.book.headfirst.chapter7.Turkey;

public class TurkeyAdapter implements Duck {
    private final Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 1; i <= 5; i++) {
            turkey.fly();
        }
    }
}
