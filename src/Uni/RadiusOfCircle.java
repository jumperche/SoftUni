package Uni;

import java.util.Scanner;

public class RadiusOfCircle {
    // This program inputs a radius of a circle and finds its area and circumference



        public static void main( String[] args) { // main

            Scanner scan = new Scanner(System.in); // object type Scanner for input
            System.out.print ("Enter r: ");        // text for telling user to input r
            double r = scan.nextDouble();          // read the input from keyboard in r

            double circ = 2*Math.PI*r;
            double area = Math.PI*Math.pow(r, 2);

            System.out.println("Area is: " + area);
            System.out.println("Circumference is: " + circ);
        }

    }


