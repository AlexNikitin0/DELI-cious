package com.pluralsight;
import java.util.ArrayList;
public class Sandwich {
    ArrayList<String> meatToppings;
    ArrayList<String> cheeseToppings;
    ArrayList<String> vegetableToppings;
    ArrayList<String> sideToppings;
    ArrayList<String> sauceToppings;

    private String description;

    //properties
    private int size; // size of sandwich in inches. Options: 4,8,12
    private String bread; // options: white,wheat,rye, or wrap
    boolean isToasted;
    //constructor
    private double breadPrice;
    private double meatPrice;
    private double totalPrice;
    private double cheesePrice;
    private boolean isExtraMeat, isExtraCheese;
    public boolean isExtraMeat() {
        return isExtraMeat;
    }
    public void setExtraMeat(boolean extraMeat) {
        isExtraMeat = extraMeat;
    }
    public boolean isExtraCheese() {
        return isExtraCheese;
    }
    public void setExtraCheese(boolean extraCheese) {
        isExtraCheese = extraCheese;
    }



    public Sandwich(int size, String bread, boolean isToasted) {
        this.size = size;
        this.bread = bread;
        this.isToasted = isToasted;
        this.isExtraMeat = false;
        this.isExtraCheese = false;
        this.meatToppings = new ArrayList<String>();
        this.cheeseToppings = new ArrayList<String>();
        this.vegetableToppings = new ArrayList<String>();
        this.sideToppings = new ArrayList<String>();
        this.sauceToppings = new ArrayList<String>();

        setBreadPrice();
        setCheesePrice();
        setMeatPrice();
    }

   //

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getBread() {
        return bread;
    }
    public void setBread(String bread) {
        this.bread = bread;
    }
    public boolean isToasted() {
        return isToasted;
    }
    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }
    public double getSandwichPrice() {
        return breadPrice;
    }
    public void setBreadPrice() {
        if (this.size == 4) {
            this.breadPrice = 5.50;
        } else if (this.size == 8) {
            this.breadPrice = 7;
        } else {
            this.breadPrice = 8.50;
        }
    }

   //

    public void setMeatPrice() {
        if (this.size == 4) {
            this.meatPrice = 1;
        } else if (this.size == 8) {
            this.meatPrice = 2;
        } else {
            meatPrice = 3;
        }
    }
    public void addMeatPrice() {
        totalPrice += meatPrice;
    }
    public void extraMeat() {
        this.isExtraMeat = true;
        if (this.size == 4 && isExtraMeat) {
            meatPrice += .50;
        } else if (this.size == 8 && isExtraMeat) {
            meatPrice += 1;

        } else if (this.size == 12 && isExtraMeat) {
            meatPrice += 1.50;
        }
    }

 //

    public void extraCheese() {
        this.isExtraCheese = true;
        if (this.size == 4 && isExtraCheese) {
            cheesePrice += .30;
        } else if (this.size == 8 && isExtraCheese) {
            cheesePrice += .6;
        } else if (this.size == 12 && isExtraCheese) {
            cheesePrice += .9;
        }
    }

   //

    public void setCheesePrice() {
        if (this.size == 4) {
            this.cheesePrice = .75;
        } else if (this.size == 8) {
            this.cheesePrice = 1.5;
        } else {
            cheesePrice = 2.25;
        }
    }

 //
    public void addCheesePrice() {
        totalPrice += cheesePrice;
    }
    public double getTotalPrice() {
        return this.breadPrice + this.meatPrice + this.cheesePrice;

    }

    //D - StringBuilder for the various toppings

    public String displayMeat(){
        StringBuilder builder = new StringBuilder();
        if(!meatToppings.isEmpty()) {
            for (String meat : meatToppings) {
                builder.append(meat + " ");

            }
        }
        else {
            builder.append("NO MEAT");
        }
        return builder.toString();
    }
    public String displayCheese(){
        StringBuilder builder = new StringBuilder();
        if(!cheeseToppings.isEmpty()) {
            for (String cheese : cheeseToppings) {
                builder.append(cheese + " ");

            }
        }
        else {
            builder.append("NO CHEESE");
        }
        return builder.toString();
    }
    public String displayVeg(){
        StringBuilder builder = new StringBuilder();
        if(!vegetableToppings.isEmpty()) {
            for (String veg : vegetableToppings) {
                builder.append(veg + " ");

            }
        }
        else {
            builder.append("NO VEGGIES");
        }
        return builder.toString();
    }

  //

    public String displaySauce(){
        StringBuilder builder = new StringBuilder();
        if(!sauceToppings.isEmpty()) {
            for (String sauce : sauceToppings) {
                builder.append(sauce + " ");

            }
        }
        else{
            builder.append("NO SAUCES");
        }
        return builder.toString();
    }
    public String displaySides(){
        StringBuilder builder = new StringBuilder();
        if(!sideToppings.isEmpty()) {
            for (String side : sideToppings) {
                builder.append(side + " ");

            }
        }
        else{
            builder.append("NO SIDES");
        }
        return builder.toString();
    }


 //

    public void setSandwichPrice(double price){
        this.totalPrice = price;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

}

