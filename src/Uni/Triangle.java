package Uni;

import java.util.Scanner;

public class Triangle {
    // Write a program with input for the sides of rectangle and finds its area and perimeter



        public static void main( String[] args) {   // main

            Scanner scan = new Scanner(System.in); // object type Scanner for input
            System.out.print ("Enter a: ");        // text for telling user to input a
            double a = scan.nextDouble();          // read the input from keyboard in a
            System.out.print ("Enter b: ");        // text for telling user to input b
            double b = scan.nextDouble();          // read the input from keyboard in b

            double area = a*b;            // compute area in variable area
            double perimeter = 2*(a+b);   // compute perimeter in variable perimeter

            System.out.println("Area is: " + area);           // output area
            System.out.println("Perimeter is: " + perimeter); // output perimeter
        }
    }


