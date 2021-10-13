package com.company;

public class Mac implements Gadget {
    @Override
    public void description(String model) {
        System.out.println("Newest " + model + " Mac u ever seen");
    }
}
