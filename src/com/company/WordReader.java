package com.company;

import java.lang.reflect.Array;

public class WordReader {

    private String userInput;

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public WordReader() {
    }

    public WordReader(String userInput) {
        this.userInput = userInput;
    }


    private void wordBreaker(String userInput, Array Words){

        String words[] = userInput.split(" ");

    }


}
