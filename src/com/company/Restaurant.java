package com.company;

import java.util.Scanner;

public class Restaurant {
    private final Scanner scanner;

    public Restaurant() {
        System.out.println("Welcome to BurgerFactory!");
        scanner = new Scanner(System.in);
    }

    private void showMenu() {
        System.out.println("Here is our menu: " +
                "\nHamburger - basic hamburger with bread and meat " +
                "\nPremium Hamburger - basic hamburger + two ingredients of your choice" +
                "\nWhat would you like to order? ");
    }

    private void validateInput(String burgerType) {
        while (!burgerType.equals("hamburger") && !burgerType.equals("premium hamburger")) {
            System.out.println("Please enter an item from the menu.");
            showMenu();
            burgerType = scanner.nextLine().toLowerCase();
        }
    }

    private void showItemDetails(String burgerType) {
        if (burgerType.equals("hamburger")) {
            Hamburger hamburger = new Hamburger();
            System.out.println(hamburger);
        } else {
            PremiumHamburger premiumHamburger = new PremiumHamburger();
            System.out.println(premiumHamburger);
        }
    }

    public void startOrder() {
        showMenu();
        String burgerType = scanner.nextLine().toLowerCase();
        validateInput(burgerType);
        showItemDetails(burgerType);
    }

}
