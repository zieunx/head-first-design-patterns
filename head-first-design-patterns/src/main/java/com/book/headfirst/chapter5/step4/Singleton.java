package com.book.headfirst.chapter5.step4;

import java.io.Serializable;

public class Singleton implements Serializable {
    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    protected Singleton readResolve() {
        return uniqueInstance;
    }
}
