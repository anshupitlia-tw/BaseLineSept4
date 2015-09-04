package com.twu.receiptgenerator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldTokenizeAnInputLineWithInputTextToUnderstandThatItIsANewBasket() {
        Parser parser = new Parser();

        assertEquals("a new basket", parser.tokenize("input 2"));
    }
}
