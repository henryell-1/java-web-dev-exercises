package org.launchcode.java.studiorestaurantmenu;


import java.util.ArrayList;
import java.util.Date;

public class Menu{
    private Date lastUpdated;
    private ArrayList<MenuItems> items;

    public Menu(Date d, ArrayList<MenuItems> i){
        this.lastUpdated = d;
        this.items = i;
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



















}
