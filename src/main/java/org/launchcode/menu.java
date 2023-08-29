package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class menu {
    private List<menuItem> menuItems;
    private Date lastUpdate;
    public menu(){
       menuItems = new ArrayList<>();
        lastUpdate = new Date(); // Initialize with the current date.

    }
    public  void addMenuItem(menuItem item){
        menuItems.add(item);
        lastUpdate = new Date();// update lastupdated when a new item is added
    }
    public List<menuItem> getMenuItems(){
        return menuItems;
    }
    public Date getLastUpdate(){
        return lastUpdate;
    }
}
