package com.diegotcba.tdd;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Check Amount to Text\n");
        Check check=new Check(2523.04);
        System.out.println("amount: " + check.getAmount());
        System.out.println("text: " + check.getAmountText());
    }
}
