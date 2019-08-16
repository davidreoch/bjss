/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    //use getItem method to get object of type shape 
    public Item getItem(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("BREAD")) {
            return new Bread();
        }
        else if (shapeType.equalsIgnoreCase("MILK")) {
            return new Milk();
        }
        else if (shapeType.equalsIgnoreCase("SOUP")) {
            return new Soup();
        }
        else if (shapeType.equalsIgnoreCase("APPLES")){
            return new Apples();
        }

        return null;
    }
}
