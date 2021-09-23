package org.launchcode.java.studiorestaurantmenu;

public class MenuItems {

    public double price;
    public String description;
    public String category;
    private boolean isNew;

    public MenuItems(double p, String d, String c, boolean iN){
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void  setPrice(double price){
        this.price = price;
    }

    public void  setDescription(String description){
        this.description = description;
    }

    public void setCategory(String category){
        this.category =category;
    }

    public void setNew(boolean aNew){
        isNew = aNew;
    }

    public double getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public String getCategory(){
        return category;
    }

    public boolean isNew() {
        return isNew;
    }
}
