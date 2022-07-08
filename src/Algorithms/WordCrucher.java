package Algorithms;

import java.util.*;
import java.util.stream.*;

public class WordCrucher {
    public static List< String > combined = new ArrayList<> ( );
    public static List< String > words;
    public static String target;
    public static boolean[] used;
    public static Map< Integer, List< String > > table;
    public static Map< String, Integer > ocurrances = new HashMap<> ( );
    public static Set<String> out=new TreeSet<> (  );

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        words = Arrays.stream ( scanner.nextLine ( ).split ( ", " ) ).collect ( Collectors.toList ( ) );
        target = scanner.nextLine ( );
        words.removeIf ( next -> !target.contains ( next ) );
        table = new HashMap<> ( );
        for ( String substr : words
        ) {
            ocurrances.putIfAbsent ( substr , 0 );
            ocurrances.put ( substr , ocurrances.get ( substr ) + 1 );
            int index = target.indexOf ( substr );
            while ( index != -1 ) {
                table.putIfAbsent ( index , new ArrayList<> ( ) );
                table.get ( index ).add ( substr );
                index = target.indexOf ( substr , index + 1 );
            }
        }
        //combined = new String[ words.size ( ) ];
        used = new boolean[ words.size ( ) ];
        permute ( 0 );
        for ( String str:out
               ) {
            System.out.println (str );
        }
    }

    private static void permute ( int index ) {
        if ( index == target.length ( ) ) {
            print ( );
        } else if ( table.containsKey ( index ) ) {
            List< String > strings = table.get ( index );
            for ( int i = 0 ; i < strings.size ( ) ; i++ ) {
                String str = strings.get ( i );
                if ( ocurrances.get ( str  )>0) {
                    ocurrances.put ( str , ocurrances.get ( str ) - 1 );


                    combined.add ( str );
                    permute ( index + str.length ( ) );
                    combined.remove ( combined.size ( ) - 1 );
                    ocurrances.put ( str , ocurrances.get ( str ) + 1 );
                }
            }
        }
    }


    private static void print () {
        String actual = String.join ( "" , combined );
        if ( actual.contains ( target ) ) {
            out.add ( String.join ( " ",combined ));
        }
    }
}
