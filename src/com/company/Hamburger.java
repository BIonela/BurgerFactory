package com.company;

import java.util.Scanner;

public class Hamburger {

    private final String name;
    private final String breadType;
    private final String meatType;
    private final double price = 10.00;
    private Scanner scanner = new Scanner(System.in);

    public Hamburger() {
        System.out.println("Would you like it to be CLASSIC or DOUBLE? ");
        String name = scanner.nextLine();
        System.out.println("Do you want a WHITE or a BROWN bun? ");
        String breadType = scanner.nextLine();
        System.out.println("Do you want a BEEF or a PORK burger? ");
        String meatType = scanner.nextLine();
        this.name = name;
        this.breadType = breadType;
        this.meatType = meatType;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() +
                "\nname = " + name +
                ", breadType = " + breadType+
                ", meatType = " + meatType +
                ", price = " + price;

    }

    public double totalCost() {
        return this.price;
    }
}
