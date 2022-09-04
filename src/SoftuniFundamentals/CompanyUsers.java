package SoftuniFundamentals;

import java.util.*;

public class CompanyUsers {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input = scanner.nextLine ( );
        Map< String, List< String > > map = new LinkedHashMap<> ( );
        while ( !input.equals ( "End" ) ) {

            String[] in = input.split ( " -> " );

            if ( !map.containsKey ( in[ 0 ] ) ) {
                map.put ( in[ 0 ] , new ArrayList<> ( ) );
                map.get ( in[ 0 ] ).add ( in[ 1 ] );
            } else {
                List< String > players = map.get ( in[ 0 ] );
                if ( !players.contains ( in[ 1 ] ) ) {
                    map.get ( in[ 0 ] ).add ( in[ 1 ] );
                }
            }
            input = scanner.nextLine ( );
        }
            map.entrySet ( ).stream ( )
                    .forEach ( entry -> {
                        System.out.printf ( "%s%n" , entry.getKey ( )  );
                        entry.getValue ( ).forEach ( player -> System.out.println ( "-- " + player ) );
                    } );
    }
}
