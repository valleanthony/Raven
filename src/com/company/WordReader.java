package com.company;

import sun.swing.SwingUtilities2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WordReader {

    // Class Vars

    private String userInput;
    private int goodWordCount =0;
    private int badWordCount = 0;


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
        wordBreaker(userInput);
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
        badWords.add("angry");
        badWords.add("anxious");
        badWords.add("hungry");
        badWords.add("moody");
        badWords.add("afraid");
    }





    public void wordBreaker(String userInput){


        String [] words = userInput.split(" ");

        for (String items:words){
            for(String wordsInArray:goodWords){
                if (items.equalsIgnoreCase(wordsInArray)){
                    goodWordCount ++;
                }


            }
            for (String wordsInArray:badWords){
                if(items.equalsIgnoreCase(wordsInArray)){
                   badWordCount++;
                }
            }

        } // This loop checks the items in the Words [] array against all the items in the good arraylist.

        System.out.println("Good word count: " + goodWordCount);
        System.out.println("bad word count "+ badWordCount);




    }


    public int getGoodWordCount() {
        return goodWordCount;
    }

    public int getBadWordCount() {
        return badWordCount;
    }

}
