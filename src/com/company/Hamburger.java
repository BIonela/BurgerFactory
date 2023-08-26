package com.company;

import java.util.Scanner;

public class Hamburger {

    private final String name;
    private final String breadType;
    private final String meatType;
    private final double price = 10.00;

    public Hamburger() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like it to be CLASSIC or DOUBLE? ");
        String name = scanner.nextLine().toLowerCase();
        this.name = validate(name, "classic", "double", scanner);

        System.out.println("Do you want a WHITE or a BROWN bun? ");
        String breadType = scanner.nextLine();
        this.breadType = validate(breadType, "white", "brown", scanner);

        System.out.println("Do you want a BEEF or a PORK burger? ");
        String meatType = scanner.nextLine();
        this.meatType = validate(meatType, "beef", "pork", scanner);
    }

    private static String validate(String ingredient, String firstOption, String secondOption, Scanner scanner) {
        while (!ingredient.equalsIgnoreCase(firstOption) && !ingredient.equalsIgnoreCase(secondOption)) {
            System.out.println("Please enter an option from the menu. ");
            ingredient = scanner.nextLine().toLowerCase();
        }
        return ingredient;
    }

    @Override
    public String toString() {
        return "You ordered: " + getClass().getSimpleName() +
                "\nname = " + name +
                ", breadType = " + breadType +
                ", meatType = " + meatType +
                ", price = " + price;

    }

    public double totalCost() {
        return this.price;
    }
}
