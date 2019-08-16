package com.bjss.supermarketcalculator.objects;

/**
 *
 * @author David Reoch
 */
public class Item {

    private String name;
    private double price;

    public Item(String name, double price) {
        this.setName(name);
        this.setPrice(price);
    }

    public void print() {
        System.out.println(this.getName() + " added to basket, Price = " + this.getPrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
