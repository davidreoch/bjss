package com.bjss.supermarketcalculator.objects.discount;

/**
 * A class to represent a discount transaction
 * @author David Reoch
 */
public class DiscountTransaction {

    private String message;
    private String saving;

    /**
     * Constructor for the discount transaction
     * @param message the message to return
     * @param saving the total saving
     */
    public DiscountTransaction(String message, String saving) {
        this.message = message;
        this.saving = saving;
    }

    /**
     * gets the saving value
     * @return saving amount
     */
    public String getSaving() {
        return saving;
    }

    /**
     * Sets the saving value
     * @param saving the saving to set
     */
    public void setSaving(String saving) {
        this.saving = saving;
    }

    /**
     * Gets the message
     * @return the message string to return
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message
     * @param message the message to set 
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
