package com.book.headfirst.chapter6.impl;

import com.book.headfirst.chapter6.Command;
import com.book.headfirst.chapter6.Stereo;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
     stereo.on();
    }
}
