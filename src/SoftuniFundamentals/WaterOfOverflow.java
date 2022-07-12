package SoftuniFundamentals;

import java.util.*;

public class WaterOfOverflow {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        int tank = 255;
        int sum=0;
        for ( int i = 0 ; i < n ; i++ ) {
            int input = Integer.parseInt ( scanner.nextLine ( ) );
            if ( tank - (sum+input) > 0 ) {
                sum = sum + input;
            } else {
                System.out.println ( "Insufficient capacity!" );
            }

        }
        System.out.println (sum );
    }
}
