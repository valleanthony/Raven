package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ResponseGen {
    private int GwordCount = 0;
    private int BwordCount = 0;
    private String response = "This is a test of the Response Gen class";
    ArrayList<String> goodResponse = new ArrayList<String>();
    ArrayList<String> badResponse = new ArrayList<String>();
    ArrayList<String> okresposne = new ArrayList<String>();

    public ResponseGen() {
        addingWordstoarrays();
    }

    public ResponseGen(int gwordCount, int bwordCount, String response) {
        GwordCount = gwordCount;
        BwordCount = bwordCount;
        this.response = response;
    }

    public int getGwordCount() {
        return GwordCount;
    }

    public void setGwordCount(int gwordCount) {
        GwordCount = gwordCount;
    }

    public int getBwordCount() {
        return BwordCount;
    }

    public void setBwordCount(int bwordCount) {
        BwordCount = bwordCount;
    }

    public String getResponse() {
        String test = "";
        if (GwordCount > BwordCount) {
            test = goodResponse.get(0);
        }
        if (GwordCount < BwordCount) {
            test = badResponse.get(0);
        }
        if (GwordCount == BwordCount) {
            test = okresposne.get(0);
        }
        return test;

    }

    public void setResponse(String response) {
        this.response = response;
    }

    private void addingWordstoarrays() {
        goodResponse.add("I am so happy for you...Yay..");
        goodResponse.add("that's great...");
        goodResponse.add("is that so...");
        goodResponse.add("hold up...");



        badResponse.add("REALLY? TELL ME MORE");
        badResponse.add("WHAT ELSE HAPPENED?");
        badResponse.add("HOW DID THAT MAKE YOU FEEL?");
        badResponse.add("WOW! PLEASE ELABORATE ");


        okresposne.add("meh");
        okresposne.add("That's not that interesting");
        okresposne.add("sounds fine");
        okresposne.add("sure");
        Collections.shuffle(okresposne);
        Collections.shuffle(badResponse);
        Collections.shuffle(goodResponse);
    }




}



