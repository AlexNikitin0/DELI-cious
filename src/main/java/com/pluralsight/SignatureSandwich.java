package com.pluralsight;
import java.util.ArrayList;
public class SignatureSandwich {


    ArrayList<Sandwich> signatureSandwiches;



    public SignatureSandwich() {

        this.signatureSandwiches = new ArrayList<Sandwich>();
        makeBLT();
        makePhilly();
        makeWaterGun();
        makeCalebsBane();
        makeLongJohn();
        makeDesi();

    }
// A - This is the signature sandwiches class with our own custom creations it stores price and ingredients!
    public void makeBLT(){
        Sandwich blt = new Sandwich(8,"White",true);
        blt.meatToppings.add("Bacon");
        blt.cheeseToppings.add("Cheddar");
        blt.vegetableToppings.add("Lettuce");
        blt.vegetableToppings.add("Tomato");
        blt.sauceToppings.add("Ranch");
        blt.setSandwichPrice(10.5);
        blt.setDescription("BLT- This is an 8 inch Bacon Cheddar on White with Lettuce Tomato and Ranch.($10.50)");
        signatureSandwiches.add(blt);

    }

    public void makePhilly(){
        Sandwich philly = new Sandwich(8,"White",true);
        philly.meatToppings.add("Steak");
        philly.cheeseToppings.add("American");
        philly.vegetableToppings.add("Peppers");
        philly.sauceToppings.add("Mayo");
        philly.setSandwichPrice(10.5);
        philly.setDescription("Philly- This is an 8 inch Steak n American Cheese on White with Peppers and Mayo ($10.50)");
        signatureSandwiches.add(philly);
    }

    public void makeWaterGun(){
        Sandwich waterGun = new Sandwich(12,"Wrap",true);
        waterGun.meatToppings.add("Steak");
        waterGun.cheeseToppings.add("PepperJack");
        waterGun.vegetableToppings.add("Lettuce");
        waterGun.vegetableToppings.add("Jalapenos");
        waterGun.vegetableToppings.add("Pickles");
        waterGun.sideToppings.add("A1");
        waterGun.setSandwichPrice(13.75);
        waterGun.setDescription("Wendigo WaterGun- This is a 12 inch Wrap with steak, pepperJack,lettuce,Jalapenos,and Pickles. Comes with side of A1 ($13.75)");
        signatureSandwiches.add(waterGun);
    }

    public void makeCalebsBane(){
        Sandwich calebsBane = new Sandwich(8,"Rye",false);
        calebsBane.meatToppings.add("Roast Beef");
        calebsBane.cheeseToppings.add("PepperJack");
        calebsBane.vegetableToppings.add("Pickles");
        calebsBane.cheeseToppings.add("Provolone");
        calebsBane.vegetableToppings.add("Tomatoes");
        calebsBane.vegetableToppings.add("Lettuce");
        calebsBane.sideToppings.add("Mustard");
        calebsBane.sideToppings.add("Thousand Island");
        calebsBane.setSandwichPrice(11.1);
        calebsBane.setDescription("Caleb's Bane- This is an 8 inch Roast beef on Rye with pepperJack and Provolone cheese with pickles, lettuce, tomato, mustard and thousand island ($11.11)");
        signatureSandwiches.add(calebsBane);
    }
    public void makeLongJohn(){
        Sandwich longJohn = new Sandwich(12,"Rye",false);
        longJohn.meatToppings.add("Herring");
        longJohn.setSandwichPrice(13.75);
        longJohn.setDescription("LongJohnSilver Special- This is a 12 inch Herring on Rye. Its delicious I SWEAR! ($13.75)");
        signatureSandwiches.add(longJohn);
    }
    public void makeDesi(){
        Sandwich desi = new Sandwich(4,"White",true);
        desi.meatToppings.add("Steak");
        desi.cheeseToppings.add("PepperJack");
        desi.vegetableToppings.add("Onions");
        desi.sauceToppings.add("Ketchup");
        desi.sauceToppings.add("Mayo");
        desi.setSandwichPrice(7.25);
        desi.setDescription("The Disappointed Desi- This is a 4 inch Steak n cheese on white with pepperJack, onions, Ketchup and Mayo.($7.25)");
        signatureSandwiches.add(desi);
    }
}