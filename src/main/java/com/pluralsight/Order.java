package com.pluralsight;

import java.util.ArrayList;

public class Order {
    double total;

    ArrayList<Sandwich> sandwiches;
    ArrayList<String> drinks;
    ArrayList<String> chips;
    public Order() {
        this.total = 0;
        this.sandwiches = new ArrayList<Sandwich>();
        this.drinks = new ArrayList<String>();
        this.chips = new ArrayList<String>();

        //  getTotal();
    }


    public void addSandwich(Sandwich sandwich){

        sandwiches.add(sandwich);

    }
    public void setDrinkorChipTotal(double amount){

        this.total += amount;
    }

    public void setSandwichPrices(){
        for(Sandwich sandwich: sandwiches){
            this.total += sandwich.getTotalPrice();
        }
    }



//    public void addDrink(String size){
//        if (size.equalsIgnoreCase("small")){
//            this.total += 2;
//        } else if (size.equalsIgnoreCase("medium")) {
//            this.total += 2.50;
//        } else {
//            this.total += 3.00;
//        }
//
//
//    }


}