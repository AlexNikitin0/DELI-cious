package com.pluralsight;
import java.util.ArrayList;

// D - Take order - Adds stuff to receipt

public class Order {
    double total;
    ArrayList<Sandwich> sandwiches;
    ArrayList<String> drinks;
    ArrayList<String> chips;

    ArrayList<SignatureSandwich> signatureSandwiches;
    public Order() {
        this.total = 0;
        this.sandwiches = new ArrayList<Sandwich>();
        this.drinks = new ArrayList<String>();
        this.chips = new ArrayList<String>();
        this.signatureSandwiches = new ArrayList<SignatureSandwich>();

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
}