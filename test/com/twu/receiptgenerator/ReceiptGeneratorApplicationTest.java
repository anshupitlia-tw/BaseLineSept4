package com.twu.receiptgenerator;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class ReceiptGeneratorApplicationTest {

    @Test
    public void shouldCallToGetInputFromUserWhenApplicationIsStarted() {
        UserInterface userInterface = mock(UserInterface.class);
        Parser parser = mock(Parser.class);
        ReceiptGeneratorApplication receiptGeneratorApplication = new ReceiptGeneratorApplication(userInterface, parser);
        receiptGeneratorApplication.start();

        verify(userInterface, times(1)).getInputFromUser();
    }

    @Test
    public void shouldCallToParserToParseUserInput() {
        UserInterface userInterface = mock(UserInterface.class);
        Parser parser = mock(Parser.class);
        String inputFromUser = "Input 1:\n" +
                "1 book at 12.49\n" +
                "1 music CD at 14.99\n" +
                "1 chocolate bar at 0.85";
        when(userInterface.getInputFromUser()).thenReturn(inputFromUser);
        ReceiptGeneratorApplication receiptGeneratorApplication = new ReceiptGeneratorApplication(userInterface, parser);
        receiptGeneratorApplication.start();

        verify(parser, times(1)).initializeGoods(inputFromUser);
    }
}
