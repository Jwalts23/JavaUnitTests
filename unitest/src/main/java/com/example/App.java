package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    static String outputString = "";
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(calculateAreaCircle(5));
        add(400.3, 800.2);
    }

    public static double calculateAreaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateAreaSquare(double r) {
        return r * r;
    }

    public static double calculateAreaRectangle(double b, double h) {
        return b * h;
    }


    public static double calculateAreaTrapizoid(double a, double b, double h) {
        return (a + b) * .5 * h;
    }

    public static double add(double n1, double n2){
        double sum = n1 + n2;
        outputString = "The sum of " + n1 + " + " + n2 + " is: " + sum; 
        print(outputString);
        return sum;
    }
    public static double subtract(double n1, double n2){
        double sum = n1 - n2;
        System.out.println("The sum of " + n1 + " - " + n2 + " is: " + sum);
        print(outputString);
        return sum;
    }

    public static double divide(double n1, double n2){
        double div = n1/n2;
        outputString = "The result of " + n1 + "/" + n2 + " is: " + div;
        print(outputString);
        return div;
    }

    public static double multiply(double n1, double n2){
        double div = n1*n2;
        outputString = "The result of " + n1 + "*" + n2 + " is: " + div;
        print(outputString);
        return div;
    }

    public static void print(String msg){
        System.out.println(msg);
    }

}
