package com.book.headfirst.chapter5.step1;

public class Singleton {
    private static Singleton uniqueSingleton;

    private Singleton() {}

    public Singleton getInstance() {
        if (uniqueSingleton == null) {
            uniqueSingleton = new Singleton();
        }
        return uniqueSingleton;
    }
}
