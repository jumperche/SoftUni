package Uni;

import java.util.Scanner;

public class QIsNotIn {
    // Java logical expressions for testing that:
// (c) Q is not in [234;500]



        public static void main( String[] args) {

            Scanner scan = new Scanner(System.in);

            // (c)
            System.out.println("********************************************");
            System.out.println("Testing if a number Q is outside interval [234;500]");

            System.out.print ("Enter number Q: ");
            int Q = scan.nextInt();

            boolean itemc = !(Q >= 234 && Q <= 500);
            System.out.println("Number Q outside interval [234;500] is " + itemc + " statement.");

        }

    }


