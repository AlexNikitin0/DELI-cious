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
class TheWendigosWatergun extends SignatureSandwich {
    public TheWendigosWatergun() {
        super(12, "Wrap", true, Arrays.asList("Steak", "PepperJack", "Lettuce", "Jalapenos", "Pickles", "A1"));
    }
}
class CalebsBane extends SignatureSandwich {
    public CalebsBane() {
        super(8, "Rye", false, Arrays.asList("Roast beef", "PepperJack", "Provolone", "Pickles",
                "Tomatoes", "Lettuce", "Mustard", "Thousand Island"));
    }
}
class LongJohnsSilverSpecial extends SignatureSandwich{
    public LongJohnsSilverSpecial() {
        super(12, "Rye", false, Arrays.asList("Herring"));
    }
}
class TheDissapointedDesi extends SignatureSandwich{
    public TheDissapointedDesi() {
        super(4, "White", true, Arrays.asList("Steak", "PepperJack", "Onions", "Ketchup", "Mayo"));
    }
}