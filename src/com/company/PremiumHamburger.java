package com.company;

import java.util.Map;
import java.util.Scanner;

public class PremiumHamburger extends Hamburger {

    private static final Map<String, Double> ingredients = Map.of("bacon", 2.00, "cheese", 1.50, "onion", 1.20, "tomato", 1.20, "salad", 1.20, "egg", 1.20);
    private final String addition1;
    private final String addition2;
    private final Scanner scanner = new Scanner(System.in);

    public PremiumHamburger() {
        super();
        System.out.println("Enter first extra ingredient from the list below: ");
        showIngredients();
        String addition1 = scanner.nextLine();
        this.addition1 = validate(addition1);

        System.out.println("Enter second extra ingredient from the list below: ");
        showIngredients();
        String addition2 = scanner.nextLine();
        this.addition2 = validate(addition2);
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "addition 1 = " + addition1 + ", " + "addition 2 =  " +
                addition2 + ", " + "total cost = " + String.format("%.2f", totalCost());
    }

    @Override
    public double totalCost() {
        double totalCost = super.totalCost() + ingredients.get(addition1) + ingredients.get(addition2);
        return totalCost;
    }

    private static void showIngredients() {
        for (String key : PremiumHamburger.ingredients.keySet()) {
            System.out.println(key);
        }
    }

    private String validate(String addition) {
        while (!ingredients.containsKey(addition)) {
            System.out.println("Please enter an ingredient from the list.");
            addition = scanner.nextLine();
        }
        System.out.println(addition + " added, price: " + ingredients.get(addition));
        return addition;
    }
}
