package Uni;

import java.util.Scanner;

public class InsideSquare {
    // Java logical expressions for testing that:
// (d) (a, b) is inside a square with side 5 and (0,0) is in the middle of the square




        public static void main( String[] args) {

            Scanner scan = new Scanner(System.in);

            // (d)
            System.out.println("****************************************************");
            System.out.println("Testing if a point (x,y) in plane is inside a square centered at (0,0)");

            double side = 0;
            while (side <= 0) {
                System.out.print ("Enter positive side of square: ");
                side = scan.nextDouble();
            }

            System.out.print ("Enter coordinate x: ");
            double xc = scan.nextDouble();

            System.out.print ("Enter coordinate y: ");
            double yc = scan.nextDouble();

            double hside = 0.5*side;
            boolean itemd = ((xc < hside) && (xc > -hside) && (yc < hside) && (yc > -hside));
            System.out.println("Point inside the square is " + itemd);
        }
    }


