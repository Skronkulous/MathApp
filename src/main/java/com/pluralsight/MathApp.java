package com.pluralsight;
import java.math.*;

public class MathApp {
    public static void main (String[] args){
        //Question 1
        int bobSalary = 50000;
        int garySalary = 100000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: " + highestSalary);

        //Question 2
        int carPrice = 50000;
        int truckPrice = 75000;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is: " + lowestPrice);

        //Question 3
        double circleRadius = 7.25;
        double circleArea = (circleRadius * circleRadius * Math.PI);
        System.out.println("The area of the circle is: " + circleArea);

        //Question 4
        double var = 5.0;
        System.out.println("The sqare root of the value is: " + Math.sqrt(var));

        //Question 5
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;
        System.out.println("The distance between our two points is: " + Math.sqrt((y2 - y1)*(y2 - y1) + (x2 - x1)*(x2 - x1)));

        //Question 6
        double absVal = -3.8;
        System.out.println("The absolute value of our variable is: " + Math.abs(absVal));

        //Question 7
        System.out.println("This is a random value between 0 and 1: " + Math.random());

    }
}
