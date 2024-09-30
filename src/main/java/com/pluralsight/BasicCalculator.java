package com.pluralsight;
import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

// User must input number
        System.out.print("Enter the first number: ");
        double num1 = s.nextDouble();
        s.nextLine();

//User must input other number
        System.out.print("Enter the second number: ");
        double num2 = s.nextDouble();
        s.nextLine();

//Select an operation
        System.out.println("Possible Calculations: ");
        System.out.println(" (A)dd");
        System.out.println(" (S)ubtract");
        System.out.println(" (M)ultiply");
        System.out.println(" (D)ivide");
        System.out.println("Please select an operation: ");

//perform operations
        String option = s.nextLine();

        if (  option.equals("A")) {
            //System.out.println("A was selected");
            double result = num1 + num2;
            System.out.println(num1 + "+" + num2 + "=" + result);
        }
        if (  option.equals("S")) {
            //System.out.println("A was selected");
            double result = num1 - num2;
            System.out.println(num1 + "-" + num2 + "=" + result);
        }
        if (  option.equals("M")) {
            //System.out.println("A was selected");
            double result = num1 * num2;
            System.out.println(num1 + "*" + num2 + "=" + result);
        }
        if (  option.equals("D")) {
            //System.out.println("A was selected");
            double result = num1 / num2;
            System.out.println(num1 + "/" + num2 + "=" + result);
        }

    }
}
