package com.company;

public class Iphone implements Gadget {
    @Override
    public void description(String model) {
        System.out.println("Newest Iphone "  + model + " , better than previous");
    }
}
