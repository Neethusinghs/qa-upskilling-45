package org.example.day02;

import java.util.Scanner;

public class SimpleInterest {

    public static double simpleInterestCalculate(double principal,double rate, double time)
    {
        double simpleInterest = (principal * rate * time) / 100;
        return simpleInterest;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal amount");
        double principal= sc.nextDouble();

        System.out.println("Enter rate");
        double rate = sc.nextDouble();

        System.out.println("Enter Time (in years)");
        double time = sc.nextDouble();

        double result = simpleInterestCalculate(principal,rate,time);
        System.out.println(("Simple Interest: "+result));
    }
}
