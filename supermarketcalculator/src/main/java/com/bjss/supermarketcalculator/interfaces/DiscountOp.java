/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjss.supermarketcalculator.interfaces;

import com.bjss.supermarketcalculator.objects.Basket;
import com.bjss.supermarketcalculator.objects.discount.DiscountTransaction;

/**
 *
 * @author David Reoch
 */
public interface DiscountOp {
    
    DiscountTransaction applyDiscountOp(final Basket basket);
    
    double round (double value, int precision);
    
}
