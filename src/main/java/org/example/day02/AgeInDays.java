package org.example.day02;

import java.util.Scanner;

public class AgeInDays {
    public static int CalculateAge(int years)
    {
        int days = years * 365;
        return days;
    }
    public static void main(String[]args)
    {
        //days = years * 365;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age in years: ");
       int age= sc.nextInt();
       int totalDays =CalculateAge(age);
       System.out.println("Your age in days is: "+totalDays );



    }
}
