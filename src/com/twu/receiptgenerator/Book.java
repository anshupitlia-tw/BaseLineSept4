package com.twu.receiptgenerator;

public class Book extends Goods {

    public Book(double price) {
        this.price = price;
    }

    public double salesTax() {
        return 0.0;
    }
}
