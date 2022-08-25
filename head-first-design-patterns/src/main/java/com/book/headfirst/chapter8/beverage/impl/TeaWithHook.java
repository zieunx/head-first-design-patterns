package com.book.headfirst.chapter8.beverage.impl;

import com.book.headfirst.chapter8.beverage.CaffeineBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("찻잎을 우려내는 중...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("레몬을 추가하는 중...");
    }

    @Override
    protected boolean customerWantsCondiments() {
        String answer = getUserInput();

        return answer != null && answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        System.out.print("차에 레몬을 넣을까요? (y/n)");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            return bufferedReader.readLine();
        } catch (IOException ioe) {
            System.out.println("IO 오류");
        }
        return "no";
    }
}
