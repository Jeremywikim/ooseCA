package com.mycompany.ooseca.order;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private int menuItemIDCounter = 0 ;

    private final List<MenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<MenuItem>();
    }

    // add items to menuItems
    public void addItem(String itemName, double price) {
        int menuItemID = generateMenuItemID();
        this.menuItems.add(new MenuItem(menuItemID, itemName, price));
        System.out.println("size of menuItems: "+ this.menuItems.size());

    }

//    // add items to menu
//    public void addItemToMenu(){
//        this.addItem("fillet", 10.0);
//        this.addItem("hot wing", 15.0);
//
//    }


    // getter

    // get MenuItems
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // get item from menu
    public MenuItem getItemFromMenu(int number){
        if (number >= 0 && number < menuItems.size()) {
            return this.menuItems.get(number);
        } else {
            return null; // Return null for invalid indices
        }
    }


    // number of items
    private int generateMenuItemID() {
        return ++menuItemIDCounter;
    }




//    public void printMenu(){
//        for (MenuItem menuItem:menuItems) {
//            System.out.println(menuItem.getItemName());
//
//        }
//    }





}
