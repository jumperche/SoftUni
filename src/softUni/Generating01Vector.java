package softUni;

import java.util.*;

public class Generating01Vector {
    public static int contFor=0;
    public static int countStart=0;
    public static int countEnd=0;
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        Integer[] memory = new Integer[ n ];

        genarateVector ( memory , 0);
        //System.out.printf ("%d %d %d",countStart,contFor,countEnd );
    }

    private static void genarateVector ( Integer[] memory , int index ) {
        countStart++;
        if ( index>= memory.length ) {
            contFor++;
            print ( memory );
            return;
        }

        for ( int i = 0 ; i <= 1 ; i++ ) {
            memory[ index ] = i;


        genarateVector ( memory, index +1);}
        countEnd++;
    }

    public static void print ( Integer[] memory ) {
        for ( Integer i = 0 ; i < memory.length ; i++ ) {
            System.out.print ( memory[ i ] );
        }
        System.out.println ( );
    }
}
