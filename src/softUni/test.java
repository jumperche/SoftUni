package softUni;

import java.util.Scanner;

public class test {
    public static void main ( String[] args ) {


        Scanner scan = new Scanner ( System.in );
        int n = scan.nextInt ( );
        int counter = 0;
        int min = 1;
        int max = 200;
        int x = 0;

        do {
            System.out.print ( "N: " );
            n = scan.nextInt ( );
        }
        while ( n <= 0 || n >= 100 );

        for ( int i = 0 ; i < n ; i++ ) {
            x = (int) (Math.random ( ) * (max - min + 1) + min);
            System.out.println ( x );

        if ( x <= 100 ) {
            counter++;
        }
        }
        System.out.print ( "Numbers found: " + counter );

    }
}
