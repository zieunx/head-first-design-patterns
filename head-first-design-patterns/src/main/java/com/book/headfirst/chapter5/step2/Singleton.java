package com.book.headfirst.chapter5.step2;

public class Singleton {
    private static final Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
