package org.example.day02;

public class TemperatureConverter {
    //(celsius * 9.0 / 5.0) + 32;
    //(fahrenheit - 32) * 5.0 / 9.0;

    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9.0 / 5.0) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
       return (fahrenheit - 32) * 5.0 / 9.0;

    }
    public static void main (String[] args)
    {
        double tempC = 100.0;
        double tempF= celsiusToFahrenheit(tempC);
        System.out.println(tempF+" C");

      double backToC= fahrenheitToCelsius(tempF);
        System.out.println(backToC+" F");





    }
}
