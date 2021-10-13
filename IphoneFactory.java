package com.company;

public class IphoneFactory implements Factory {
    @Override
    public Gadget produceGadget() {
        return new Iphone();
    }
}
