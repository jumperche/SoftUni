package Uni;

import java.util.Scanner;

public class ExchangeVaribles {
    // Write a program that inputs values in two variables and
// exchanges the values of the variable using a third variable



        public static void main( String[] args) { // main

            Scanner scan = new Scanner(System.in); // object type Scanner for input
            System.out.print ("Enter a: ");        // text for telling user to input a
            double a = scan.nextDouble();          // read the input from keyboard in a
            System.out.print ("Enter b: ");        // text for telling user to input b
            double b = scan.nextDouble();          // read the input from keyboard in b

            double temp = a; // temp remembers a
            a = b;    // a takes the value of b
            b = temp;  // b takes the value of temp that is equal to a

            System.out.println("a is: " + a);
            System.out.println("b is: " + b);
        }

    }


