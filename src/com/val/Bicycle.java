package com.val;

public class Bicycle extends Cycle {

    public Bicycle() {

        MessageCentre.DebugMessage("Bicycle is created");
    }

    @Override
    public String toString() {
        return "I am a bike";
    }
}
