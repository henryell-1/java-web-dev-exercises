package org.launchcode.java.studiorestaurantmenu;


import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/*
public class Restaurant {

    public static void main(String[] args){
        MenuItem newItem1 = new MenuItem( price: 5.55, description: "Chilly Pasta", category: "Dinner", isNew: true);
        MenuItem newItem2 = new MenuItem( price: 8.99, description: "T-bone Steak", category: "Dinner", isNew: false);
        MenuItem newItem3 = new MenuItem( price: 6.59, description: "Ice cream pie", category: "Dessert", isNew: true);


        Date today = Calendar.getInstance().getTime();
        ArrayList<MenuItems> startingMenu = new ArrayList<>();

        Menu ourMenu = new Menu(today, startingMenu);

        ourMenu.addItem(newItem1);
        ourMenu.addItem(newItem2);
        ourMenu.addItem(newItem3);

        System.out.println("1. Print the entire menu to the screen.");
        System.out.println("Code: ourMenu.printMenu();\n");
        ourMenu.printMenu();

        System.out.println("\n");
        System.out.println("2. Print individual menu item to screen.");
        System.out.println("Code: ourMenu.printItem(newItem2);\n");
        ourMenu.printMenu(newItem2);

        System.out.print("\n");
        System.out.println("3. Delete an item from a menu, then reprint the menu");
        System.out.println("ourMenu.removeItem(newItem2);");
        System.out.println("Code: ourMenu.printMenu();\n");
        ourMenu.printMenu(newItem2);
        ourMenu.printMenu();

        System.out.print("\n");
        System.out.println("Printing price and category");
        System.out.println("System.out.printf(\"%s\", newItems2.category);");
        System.out.println("System.out.printf(\"%d\", newItem2.price);\n");
        System.out.printf("%s \n", newItem2.description);
        System.out.printf("%s \n", newItem2.category);
        System.out.printf("%s \n", newItem2.price);


}
}



