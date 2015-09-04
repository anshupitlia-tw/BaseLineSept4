package com.twu.receiptgenerator;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class UserInterfaceTest {
    @Test
    public void shouldBeAbleToGetWhateverInputUserGives() {
        String inputByUser = "Hi! I want to give a different line as input";
        ByteArrayInputStream inContent = new ByteArrayInputStream(inputByUser.getBytes());
        System.setIn(inContent);
        UserInterface userInterface = new UserInterface();

        assertEquals(inputByUser, userInterface.getInputFromUser());
    }
}
