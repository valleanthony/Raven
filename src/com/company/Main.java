package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean mainSwitch = true;
        Scanner keyboard = new Scanner(System.in);
        String userInput;
        String userName;


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
            a1.setUserInput(userInput);
            chatSession.add(userInput); // This will save all the userInputs and any items returned from the class as a chat history.

        }

    }
}
