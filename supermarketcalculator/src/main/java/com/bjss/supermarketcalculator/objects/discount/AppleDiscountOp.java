package com.bjss.supermarketcalculator.objects.discount;

import com.bjss.supermarketcalculator.interfaces.DiscountOp;
import com.bjss.supermarketcalculator.objects.Apples;
import com.bjss.supermarketcalculator.objects.Basket;
import com.bjss.supermarketcalculator.objects.Item;

/**
 *
 * @author David Reoch
 */
public class AppleDiscountOp implements DiscountOp {

    @Override
    public DiscountTransaction applyDiscountOp(final Basket basket) {

        double savings = 0;

        for (Item item : basket.getItemList()) {
            if (item.getName().equalsIgnoreCase("Apples")) {
                double newPrice = item.getPrice() * 0.9;
                savings += (item.getPrice() - newPrice);
                savings = round(savings, 1);
                item.setPrice(newPrice);
            }
        }

        if (savings > 1.00) {
            return new DiscountTransaction("Apples 10% off -£", String.format("%.2f", savings));
        }
        else {
            return new DiscountTransaction("Apples 10% off -", String.format("%.2f", savings));
        }

    }

    @Override
    public double round(double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
}
