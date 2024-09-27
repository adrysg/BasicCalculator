package com.pluralsight;
import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

// User must input number
        System.out.print("Enter the first number: ");
        double number1 = s.nextDouble();

//User must input other number
        System.out.print("Enter the second number: ");
        double number2 = s.nextDouble();

//Both numbers should be added
        System.out.print("Do you want to add both numbers? ");
        String response = s.next().toUpperCase();

//perform addition
        if (response.equals("Y"));
        double answer = number1 + number2;
        
        System.out.println("The sum is: " + answer);



    }
}
