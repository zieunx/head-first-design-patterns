package com.book.headfirst.chapter6.impl;

import com.book.headfirst.chapter6.Command;
import com.book.headfirst.chapter6.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
