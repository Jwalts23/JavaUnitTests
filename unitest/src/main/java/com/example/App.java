package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(calculateArea(5));
        sum(400.3, 800.2);
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    public static double sum(double n1, double n2){
        double sum = n1 + n2;
        System.out.println("The sum of " + n1 + " + " + n2 + " is: " + sum);
        return sum;
    }
}
