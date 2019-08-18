/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjss.supermarketcalculator.objects.discount;

/**
 *
 * @author David Reoch
 */
public class DiscountTransaction {

    private String message;
    private String saving;

    public DiscountTransaction(String message, String saving) {
        this.message = message;
        this.saving = saving;
    }

    public String getSaving() {
        return saving;
    }

    public void setSaving(String saving) {
        this.saving = saving;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
