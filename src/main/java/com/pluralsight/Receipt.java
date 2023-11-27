package com.pluralsight;
import java.util.*;
import java.io.*;
import java.time.*;

public class Receipt {
    public static void main(String[] args) {
        String filePath = "Receipt.csv";

        try{
            BufferedReader reader= new BufferedReader((new FileReader(filePath)));

            String line;
            while ((line = reader.readLine()) != null){

                System.out.println(line);
            }
                reader.close();
        }catch (IOException e){
            e.getStackTrace();


    }
}
}