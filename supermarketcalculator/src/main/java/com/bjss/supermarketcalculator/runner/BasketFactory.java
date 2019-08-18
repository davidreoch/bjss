package com.bjss.supermarketcalculator.runner;

import com.bjss.supermarketcalculator.objects.Basket;
import com.bjss.supermarketcalculator.objects.PriceBasket;

/**
 *
 * @author David Reoch
 */
public class BasketFactory {

    public Basket getBasket(String basketType) {
        if (basketType == null) {
            return null;
        }
        if (basketType.equalsIgnoreCase("PRICEBASKET")) {
            return new PriceBasket();
        }

        return null;
    }
}
