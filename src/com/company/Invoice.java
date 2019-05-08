package com.company;

public class Invoice {
    private String username;
    private String address;
    private String city;
    private String zip;
    private String state;
    private String ravenOutput;
    private int ravenOutputCounter;
    private double baseprice;
    private double responsePrice;
    private double total;

    public Invoice() {
        math();
    }

    public Invoice(String username, String address, String city, String zip, String state, String ravenOutput, int ravenOutputCounter, double baseprice, double responsePrice, double total) {
        this.username = username;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.ravenOutput = ravenOutput;
        this.ravenOutputCounter = ravenOutputCounter;
        this.baseprice = baseprice;
        this.responsePrice = responsePrice;
        this.total = total;
    }

    public double getTotal() {
        double responsebill = responsePrice * ravenOutputCounter;
        double subtotal = baseprice +responsebill;
        return subtotal;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getRavenOutput() {
        return ravenOutput;
    }

    public void setRavenOutput(String ravenOutput) {
        this.ravenOutput = ravenOutput;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getRavenOutputCounter() {
        return ravenOutputCounter;
    }

    public void setRavenOutputCounter(int ravenOutputCounter) {
        this.ravenOutputCounter = ravenOutputCounter;
    }

    public double getBaseprice() {
        return baseprice;
    }

    public void setBaseprice(double baseprice) {
        this.baseprice = baseprice;
    }

    public double getResponsePrice() {
        return responsePrice;
    }

    public void setResponsePrice(double responsePrice) {
        this.responsePrice = responsePrice;
    }

    private void math(){
        baseprice = 100.00;
        responsePrice = 0.35;
    }

    public void displayInvoicebill(){
        String mainAdress = city + " , "+ state+ " "+ zip;
        System.out.println(username);
        System.out.println(address);
        System.out.println(mainAdress);
        System.out.println("----------------");



    }


}
