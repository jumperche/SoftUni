package SoftuniFundamentals;

import java.util.*;

public class TrithPr {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );
        String[] in = scanner.nextLine ( ).split ( "\\|" );
        Map< String, List< String > > words = new HashMap ( );
        for ( int i = 0 ; i < in.length ; i++ ) {


            String word = in[ i ].split ( ": " )[ 0 ].trim ();
            String def = in[ i ].split ( ": " )[ 1 ];
            if ( !words.containsKey ( word ) ) {
                words.put ( word , new ArrayList< String > ( ) );
                words.get ( word ).add ( def );
            } else {
                words.get ( word ).add ( def );
            }
        }
String ab=scanner.nextLine ();
        String[] input = ab.split ( "\\|" );
        for ( int i = 0 ; i < input.length ; i++ ) {
            String helper=input[i].trim ();


            words.entrySet ().stream().filter(e->e.getKey().equals(helper))
                    .forEach(e -> {
                        System.out.println ( helper+":" );
                        e.getValue ().forEach ( a-> System.out.println(" -"+a));

                    });
        }

    }
}
