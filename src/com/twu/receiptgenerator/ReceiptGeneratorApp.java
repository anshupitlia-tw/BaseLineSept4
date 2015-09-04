package com.twu.receiptgenerator;

public class ReceiptGeneratorApp {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        ReceiptGeneratorApplication application = new ReceiptGeneratorApplication(userInterface);
        application.start();
    }
}
