package com.book.headfirst.chapter6;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        System.out.println(location + " 선풍기 속도가 HIGH 로 설정되었습니다.");
        speed = HIGH;
    }

    public void medium() {
        System.out.println(location + " 선풍기 속도가 MEDIUM 로 설정되었습니다.");
        speed = MEDIUM;
    }

    public void low() {
        System.out.println(location + " 선풍기 속도가 LOW 로 설정되었습니다.");
        speed = LOW;
    }

    public void off() {
        System.out.println(location + " 선풍기가 꺼졌습니다.");
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
