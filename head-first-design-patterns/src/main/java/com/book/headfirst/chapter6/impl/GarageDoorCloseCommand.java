package com.book.headfirst.chapter6.impl;

import com.book.headfirst.chapter6.Command;
import com.book.headfirst.chapter6.Door;

public class GarageDoorCloseCommand implements Command {
    Door door;

    public GarageDoorCloseCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.down();
    }

    @Override
    public void undo() {
        door.up();
    }
}
