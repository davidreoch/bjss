package com.bjss.supermarketcalculator.objects;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David Reoch
 */
public abstract class Basket {

    /**
     * The list of items
     */
    private List<Item> itemList = new ArrayList<>();

    /**
     * adds an item to the item list
     * @param item the item to add
     */
    public void addItem(Item item) {
        itemList.add(item);
        
    }

    /**
     * get the item list
     * @return returns a list of items
     */
    public List<Item> getItemList() {
        return itemList;
    }

    /**
     * the method that performs the summation of items
     * @return returns the sum value
     */
    public abstract double sum();
}
