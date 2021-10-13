package com.company;

public class Ipad implements Gadget {
    @Override
    public void description(String model) {
        System.out.println("Newest Ipad " + model);
    }
}
