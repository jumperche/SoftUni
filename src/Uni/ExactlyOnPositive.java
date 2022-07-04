package Uni;

import java.util.Scanner;

public class ExactlyOnPositive {
    // Java logical expressions for testing that:
// (b) exactly one of the numbers x, y, z is positive



        public static void main( String[] args) {

            Scanner scan = new Scanner(System.in);

            // (b)
            System.out.println("***********************************************");
            System.out.println("Testing if exactly one of 3 numbers is positive");

            System.out.print ("Enter number x: ");
            int x = scan.nextInt();

            System.out.print ("Enter number y: ");
            int y = scan.nextInt();

            System.out.print ("Enter number z: ");
            int z = scan.nextInt();

            boolean itemb = ((x>0) && !(y>0) && !(z>0)) || (!(x>0) && (y>0) && !(z>0)) || (!(x>0) && !(y>0) && (z>0));
            System.out.println("Exactly one number is positive is " + itemb);

        }

    }


