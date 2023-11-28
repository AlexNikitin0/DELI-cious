package com.pluralsight;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;
import java.time.*;
public class Receipt {
    String filePath = "src/main/resources/Receipt.txt";
    LocalDateTime now = LocalDateTime.now();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
    String formattedDateTime = now.format(formatter);

    //writer

    public void write (Order order)throws IOException{
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true));
            writer.write("This order was placed" + formattedDateTime);
            int counter = 1;
            for(Sandwich sandwich: order.sandwiches){
                writer.write("Sandwich " + String.valueOf(counter)  + " Size: " + String.valueOf(sandwich.getSize()) + " inches " + "Bread: " + sandwich.getBread() + " Meat(s): " + sandwich.displayMeat() + " Cheese(s): " + sandwich.displayCheese() + " Vegetable(s): " + sandwich.displayVeg() + " Sauce(s): " + sandwich.displaySauce() + " Side(s): " + sandwich.displaySides());
                counter++;
            }

            writer.newLine();
            writer.close();
        }

//    public void saveDealership(int vin,int year,String make,String model,String type, String color, int milage, double price)throws IOException{
//        FileWriter fileWriter = new FileWriter("src/main/resources/inventory.csv", true);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write("\n"+vin + "|"+ year + "|"+ make + "|"+ model + "|"+ type + "|" + color + "|" + milage + "|" + price);
//        bufferedWriter.close();
//    }
//






        public void read()throws IOException{

            BufferedReader reader = new BufferedReader((new FileReader(filePath)));

            String line;
            while ((line = reader.readLine()) != null) {

                System.out.println("Your receipt says: " + line);
            }
            reader.close();

        }



        }//end class

