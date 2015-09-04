package com.twu.receiptgenerator;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ParserTest {

    @Test
    public void shouldTokenizeAnInputLineWithInputTextToUnderstandThatItIsANewBasket() {
        Parser parser = new Parser();
        String[] aNewBasket = new String[] {"a new basket"};

        assertArrayEquals(aNewBasket, parser.tokenize("input 2"));
    }

    @Test
    public void shouldTokenizeAnInputLineToIdentifyGoodAndPrice() {
        Parser parser = new Parser();
        String[] aNewItem = new String[] {"1 book","12.49"};

        assertArrayEquals(aNewItem, parser.tokenize("1 book at 12.49"));
    }
}
