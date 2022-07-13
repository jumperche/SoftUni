package SoftuniFundamentals;

import java.util.*;

public class FromLeftToTheRight {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        int sum = 0;

        for ( int i = 0 ; i < n; i++ ) {


            String[] input = scanner.nextLine ( ).split ( " " );
            double x = Double.parseDouble ( input[ 0 ] );
            double y = Double.parseDouble ( input[ 1 ] );

            if ( x >= y ) {
                while ( x != 0 ) {
                    int a = (int)x % 10;
                    sum = sum + a;
                    x = x / 10;
                }
            } else {
                while ( y != 0 ) {
                    int a =(int) y % 10;
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

