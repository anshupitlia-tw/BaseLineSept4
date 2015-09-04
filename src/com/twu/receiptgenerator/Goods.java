package com.twu.receiptgenerator;

public abstract class Goods {
    protected double price;

    public double salesTax() {
        return price * 10 / 100;
    }
}
