package com.bjss.supermarketcalculator.objects;

import java.util.List;

/**
 * Class which sums the values of a basket of items
 * @author David Reoch
 */
public class PriceBasket extends Basket{

    @Override
    public double sum() {
        List<Item> itemList = super.getItemList();        
        return itemList.stream().filter(item -> item.getPrice() > 0).mapToDouble(item -> item.getPrice()).sum();
    }
    
}
