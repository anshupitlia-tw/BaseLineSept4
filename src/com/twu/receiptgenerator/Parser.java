package com.twu.receiptgenerator;

//Finds the basket of user and the goods he bought from the input he gives
public class Parser {

    public void initializeGoods(String input) {
        tokenize(input.toLowerCase());
    }

    String[] tokenize(String input) {
        if (input.contains("input")) {
            return new String[] {"a new basket"};
        }
        else {
            return input.split(" at ");
        }
    }
}
