package org.launchcode.java.studioresturauntmenu;


import java.util.ArrayList;
import java.util.Date;

public class Menu{
    private Date lastUpdated;
    private ArrayList<menuItems> items;

    public Menu(Date d, ArrayList<menuItems> i){
        this.lastUpdated = d;
        this.items = i;
    }

    public void  setLastUpdated(Date lastUpdated){
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<menuItems> items){
        this.items = items;
    }

    public Date getLastUpdated(){
        return lastUpdated;
    }

    public ArrayList<menuItems> getItems(){
        return items;
    }



















}
