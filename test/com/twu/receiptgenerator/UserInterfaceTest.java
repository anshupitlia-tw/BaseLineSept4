package com.twu.receiptgenerator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserInterfaceTest {

    @Test
    public void shouldBeAbleToGetWhateverInputUserGives() {
        String inputByUser = "Hi! I want to give this line as input";
        UserInterface userInterface = new UserInterface();

        assertEquals(inputByUser, userInterface.getInputFromUser());
    }

}
