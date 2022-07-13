package SoftuniFundamentals;

import java.util.*;

public class FromLeftToTheRight {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        long sum = 0;

        for ( int i = 0 ; i < n; i++ ) {


            String[] input = scanner.nextLine ( ).split ( " " );
            long x = Long.parseLong ( input[ 0 ] );
            long y = Long.parseLong ( input[ 1 ] );

            if ( x >= y ) {
                while ( x != 0 ) {
                    long a = x % 10;
                    sum = sum + a;
                    x = x / 10;
                }
            } else {
                while ( y != 0 ) {
                    long a = y % 10;
                    sum = sum + a;
                    y = y / 10;
                }
            }
            System.out.println (sum );
            sum=0;
            //input = scanner.nextLine ( ).split ( " " );
        }
    }


    }

