package com.bjss.supermarketcalculator.runner;

import com.bjss.supermarketcalculator.objects.Apples;
import com.bjss.supermarketcalculator.objects.Bread;
import com.bjss.supermarketcalculator.objects.Item;
import com.bjss.supermarketcalculator.objects.Milk;
import com.bjss.supermarketcalculator.objects.Soup;

/**
 *
 * @author David Reoch
 */
public class ItemFactory {

    /**
     * factory method to return different types of item
     * @param itemType the string type of the item
     * @return return the concrete class 
     */
    public Item getItem(String itemType) {
        if (itemType == null) {
            return null;
        }
        if (itemType.equalsIgnoreCase("BREAD")) {
            return new Bread();
        }
        else if (itemType.equalsIgnoreCase("MILK")) {
            return new Milk();
        }
        else if (itemType.equalsIgnoreCase("SOUP")) {
            return new Soup();
        }
        else if (itemType.equalsIgnoreCase("APPLES")){
            return new Apples();
        }

        return null;
    }
}
