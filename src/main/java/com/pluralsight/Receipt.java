package com.pluralsight;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;
import java.time.*;

public class Receipt {
    public static void main(String[] args) {
        String filePath = "Receipt.csv";

        try{
            LocalDateTime now = LocalDateTime.now();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
            String formattedDateTime = now.format(formatter);

            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));


            writer.write("This order was placed" + formattedDateTime);

            writer.newLine();

            writer.close();


            BufferedReader reader= new BufferedReader((new FileReader(filePath)));

            String line;
            while ((line = reader.readLine()) != null){

                System.out.println("Your receipt says: " + line);
            }

            reader.close();

                reader.close();
        }catch (IOException e){
            e.getStackTrace();



        }
    }

    }