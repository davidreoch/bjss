/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjss.supermarketcalculator.runner;

import com.bjss.supermarketcalculator.objects.Basket;
import com.bjss.supermarketcalculator.objects.Item;
import com.bjss.supermarketcalculator.objects.PriceBasket;

/**
 *
 * @author David Reoch
 */
public class Main {

    public static void main(String[] args) {
        final ItemFactory factory = new ItemFactory();
        final Basket basket = new PriceBasket(); 
        
        if (args.length > 0 && (args[0].equals("PriceBasket"))) {
            for (int i = 1; i < args.length; i++) {
                Item item = factory.getItem(args[i]);
                basket.addItem(item);
                item.print();
            }
        }
        else {
            System.out.println("Wrong format, please start command with 'PriceBasket'.");
            System.exit(0);
        }
        
        
        System.out.println(basket.sum());

    }

}
