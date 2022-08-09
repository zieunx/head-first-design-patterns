package com.book.headfirst.chapter6.impl;

import com.book.headfirst.chapter6.Command;
import com.book.headfirst.chapter6.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
