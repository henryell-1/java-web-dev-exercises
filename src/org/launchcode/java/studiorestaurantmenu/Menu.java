package org.launchcode.java.studiorestaurantmenu;


import jdk.internal.jimage.ImageStrings;
import jdk.internal.jimage.ImageStringsReader;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class Menu{
    private Date lastUpdated;
    private ArrayList<MenuItems> items;
    private ImageStringsReader item;


    public Menu(Date d, ArrayList<MenuItems> item){
        this.lastUpdated = d;
        this.items = item;
    }

    public void  setLastUpdated(Date lastUpdated){
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItems> items){
        this.items = items;
    }

    public Date getLastUpdated(){
        return lastUpdated;
    }

    public ArrayList<MenuItems> getItems(){
        return items;
    }

    public ArrayList<MenuItems> addItem(MenuItem item){
        this.item.add(String.valueOf(item));
        return this.items;
    }

    public  ArrayList<MenuItems> removeItem(MenuItems item){
        int toBeRemoved = -1;
        for (int i = 0; i < items.size(); i++){
            if(items.get(i).equals(item)){
                toBeRemoved = i;
            }
        }
        this.items.remove(toBeRemoved);
        return  this.items;

    }

    public  String menuUpdated(){
        return("The menu was last updated on " + this.lastUpdated);
    }

    public  void  printItem(MenuItems item){
        System.out.println(item.getDescription());
    }

    public void printMenu(MenuItem newItem2){
        for (int i = 0; i < items.size(); i++){
            System.out.println(items.get(i).getDescription());
        }
    }
}
