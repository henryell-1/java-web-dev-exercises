package org.launchcode.java.studioresturauntmenu;

public class menuItems {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public  menuItems(double p, String d, String c, boolean iN){
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

    public boolean getANew(){
        return true;
    }
}
