package Algorithms;
import java.util.*;
import java.util.stream.*;
public class Cinema {
    public static String[] seats;
    public static List< String > people;
    public static String[] combinations;
    public static boolean[] used;
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        people = Arrays.stream ( scanner.nextLine ( ).split ( ", " ) ).collect ( Collectors.toList ( ) );
        seats = new String[ people.size ( ) ];
        String input = scanner.nextLine ( );
        while ( !input.equals ( "generate" ) ) {
            String[] tokens = input.split ( " - " );
            String name = tokens[ 0 ];
            int place = Integer.parseInt ( tokens[ 1 ] ) - 1;
            seats[ place ] = name;
            people.remove ( name );
            input = scanner.nextLine ( );
        }
        combinations = new String[ people.size ( ) ];
        used = new boolean[ people.size ( ) ];
        permute ( 0 );
    }
    private static void permute ( int index ) {
        if ( index == combinations.length ) {
            print ( );
        } else {
            for ( int i = 0 ; i < people.size ( ) ; i++ ) {
                if ( !used[ i ] ) {
                    used[ i ] = true;

                    combinations[ index ] = people.get ( i );
                    permute ( index + 1 );
                    used[ i ] = false;
                }
            }
        }
    }
    private static void print () {
        String[] out = new String[ seats.length ];
        int index = 0;
        for ( int i = 0 ; i < seats.length ; i++ ) {
            if ( seats[ i ] != null ) {
                out[ i ] = seats[ i ];
            } else {
                out[ i ] = combinations[ index++ ];
            }
        }
        System.out.println ( String.join ( " " , out ) );
    }
}
