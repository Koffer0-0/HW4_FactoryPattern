package com.company;

public class MacFactory implements Factory {
    @Override
    public Gadget produceGadget() {
        return new Mac();
    }
}
