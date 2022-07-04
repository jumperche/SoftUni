package Uni;

import java.lang.Math;
import java.util.Scanner;

public class Generator {
    public static void main ( String[] args ) {

        Scanner scan = new Scanner ( System.in );
        int n = 0;
        double sum = 0;
        int min = 300;
        int max=500;

        do {
            System.out.print ( "N: " );
            n = scan.nextInt ( );
        }
        while ( n <= 0 || n >= 100 );

        for ( int i = 0; i <n ; i++ ) {
            int x = (int)(Math.random()*(max-min+1)+min);
            System.out.println (x );
            sum+=x;
        }
        System.out.print( "Average is: " +sum/n );


    }
}
