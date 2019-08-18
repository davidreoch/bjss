package com.bjss.supermarketcalculator.objects.discount;

import com.bjss.supermarketcalculator.objects.Basket;
import com.bjss.supermarketcalculator.objects.Item;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

/**
 * A class to test the SoupBreadDiscountOp
 * @author David Reoch
 */
public class SoupBreadDiscountOpTest {

    private SoupBreadDiscountOp soupBreadDiscountOp;

    @Before
    public void setUp() {
        soupBreadDiscountOp = new SoupBreadDiscountOp();
    }

    /**
     * Test of applyDiscountOp method, of class SoupBreadDiscountOp.
     */
    @Test
    public void testApplyDiscountOp() {
        Basket basket = new Basket() {
            @Override
            public double sum() {
                List<Item> itemList = Arrays.asList(new Item("Soup", 1.00), new Item("Soup", 1.00), new Item("Bread", 1.00), new Item("Bread", 1.00));
                return itemList.stream().filter(item -> item.getPrice() > 0).mapToDouble(item -> item.getPrice()).sum();
            }
        };
        basket.sum();
        basket.addItem(new Item("Soup", 1.00));
        basket.addItem(new Item("Soup", 1.00));
        basket.addItem(new Item("Bread", 1.00));
        basket.addItem(new Item("Bread", 1.00));
        DiscountTransaction discountTransaction = soupBreadDiscountOp.applyDiscountOp(basket);

        Assert.assertEquals("0.50", discountTransaction.getSaving());

        basket = new Basket() {
            @Override
            public double sum() {
                List<Item> itemList = Arrays.asList(new Item("Soup", 1.00), new Item("Soup", 1.00), new Item("Bread", 1.00), new Item("Bread", 1.00));
                return itemList.stream().filter(item -> item.getPrice() > 0).mapToDouble(item -> item.getPrice()).sum();
            }
        };
        basket.addItem(new Item("Soup", 1.00));
        basket.addItem(new Item("Soup", 1.00));
        basket.addItem(new Item("Bread", 1.00));
        basket.addItem(new Item("Bread", 1.00));
        basket.addItem(new Item("Soup", 1.00));
        basket.addItem(new Item("Soup", 1.00));
        discountTransaction = soupBreadDiscountOp.applyDiscountOp(basket);

        Assert.assertEquals("1.00", discountTransaction.getSaving());
    }

}
