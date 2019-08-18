package com.bjss.supermarketcalculator.objects.discount;

import com.bjss.supermarketcalculator.objects.Basket;
import com.bjss.supermarketcalculator.objects.Item;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

/**
 * Class to test the AppleDiscountOp 
 * @author David Reoch
 */
public class AppleDiscountOpTest {

    private AppleDiscountOp appleDiscountOp;

    @Before
    public void setUp() {
        appleDiscountOp = new AppleDiscountOp();
    }

    /**
     * Test of applyDiscountOp method, of class AppleDiscountOp.
     */
    @Test
    public void testApplyDiscountOp() {
        Basket basket = new Basket() {
            @Override
            public double sum() {
                List<Item> itemList = Arrays.asList(new Item("Apple", 1.00));
                return itemList.stream().filter(item -> item.getPrice() > 0).mapToDouble(item -> item.getPrice()).sum();
            }
        };
        basket.sum();
        basket.addItem(new Item("Apples", 1.00));
        DiscountTransaction discountTransaction = appleDiscountOp.applyDiscountOp(basket);
        
        assertEquals("0.10", discountTransaction.getSaving());
        
        basket.addItem(new Item("Apples", 1.00));
        
        discountTransaction = appleDiscountOp.applyDiscountOp(basket);
        
        assertEquals("0.20", discountTransaction.getSaving());
        
        basket.addItem(new Item("Apples", 1.00));
        
        discountTransaction = appleDiscountOp.applyDiscountOp(basket);
        
        assertEquals("0.30", discountTransaction.getSaving());
    }

}
