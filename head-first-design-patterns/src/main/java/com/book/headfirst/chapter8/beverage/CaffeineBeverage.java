package com.book.headfirst.chapter8.beverage;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void brew();
    protected  abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중 ...");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중...");
    }

    protected boolean customerWantsCondiments() {
        return true;
    }
}
