package com.company;

import java.util.ArrayList;

public class ResponseGen {
    private int GwordCount = 0;
    private int BwordCount = 0;
    private  String response = "This is a test of the Response Gen class";
    ArrayList<String>goodResponse = new ArrayList<String>();
    ArrayList<String> badResponse = new ArrayList<String>();
    ArrayList<String>okresposne = new ArrayList<String>();

    public ResponseGen() {
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
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    private void addingWordstoarrays(){
        goodResponse.add("I am so happy for you...Yay..");
        badResponse.add("REALLY? TELL ME MORE");
        okresposne.add("meh");

    }

//    public void responseGen(){
//        addingWordstoarrays();
//        if ()
//    }



}