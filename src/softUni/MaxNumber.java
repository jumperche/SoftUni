package softUni;

import java.util.Scanner;

public class MaxNumber {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input = scanner.nextLine ( );


        int sum = Integer.MIN_VALUE;
        while ( !input.equals ( "Stop" ) ) {
            int x = Integer.parseInt ( input );

            if ( x > sum ) {
                sum = x;
            }


            input = scanner.nextLine ( );
        }
        System.out.println ( sum );
    }
}
