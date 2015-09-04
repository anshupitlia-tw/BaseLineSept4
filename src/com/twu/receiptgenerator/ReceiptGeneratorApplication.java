package com.twu.receiptgenerator;

public class ReceiptGeneratorApplication {
    private UserInterface userInterface;
    
    public ReceiptGeneratorApplication(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    public void start() {
        userInterface.getInput();
    }
}
