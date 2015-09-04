package com.twu.receiptgenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInterface {
    private String inputByUser;
    private String outputForUser;

    public String getInputFromUser() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            inputByUser = br.readLine();
        }
        catch (IOException ioe) {
            inputByUser = "no input by user";
            System.out.println("ERROR!");
        }
        return inputByUser;
    }
}
