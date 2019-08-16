/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjss.supermarketcalculator.objects;

import java.util.List;

/**
 *
 * @author David Reoch
 */
public class PriceBasket extends Basket{

    @Override
    public double sum() {
        List<Item> itemList = super.getItemList();
        return itemList.stream().filter(item -> item.getPrice() > 0).mapToDouble(item -> item.getPrice()).sum();
    }
    
}
