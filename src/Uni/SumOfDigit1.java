package Uni;

import java.util.Scanner;

public class SumOfDigit1 {
    // Write a program which inputs an n-digit number and
// outputs the sum of its digits

// Solution uses division with quotient and remainder for extracting the digits



        public static void main( String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print ("Enter a number: ");
            int number = scan.nextInt(); // user input of the number we want to add digits
            int length = String.valueOf(number).length();
            int sum = 0;
            for (int i = 0; i < length; i++){
                int digit  = number % 10;
                number = number / 10;
                sum = sum + digit;

            }

            System.out.println("Sum of digits of your number is: " + sum);
        }
    }


