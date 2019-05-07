package com.company;

import sun.swing.SwingUtilities2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WordReader {

    // Class Vars

    private String userInput;

    //ArrayList
    ArrayList<String> goodWords = new ArrayList<String>();
    ArrayList<String> badWords = new ArrayList<String>();

    //end class Vars

    //Getters & setters
    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
    //end getters & setters

    // Start Constructor
    public WordReader() {
    }

    public WordReader(String userInput) {
        this.userInput = userInput;
    }

    //End Constructors

    //Adding words to the Good Arraylist
    private void wordsInmethods(){
        goodWords.add("good");
        goodWords.add("glad");
        goodWords.add("happy");
        goodWords.add("relaxed");
        goodWords.add("accomplished");
        goodWords.add("alert");
        goodWords.add("creative");

        badWords.add("bad");
        badWords.add("sad");
        badWords.add("tired");
    }





    private void wordBreaker(String userInput, Array Words){


        String words[] = userInput.split(" ");


    }

    public int counterFunction(){

        return null;
    }


}
