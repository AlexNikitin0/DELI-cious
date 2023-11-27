package com.pluralsight;

public class Sandwich {
    //properties
    private int size; // size of sandwich in inches. Options: 4,8,12
    private String bread; // options: white,wheat,rye, or wrap
    boolean isToasted;
    //constructor
    private double breadPrice;
    private double meatPrice;
    private double totalPrice;
    private double cheesePrice;


    public Sandwich(int size, String bread, boolean isToasted) {
        this.size = size;
        this.bread = bread;
        this.isToasted = isToasted;
        setBreadPrice();
        setCheesePrice();
    }

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
       if(this.size == 4){
            this.breadPrice = 5.50;
       }
       else if(this.size == 8){
           this.breadPrice = 7;
       }
       else {
           this.breadPrice = 8.50;
        }


    }

    public void setMeatPrice(){
        if(this.size == 4){
            this.meatPrice = 1;
        }
        else if(this.size == 8){
            this.meatPrice = 2;
        }
        else{
            meatPrice = 3;
        }
    }

    public void addMeatPrice(){
        totalPrice += meatPrice;
    }

    public void setCheesePrice(){
        if(this.size == 4){
            this.cheesePrice = .75;
        }
        else if(this.size == 8){
            this.cheesePrice = 1.5;
        }
        else{
            cheesePrice = 2.25;
        }
    }
    public void addCheesePrice(){
        totalPrice += cheesePrice;
    }

    

}
