package com.book.headfirst.chapter6;

import com.book.headfirst.chapter6.impl.NoCommand;

import java.util.Arrays;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n--------리모컨--------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append(String.format("[slot %d] %s %s \n",
                    i,
                    onCommands[i].getClass().getName(),
                    offCommands[i].getClass().getName()
            ));
        }
        return stringBuilder.toString();
    }
}
