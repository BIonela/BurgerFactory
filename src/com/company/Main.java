package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
        String burgerType = scanner.nextLine().toLowerCase();

        //TODO: Check input choice
        if(burgerType.equals("hamburger")) {
            Hamburger hamburger = new Hamburger();
            System.out.println(hamburger.toString());
        }else if(burgerType.equals("premium hamburger")) {
            PremiumHamburger premiumHamburger = new PremiumHamburger();
            System.out.println(premiumHamburger.toString());
        }
    }

    public static void showMenu() {
        System.out.println("Welcome to BurgerFactory! Here is our menu: " +
                "\nHamburger - basic hamburger with bread and meat " +
                "\nPremium Hamburger - basic hamburger + two ingredients of your choice" +
                "\nWhat would you like to order? ");
    }

}
