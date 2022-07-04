package Uni;

import java.util.Scanner;

public class Z2Z3 {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        int n = 0;
        double sum = 0;
        do {
            System.out.print ( "N: " );
            n = scan.nextInt ( );
        }
        while ( n <= 0 || n >= 100 );
        for ( int i = 0; i < n; i++ ) {
            System.out.print ( " Enter number: " );
            int temp = scan.nextInt ( );
            sum += temp;
        }
        System.out.printf ( "Average is: %.2f" , sum / n );
    }
}
