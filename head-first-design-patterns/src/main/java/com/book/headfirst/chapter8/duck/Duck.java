package com.book.headfirst.chapter8.duck;

public class Duck implements Comparable<Duck> {

    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " 체중: " + weight;
    }

    @Override
    public int compareTo(Duck target) {
        if (this.weight < target.weight) {
            return -1;
        } else if (this.weight == target.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}
