package com.book.headfirst.chapter6.impl;

import com.book.headfirst.chapter6.Command;
import com.book.headfirst.chapter6.Door;

public class GarageDoorOpenCommand implements Command {
    Door door;

    public GarageDoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }

    @Override
    public void undo() {
        door.down();
    }
}
