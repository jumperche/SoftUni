package SoftuniFundamentals;
//You have a water tank with a capacity of 255 liters.
//On the next n lines, you will receive liters of water, which you must pour into your tank.
//If the capacity is not enough, print "Insufficient capacity!" and continue reading the next line. On the last line, print the liters in the tank.
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
