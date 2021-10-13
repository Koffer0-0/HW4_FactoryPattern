package com.company;

public class IpadFactory implements Factory {
    @Override
    public Gadget produceGadget() {
        return new Ipad();
    }
}
