package com.book.headfirst.chapter6.impl;

import com.book.headfirst.chapter6.Command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("설정안함!");
    }

    @Override
    public void undo() {
        System.out.println("설정안함!");
    }
}
