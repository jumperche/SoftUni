package softUni;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCondenseToNumber {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        {
            int[] numbers = Arrays
                    .stream ( scanner.nextLine ( ).split ( " " ) )
                    .mapToInt ( e -> Integer.parseInt ( e ) )
                    .toArray ( );
            if ( numbers.length == 1 ) {
                System.out.println ( numbers[0] );
                return;
            }

            int[] condensed = new int[numbers.length - 1];

            for ( int i = 0; i < numbers.length; i++ ) {
                for ( int j = 0; j < condensed.length - i; j++ ) {

                    condensed[j] = numbers[j] + numbers[j + 1];
                }
                numbers = condensed;
            }
            System.out.println ( condensed[0] );

        }
    }
}
