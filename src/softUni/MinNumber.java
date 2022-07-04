package softUni;

import java.util.Scanner;

public class MinNumber {

        public static void main ( String[] args ) {
            Scanner scanner = new Scanner ( System.in );
            String input = scanner.nextLine ( );


            int sum = Integer.MAX_VALUE;
            while ( !input.equals ( "Stop" ) ) {
                int x = Integer.parseInt ( input );

                if ( x < sum ) {
                    sum = x;
                }


                input = scanner.nextLine ( );
            }
            System.out.println ( sum );
        }
    }




