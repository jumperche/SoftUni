package SoftuniFundamentals;

import java.util.*;

public class StrongNumber {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        int orig=n;
        int sum = 0;
        int x = 0;
        int xSum = 1;
        while ( n > 0 ) {
            x = n % 10;
            for ( int i = x ; i >0  ; i-- ) {


                xSum = xSum * i;
            }

            sum = sum + xSum;
            n = n / 10;
            xSum=1;
        }
        if ( orig == sum ) {
            System.out.println ( "yes" );
        } else {
            System.out.println ( "no" );
        }
    }
}
