package com.bjss.supermarketcalculator.objects;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David Reoch
 */
public abstract class Basket {

    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
        
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public abstract double sum();
}
