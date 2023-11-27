package com.pluralsight;
import java.util.*;

//Import necessary functions.
public class HomeScreen {
    private static final Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the best possible iteration of Deli-Cious!");
        //Project strong confidence in the business.
        while (true) {
            System.out.println("1. New Order");
            System.out.println("2. Quit");
            System.out.println("What'll it be, hotshot?");
            String choice = keyboard.nextLine();
            //Switches get stitches, am i right??????
            switch (choice) {
                case "1":
                    OrderMenu orderMenu = new OrderMenu();
                    orderMenu.run();
                    break;
                //This will lead to the order menu, obviously.
                case "2":
                    System.out.println("Okay, bye, get out now please.");
                    System.exit(0);
                default:
                    System.out.println("WRONG!");
                    break;
                //Just in case someone gets reaaaaaal funny and puts the wrong input
            }}}}
class OrderMenu {
    private ArrayList<String> customSandwich;
    private ArrayList<String> drinks;
    private ArrayList<String> chips;
    private double totalPrice;
    public OrderMenu() {
        this.customSandwich = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
        this.totalPrice = 0.00;
    }
    public void run() {
        while (true) {
            Scanner order = new Scanner(System.in);
           Order customerOrder = new Order();

            System.out.println("What'll be your order?:");
            System.out.println("1. Add sandwich.");
            System.out.println("2. Add drink.");
            System.out.println("3. Add chips.");
            System.out.println("4. Checkout.");
            System.out.println("0. Cancel order");
            String choice = order.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("What size sandwich would you like?");
                    System.out.println("We have a 4 inch, 8 Inch, and 12 Inch.");
                    int size = order.nextInt();
                    order.nextLine();
                    System.out.println("Which bread would you like?");
                    System.out.println("We have White, Wheat, Rye, and Wraps.");
                    String bread = order.nextLine().trim();
                    System.out.println("Would you like that toasted?");
                    String yn = order.nextLine().trim();
                    boolean bool;
                    if(yn.equalsIgnoreCase("Yes")){
                        bool = true;
                }else{
                        bool = false;
                    }
                    System.out.println("What toppings would you like?");

                    boolean extraMeat;
                    boolean extraCheese;

                    List<String> meatToppings = Arrays.asList("Steak","Ham", "Salami", "Roast Beef","Chicken","Bacon");
                    List<String> cheeseToppings = Arrays.asList("American","Provolone", "Cheddar", "Swiss","Pepperjack");
                    List<String> vegToppings = Arrays.asList("Lettuce","Peppers", "Onions", "Tomatoes","Jalapenos","Cucumbers","Pickles","Guacamole","Mushrooms");
                    List<String> sideToppings = Arrays.asList("Au Jus","Sauce");

                    Sandwich sandwich = new Sandwich(size,bread,bool);
                   customerOrder.sandwiches.add(sandwich);

                 //Meat Choice
                   System.out.println("These are our meat toppings");
                   for( int i = 1; i < meatToppings.size() + 1 ; i++){
                       System.out.println(i+ ":" + meatToppings.get(i - 1));
                   }
                    int meatChoice = order.nextInt();
                   order.nextLine();
                   sandwich.toppings.add(meatToppings.get(meatChoice - 1 ));

                 //Cheese Choice
                   System.out.println("These are our cheeses : " );
                    for( int i = 1; i < cheeseToppings.size() + 1 ; i++){
                        System.out.println(i+ ":" + cheeseToppings.get(i - 1));
                    }
                    int cheeseChoice = order.nextInt();
                   order.nextLine();
                    sandwich.toppings.add(cheeseToppings.get(cheeseChoice - 1 ));

                   //Vegetable Choice
                    System.out.println("These are our vegetable toppings : " );
                    for( int i = 1; i < vegToppings.size() + 1 ; i++){
                        System.out.println(i+ ":" + vegToppings.get(i - 1));
                    }
                   int vegChoice = order.nextInt();
                    order.nextLine();
                    sandwich.toppings.add(vegToppings.get(vegChoice - 1 ));
                    //Sauce choice

                    System.out.println("These are our sauces : ");
                    for( int i = 1; i < sideToppings.size() + 1 ; i++){
                        System.out.println(i+ ":" + sideToppings.get(i - 1));
                    }
                    int sauceChoice = order.nextInt();
                    order.nextLine();
                    sandwich.toppings.add(sideToppings.get(sauceChoice - 1 ));

                    break;
                case "2":
                    addDrink();
                    break;
                case "3":
                    addChips();
                    break;
                case "4":
                    checkout();
                    break;
                case "0":
                    System.out.println("Returning to main. You couldn't even handle our sandwiches anyways.");
                    return;
                default:
                    System.out.println("WRONG! STOP IT!");
                    break;
            }}}
    private void addDrink() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Select your size:");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");
        System.out.print("Enter your choice: ");
        //Drink options
        String sizeChoice = keyboard.nextLine();
        Map<String, Double> drinkPrices = new HashMap<>();
//Logic for prices.
        drinkPrices.put("1", 2.00);
        drinkPrices.put("2", 2.50);
        drinkPrices.put("3", 3.00);
//Your options, monsieur.
        if (drinkPrices.containsKey(sizeChoice)) {
            System.out.println("Select a drink:");
            System.out.println("1. Coke.");
            System.out.println("2. Pepsi.");
            System.out.println("3. Fanta.");
            System.out.println("4. CheerWine.");
            System.out.println("5. A&W.");
            System.out.println("6. Bleach.");
            System.out.print("What'll it be?: ");
            String drinkChoice = keyboard.nextLine();
            //Calculate the drank price.
            drinks.add(drinkChoice);
            double drinkPrice = drinkPrices.get(sizeChoice);
            totalPrice += drinkPrice;
            System.out.println("Added. Size: " + sizeChoice + ", Price: $" + drinkPrice);
        } else {
            System.out.println("You're embarrassing yourself, KNOCK IT OFF BOZO!");
        }}
    private void addChips() {
        Scanner keyboard = new Scanner(System.in);
        //Present the options
        System.out.println("Your chip selection:");
        System.out.println("1. Doritos.");
        System.out.println("2. Sun Chips.");
        System.out.println("3. Fun-Yuns.");
        System.out.println("4. Cheetos.");
        System.out.println("5. Lays.");
        System.out.println("6. Organic kind that nobody buys.");
        System.out.print("What'll it be?: ");
        //Logic below for adding chips
        String chipsChoice = keyboard.nextLine();
        chips.add(chipsChoice);
        totalPrice += 1.50;
        System.out.println("Chips added.");
    }
    private void checkout() {
        System.out.println("Order Details:");
        //This is where the details will go
        System.out.println("Drinks: " + drinks);
        System.out.println("Chips: " + chips);
        System.out.printf("Total Price: $ %.2f" , totalPrice);
        System.out.println();
        //Here's where the total price will be displayed
        System.out.println("Thank you for coming in! Now get out. There's a fee if you stand around.");
        System.exit(0);
    }
}

//Since you got to the bottom of the code, here's a fun fact
//There's more stars in the observable universe than grains of sand on every beach on Earth.



