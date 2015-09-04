package com.twu.receiptgenerator;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ReceiptGeneratorApplicationTest {

    @Test
    public void shouldCallToGetInputFromUserWhenApplicationIsStarted() {
        UserInterface userInterface = mock(UserInterface.class);
        ReceiptGeneratorApplication receiptGeneratorApplication = new ReceiptGeneratorApplication(userInterface);
        receiptGeneratorApplication.start();

        verify(userInterface, times(1)).getInputFromUser();
    }

}
