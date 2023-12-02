package com.pluralsight;
import java.io.IOException;
import java.util.*;

//Import necessary functions - Only up to 179 is actual HomeScreen.
public class HomeScreen {
    private static final Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the best possible iteration of Deli-Cious!");
        //Project strong confidence in the business.
        while (true) {
            System.out.println("1. New Order");
            System.out.println("2. Quit");
            System.out.println("What'll it be, hotshot?");
            String choice = keyboard.nextLine();
            //Switches get stitches, am I right??????
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
            }
        }
    }
}

//Since you got to the bottom of the code, here's some fun facts!
//There's more stars in the observable universe than grains of sand on every beach on Earth.
// The seeds of apples have natural cyanide in them.