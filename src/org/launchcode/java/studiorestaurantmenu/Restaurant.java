package org.launchcode.java.studiorestaurantmenu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args){
        MenuItems newItem1 = new MenuItems(5.55,  "Chilly Pasta",  "Dinner",  true);
        MenuItems newItem2 = new MenuItems( 8.99,  "T-bone Steak",  "Dinner",  false);
        MenuItems newItem3 = new MenuItems( 6.59,  "Ice cream pie",  "Dessert",  true);


        Date today = Calendar.getInstance().getTime();
        ArrayList<MenuItems> startingMenu = new ArrayList<>();

        Menu ourMenu = new Menu(today, startingMenu);

        ourMenu.addItem(newItem1);
        ourMenu.addItem(newItem2);
        ourMenu.addItem(newItem3);

        System.out.println("1. Print the entire menu to the screen.");
        System.out.println("Code: ourMenu.printMenu();\n");
        //ourMenu.printMenu();

        System.out.println("\n");
        System.out.println("2. Print individual menu item to screen.");
        System.out.println("Code: ourMenu.printItem(newItem2);\n");
        ourMenu.printMenu(newItem2);

        System.out.print("\n");
        System.out.println("3. Delete an item from a menu, then reprint the menu");
        System.out.println("ourMenu.removeItem(newItem2);");
        System.out.println("Code: ourMenu.printMenu();\n");
        ourMenu.printMenu(newItem2);
        //ourMenu.printMenu();

        System.out.print("\n");
        System.out.println("Printing price and category");
        System.out.println("System.out.printf(\"%s\", newItems2.category);");
        System.out.println("System.out.printf(\"%d\", newItem2.price);\n");
        System.out.printf("%s \n", newItem2.description);
        System.out.printf("%s \n", newItem2.category);
        System.out.printf("%s \n", newItem2.price);


    }
}


