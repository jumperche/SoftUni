
package softUni;

import java.util.*;

public class Variations {
    public static String[] elements;
    public static String[] variation;
    public static boolean[] used;

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int k = Integer.parseInt ( scanner.nextLine ( ) );
        elements = scanner.nextLine ( ).split ( "\\s+" );

        variation = new String[ k ];
        used = new boolean[ elements.length ];
        variations ( 0 );
    }

    private static void variations ( int index ) {
        if ( index == variation.length ) {
            printE ( variation );
            return;
        }
        for ( int i = 0 ; i < elements.length ; i++ ) {
            if ( !used[ i ] ) {
                used[ i ] = true;
                variation[ index ] = elements[ i ];
                variations ( index + 1 );
                used[ i ] = false;
            }
        }
    }

    private static void printE ( String[] arr ) {

        System.out.println ( String.join ( " " , arr ) );
    }
}
