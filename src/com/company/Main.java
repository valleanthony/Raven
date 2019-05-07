package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean mainSwitch = true;
        Scanner keyboard = new Scanner(System.in);
        String userInput;
        String userName;
        int goodwordcount = 0;
        int badwordcount = 0;


        System.out.println("What is your name");
        userName = keyboard.nextLine() + " :";
        ArrayList<String> chatSession = new ArrayList<String>();
        chatSession.add(userName); // Start saving chat session with userName:


        System.out.println("Good Morning,how are you feeling today?(if you would like to exit enter 'Q')");
        while(mainSwitch){
            userInput = keyboard.nextLine();
            if(userInput.equalsIgnoreCase("Q")){
                mainSwitch = false;
            }
            WordReader a1 = new WordReader();
            ResponseGen r1 = new ResponseGen();
            a1.setUserInput(userInput);
            chatSession.add(userName+userInput); // This will save all the userInputs and any items returned from the class as a chat history.
            goodwordcount =goodwordcount+a1.getGoodWordCount();
            badwordcount = badwordcount +a1.getBadWordCount();
            System.out.println(goodwordcount);
            System.out.println(badwordcount);

            r1.setBwordCount(badwordcount);
            r1.setGwordCount(goodwordcount);
            System.out.println(r1.getResponse());
            chatSession.add(r1.getResponse());




        }
        System.out.println(chatSession);
        System.out.println();


    }
}
