package org.example.day02;

import java.util.Scanner;

public class TipSplitter {

    public static double calculateTipSplitter(double billAmount,double tipPercent, int numberOfPeople )
    {
        double tipAmount = (billAmount * tipPercent) / 100;
        double totalBill = billAmount + tipAmount;
       return  totalBill/numberOfPeople;

    }
    public static void main(String[]args)
    {
        //tipAmount = (billAmount * tipPercent) / 100;
        //double totalBill = billAmount + tipAmount;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter bill Amount: ");
        double billAmount = sc.nextDouble();

        System.out.println("Enter tip percent: ");
        double tipPercent = sc.nextDouble();


        System.out.print("Enter number of people: ");
        int numberOfPeople = sc.nextInt();

        double Tip = calculateTipSplitter(billAmount,tipPercent,numberOfPeople);
        System.out.println("Each person should pay: "+Tip);


    }
}
