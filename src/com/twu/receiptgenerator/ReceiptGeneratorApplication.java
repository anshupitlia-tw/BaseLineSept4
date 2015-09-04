package com.twu.receiptgenerator;

public class ReceiptGeneratorApplication {
    private UserInterface userInterface;
    private Parser parser;
    
    public ReceiptGeneratorApplication(UserInterface userInterface, Parser parser) {
        this.userInterface = userInterface;
        this.parser = parser;
    }

    public void start() {
        String input;
        input = userInterface.getInputFromUser();
        parser.initializeGoods(input);
    }
}
