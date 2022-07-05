package SoftuniFundamentals;

import java.util.*;

public class SpecialNumber {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );


        for ( int i = 1 ; i <= n ; i++ ) {
            int last=i%10;
            int first=i/10;
            int sum=first+last;
            if ( sum == 5 || sum == 7 || sum == 11 ) {
                System.out.printf ("%d -> True%n",i );
            }
            else {
                System.out.printf ( "%d -> False%n",i );
            }
        }
    }
}
