package com.company;

import java.util.Map;
import java.util.Scanner;

public class PremiumHamburger extends Hamburger{

    private static final Map<String, Double> ingredients = Map.of("bacon", 2.00,"cheese", 1.50,"onion", 1.20,"tomato", 1.20,"salad", 1.20,"egg", 1.20);
    private final String addition1;
    private final String addition2;
    private Scanner scanner = new Scanner(System.in);

    public PremiumHamburger() {
        super();
        System.out.println("Enter first extra ingredient from the list below: ");
        showIngredients(ingredients);
        String addition1 = scanner.nextLine();
        System.out.println(addition1 + " added, price: " + ingredients.get(addition1));

        System.out.println("Enter second extra ingredient from the list below: ");
        showIngredients(ingredients);
        String addition2 = scanner.nextLine();
        System.out.println(addition2 + " added, price: " + ingredients.get(addition2));

        this.addition1 = addition1;
        this.addition2 = addition2;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "addition 1 = " + addition1 + ", " +
                "addition 2 =  " + addition2 + ", " +
                "total cost = " + totalCost();
    }

    @Override
    public double totalCost() {
        double totalCost = super.totalCost() + ingredients.get(addition1) + ingredients.get(addition2);
        return totalCost;
    }

    public static void showIngredients(Map<String, Double> ingredients) {
        for(String key : ingredients.keySet()) {
            System.out.println(key);
        }
    }
}
