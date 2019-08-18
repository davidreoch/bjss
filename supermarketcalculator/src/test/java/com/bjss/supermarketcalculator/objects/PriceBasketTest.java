package com.bjss.supermarketcalculator.objects;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class to test the PriceBasket basket implementation
 * @author David Reoch
 */
public class PriceBasketTest {
    
    public PriceBasketTest() {
    }

    /**
     * tests the summing method of the basket
     */
    @Test
    public void testSum() {
        Basket basket = new PriceBasket();
        basket.addItem(new Item("Apples", 1.00));
        basket.addItem(new Item("Apples", 1.50));
        basket.addItem(new Item("Apples", 2.00));
        basket.addItem(new Item("Apples", 3.00));
        basket.addItem(new Item("Apples", 4.00));
        double sum = basket.sum();
        Assert.assertEquals(11.50, sum, 0D);
    }
    
}
