package SoftuniFundamentals;
//Read a list of real numbers and print them in ascending order along with their number of occurrences.

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< Double > list = Arrays.stream ( scanner.nextLine ( ).split ( " " ) )
                .map ( Double::parseDouble ).collect ( Collectors.toList ( ) );
        TreeMap< Double, Integer > counts = new TreeMap<> ( );

        for ( Double current : list ) {
            if ( !counts.containsKey ( current ) ) {
                counts.put ( current , 0 );
            }
            counts.put ( current , counts.get ( current ) + 1 );
        }

        for ( Map.Entry< Double, Integer > entry : counts.entrySet ( ) ) {
            System.out.printf ( "%.0f -> %d%n" , entry.getKey ( ) , entry.getValue ( ) );
        }

    }
}
