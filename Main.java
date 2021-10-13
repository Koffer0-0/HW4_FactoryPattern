package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Tim Cock, let's go produce new Apple gadget");
        System.out.println("1. Mac");
        System.out.println("2. Iphone");
        System.out.println("3. Ipad");

        Scanner input = new Scanner(System.in);
        short select = input.nextShort();
        if (select == 1) {
            Factory factory = new MacFactory();
            Gadget gadget = factory.produceGadget();
            System.out.println("Choose model of new Mac");
            String model = input.next();
            gadget.description(model);
        }
        if (select == 2) {
            Factory factory = new IphoneFactory();
            Gadget gadget = factory.produceGadget();
            System.out.println("Choose model of new Iphone");
            String model = input.next();
            gadget.description(model);
        }
        if (select == 3) {
            Factory factory = new IpadFactory();
            Gadget gadget = factory.produceGadget();
            System.out.println("Choose model of new Ipad");
            String model = input.next();
            gadget.description(model);
        }
    }
}
