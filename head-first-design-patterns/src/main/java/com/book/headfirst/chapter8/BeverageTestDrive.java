package com.book.headfirst.chapter8;

import com.book.headfirst.chapter8.beverage.impl.CoffeeWithHook;
import com.book.headfirst.chapter8.beverage.impl.TeaWithHook;

public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\n<홍차 준비>");
        teaWithHook.prepareRecipe();

        System.out.println("\n<커피 준비 시작>");
        coffeeWithHook.prepareRecipe();
    }
}
