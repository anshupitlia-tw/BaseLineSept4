package com.twu.receiptgenerator;

public class ReceiptGeneratorApp {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        Parser parser = new Parser();
        ReceiptGeneratorApplication application = new ReceiptGeneratorApplication(userInterface, parser);
        application.start();
    }
}
