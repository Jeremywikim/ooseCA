package com.mycompany.ooseca.order;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private  List<MenuItem> menuItems;

    // constructor
    public Menu() {
        this.menuItems = new ArrayList<>();
    }

    // add items to menuItems
    public void addItem(String itemName, double price, int inventory) {
        this.menuItems.add(new MenuItem(itemName, price, inventory));
    }



    // get Item
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // get item from menu
    public MenuItem getItemFromMenu(int menuItemID, int quantity){

        for (MenuItem item : menuItems){
            if (item.getMenuItemID() == menuItemID && quantity<= item.getInventory()) {
                int leftInventory = item.getInventory()-quantity;
                item.setInventory(leftInventory);
                return item;
            }
        }
        return null; // alternative flow: when menuItemID is not in the menu, return null
    }

    public MenuItem getItemFromMenu(int menuItemID){

        for (MenuItem item : menuItems){
            if (item.getMenuItemID() == menuItemID ) {
                return item;
            }
        }
        return null;
    }


}
