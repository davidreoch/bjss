package com.bjss.supermarketcalculator.objects.discount;

import com.bjss.supermarketcalculator.interfaces.DiscountOp;
import com.bjss.supermarketcalculator.objects.Basket;
import com.bjss.supermarketcalculator.objects.Item;

/**
 *
 * @author David Reoch
 */
public class SoupBreadDiscountOp implements DiscountOp {

    @Override
    public DiscountTransaction applyDiscountOp(final Basket basket) {

        int soupCount = 0;
        double savings = 0;
        int eligbleBreads;

        soupCount = basket.getItemList().stream().filter((item) -> (item.getName().equalsIgnoreCase("SOUP"))).map((_item) -> 1).reduce(soupCount, Integer::sum);

        if (soupCount % 2 == 0) { //even
            eligbleBreads = soupCount / 2;
        }
        else { // odd
            eligbleBreads = (soupCount - 1) / 2;
        }

        for (Item item : basket.getItemList()) {
            if (item.getName().equalsIgnoreCase("BREAD")) {
                if (eligbleBreads > 0) {
                    double newPrice = item.getPrice() * 0.5;
                    savings += (item.getPrice() - newPrice);
                    item.setPrice(newPrice);
                    eligbleBreads--;
                }
                else {
                    break;
                }
            }
        }

        return new DiscountTransaction("Buy 2 tins of soup and get a loaf of bread for half price -", String.format("%.2f", savings));
    }
}
