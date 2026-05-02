package org.example.day02;

public class BMICalculator {
    public static double calculateBmi(double weightkg,double heightm )
    {
        double bmi = weightkg / (heightm * heightm);
        return  Math.round(bmi*100.0)/100.0; //to round of upto 2 digits
        //return bmi;
    }
    public static void main(String[]args)
    {
        //bmi= weight/(height*height)
        double weight = 48.0;
        double height = 5.2;
      double result= calculateBmi(weight,height);
      System.out.println("Result: "+result);


    }
}
