package Uni;

import java.util.Scanner;

public class Z2Z7 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Enter N < 100: " );
        int N = scanner.nextInt ( );
        int[] numbers = new int[ N ];
        for ( int i = 0; i < N; i++ ) {
            numbers[ i ] = scanner.nextInt ( );
        }
        System.out.println ( "The numbers: " );
        for ( int i = 0; i < N; i++ ) {
            System.out.print ( numbers[ i ] + " " );
        }
        System.out.println ( );
        System.out.println ( "Finding min: " );

        int min = numbers[ 0 ];
        for ( int i = 1; i < N; i++ ) {
            if ( numbers[ i ] < min ) min = numbers[ i ];
        }
        System.out.println ( "Min is: " + min );
        System.out.println ( );
        for ( int i = 0; i < N; i++ ) {
            if ( numbers[ i ] == min ) {
                System.out.println ( "Min is archived for index: " + i );
            }


        }
    }
}
