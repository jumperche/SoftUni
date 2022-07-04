package Uni;

import java.util.Scanner;

public class PIn {
    // Java logical expressions for testing that:
// (a) P in [100;500]



        public static void main( String[] args) {

            Scanner scan = new Scanner(System.in);

            // (a)

            System.out.println("*******************************************");
            System.out.println("Testing if a number P is inside an interval [100;500]");
            System.out.print ("Enter number P: ");
            int P = scan.nextInt();

            boolean itema = P >= 100 && P <= 500;
            System.out.println("Number P belongs to [100;500] is " + itema + " statement.");
        }
    }


