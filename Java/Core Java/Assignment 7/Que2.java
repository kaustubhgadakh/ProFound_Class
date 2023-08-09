/*
    2. Create an interface
    interface MyMath
    {
    double sqr(double a);
    double cube(double a);
    double cosine(double a);
    double sine(double a);
    }
    Write a class implMath which implements MyMath interface.
    Write another class MathDemo(Que2) ..In main create a reference of MyMath pointing
    to implMath class and invoke the methods..Accept the values from the user..
 */

import java.util.Scanner;

interface MyMath {
    double sqr(double a);
    double cube(double a);
    double cosine(double a);
    double sine(double a);
}

class implMath implements MyMath {
    @Override
    public double sqr(double a) {
        return a * a;
    }

    @Override
    public double cube(double a) {
        return a * a * a;
    }

    @Override
    public double cosine(double a) {
        return Math.cos(a);
    }

    @Override
    public double sine(double a) {
        return Math.sin(a);
    }
}

public class Que2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        
        MyMath mathRef = new implMath();
        
        System.out.println("Square: " + mathRef.sqr(number));
        System.out.println("Cube: " + mathRef.cube(number));
        System.out.println("Cosine: " + mathRef.cosine(number));
        System.out.println("Sine: " + mathRef.sine(number));
        // scanner.close();
    }
}
