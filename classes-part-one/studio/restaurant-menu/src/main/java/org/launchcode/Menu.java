package org.launchcode;


import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    // Constructor
    public Menu() {
        this.menuItems = new ArrayList<>();
        this.lastUpdated = new Date();
    }

    // add a menu item
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
        this.lastUpdated = new Date();
    }


    public void displayMenu() {
        for (MenuItem item : menuItems) {
            System.out.println("Category: " + item.getCategory());
            System.out.println("Name: " + item.getName());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Price: $" + item.getPrice());
            System.out.println();
        }
        System.out.println("Menu last updated: " + lastUpdated);
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Caesar Salad", 8.00, "romaine lettuce with Caesar dressing", "Appetizer", false);
        MenuItem item2 = new MenuItem("Pasta", 5.00, "pasta with shrims", "Main course", true);

        // menu object
        Menu menu = new Menu();
        menu.addMenuItem(item1);
        menu.addMenuItem(item2);
        System.out.println("Current Menu:");
        menu.displayMenu();

    }}

