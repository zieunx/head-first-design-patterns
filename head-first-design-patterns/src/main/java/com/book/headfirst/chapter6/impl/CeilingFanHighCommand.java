package com.book.headfirst.chapter6.impl;

import com.book.headfirst.chapter6.CeilingFan;
import com.book.headfirst.chapter6.Command;

public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    int preSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }


    @Override
    public void execute() {
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    public void undo() {
        if (preSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (preSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (preSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else {
            ceilingFan.off();
        }
    }
}
