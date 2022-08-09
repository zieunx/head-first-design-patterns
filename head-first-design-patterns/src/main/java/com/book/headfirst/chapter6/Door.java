package com.book.headfirst.chapter6;

public class Door {
    String location;

    public Door() {
    }

    public Door(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " 문이 열렸습니다.");
    }

    public void down() {
        System.out.println(location + " 문이 닫혔습니다.");
    }
}
