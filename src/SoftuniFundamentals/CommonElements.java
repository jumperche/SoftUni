package SoftuniFundamentals;

import java.util.*;

public class CommonElements {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String[] input = scanner.nextLine ( ).split ( " " );
        String[] input1 = scanner.nextLine ( ).split ( " " );
        for ( int i = 0 ; i < input.length ; i++ ) {
            for ( int j = 0 ; j < input1.length ; j++ ) {


                if ( input[ i ].equals ( input1[ j ] )) {
                    System.out.print ( input[ i ] + " " );
                }
            }
        }
    }
}
