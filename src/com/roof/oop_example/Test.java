package com.roof.oop_example;

public class Test {
    public static void main(String[] args) {

        Bank b1= new SBI();
        System.out.println("interest rate of SBI bank: " + b1.getRateOfInterest());

        Bank b2 = new ICICI();
        System.out.println("interest rate of ICICI bank: " + b2.getRateOfInterest());

        Bank b3 = new AXIS();
        System.out.println("interest rate of AXIS bank: " + b3.getRateOfInterest());
    }

}
