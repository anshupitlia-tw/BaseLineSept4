package com.twu.receiptgenerator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void shouldReturnASalesTaxOfZero() {
        Goods goods = new Book(12.90);

        assertEquals(0.0, goods.salesTax(), 0.0001);
    }
}
