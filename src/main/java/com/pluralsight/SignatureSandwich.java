package com.pluralsight;
import java.util.Arrays;
import java.util.List;
public class SignatureSandwich extends Sandwich {
    public SignatureSandwich(int size, String bread, boolean toasted, List<String> toppings) {
        super(size, bread, toasted);
        addToppings(toppings);
    }
    private void addToppings(List<String> toppings) {
    }
}
class BLTSandwich extends SignatureSandwich {
    public BLTSandwich() {
        super(8, "White", true, Arrays.asList("Bacon", "Cheddar", "Lettuce", "Tomato", "Ranch"));
    }
}
class PhillyCheeseSteak extends SignatureSandwich {
    public PhillyCheeseSteak() {
        super(8, "White", true, Arrays.asList("Steak", "American", "Peppers", "Mayo", "Toasted"));
    }
}
