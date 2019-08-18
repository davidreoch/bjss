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
    /**
     * Applies a discount operation
     * @param basket basket of items
     * @return a discount transaction object
     */
    DiscountTransaction applyDiscountOp(final Basket basket);
    
    /**
     * method to round doubles
     * @param value the double value to round
     * @param precision the precision of the rounding
     * @return 
     */
    double round (double value, int precision);
    
}
