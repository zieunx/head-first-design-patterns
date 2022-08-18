package com.book.headfirst.chapter7;

import com.book.headfirst.chapter7.adapter.TurkeyAdapter;
import com.book.headfirst.chapter7.impl.MallardDuck;
import com.book.headfirst.chapter7.impl.WildTurkey;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("칠면조가 말하길");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n오리가 말하길");
        duck.quack();
        duck.fly();

        System.out.println("\n칠면조 어댑터가 말하길");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
