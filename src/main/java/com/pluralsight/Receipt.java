package com.pluralsight;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;
import java.time.*;
public class Receipt {

  //C - Underscore Hack
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM_dd_yyyy_HH_mm_ss");
    String formattedDateTime = now.format(formatter);
    String filePath = "src/main/resources/"+formattedDateTime;
    //writer

   //Writer for the receipt

    public void write (Order order)throws IOException{
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true));
            writer.write("This order was placed " + formattedDateTime);
            writer.newLine();
            int counter = 1;
            for(Sandwich sandwich: order.sandwiches){
                writer.newLine();
                writer.write("Sandwich " + String.valueOf(counter) +"\n" + " Size: " +
                        String.valueOf(sandwich.getSize()) + " inches " + "\n" + "Bread: " +
                        sandwich.getBread() + "\n" + " Meat(s): " + sandwich.displayMeat() +"\n" + " Cheese(s): "
                        + sandwich.displayCheese() + "\n" + " Vegetable(s): " + sandwich.displayVeg() + "\n" + " Sauce(s): "
                        + sandwich.displaySauce() + "\n" + " Side(s): " + sandwich.displaySides()+ "\n"  + "\n" );
                counter++;
                writer.newLine();
            }
            for(String drinks :order.drinks){
                writer.write("Drink: " + drinks + "\n");

            }
            for(String chips : order.chips){
                writer.write("Chips: " + chips + "\n");
            }
            writer.write("Order Total: $" + String.format("%.2f",order.total));
            writer.close();
        }

        }