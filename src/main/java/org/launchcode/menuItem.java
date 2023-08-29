package org.launchcode;

public class menuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    public menuItem(String name, double price, String description,String category, boolean isNew){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }
public boolean isNew(){
        return isNew;
}
    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
