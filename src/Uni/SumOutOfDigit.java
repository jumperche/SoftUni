package Uni;

import java.util.Scanner;

public class SumOutOfDigit {
    // Write a program which inputs an n-digit number and
// outputs the sum of its digits

// Solution extracts digits as characters of the input string and converts them to integers



        public static void main( String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print ("Enter a number: ");
            int number = scan.nextInt();
            String s = Integer.toString(number);

            int sum = 0; // where we accumulate the sum

            for (int i = 0; i < s.length(); i++){
                int digit  = Character.getNumericValue(s.charAt(i));
                sum = sum + digit;
            }

            System.out.println("Sum of digits of your number is: " + sum);
        }
    }


