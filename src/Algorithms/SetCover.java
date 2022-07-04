package Algorithms;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class SetCover {
    public static void main ( String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        String[] elements = reader.readLine ( ).substring ( 10 ).split ( ", " );
        int[] universe = new int[ elements.length ];
        for ( int i = 0 ; i < elements.length ; i++ ) {
            universe[ i ] = Integer.parseInt ( elements[ i ] );
        }
        int numberOfSets = Integer.parseInt ( reader.readLine ( ).substring ( 16 ) );
        List< int[] > sets = new ArrayList<> ( );
        for ( int i = 0 ; i < numberOfSets ; i++ ) {
            String[] setElements = reader.readLine ( ).split ( ", " );
            int[] set = new int[ setElements.length ];
            for ( int j = 0 ; j < setElements.length ; j++ ) {
                set[ j ] = Integer.parseInt ( setElements[ j ] );
            }
            sets.add ( set );
        }
        List< int[] > chosenSets = chooseSets ( sets , universe );

        StringBuilder sb = new StringBuilder ( );
        sb.append ( String.format ( "Sets to take (%d):%n" , chosenSets.size ( ) ) );
        for ( int[] set : chosenSets ) {
            sb.append ( "{ " );
            sb.append ( Arrays.toString ( set ).replaceAll ( "\\[|]" , "" ) );
            sb.append ( " }" ).append ( System.lineSeparator ( ) );
        }
        System.out.println ( sb );
    }

    public static List< int[] > chooseSets ( List< int[] > sets , int[] universe ) {
        List< int[] > sortedSets = sets.stream ( ).sorted ( ( x1 , x2 ) -> x2.length - x1.length ).collect ( Collectors.toList ( ) );
        boolean[] flags = new boolean[ universe.length ];

        List< int[] > results = new ArrayList<> ( );
        for ( int[] set : sortedSets ) {
            results.add ( set );
//if (sortedSets==results){
            //sortedSets.remove ( sortedSets );
//}
            for ( int i = 0 ; i < set.length ; i++ ) {
                for ( int j = 0 ; j < universe.length ; j++ ) {
                    if ( set[ i ] == universe[ j ] ) {


                        flags[ j ] = true;

                        break;
                    }

                }

            }


            boolean allAreTrue = true;
            for ( int i = 0 ; i < flags.length ; i++ ) {
                if ( !flags[ i ] ) {
                    allAreTrue = false;

                    break;
                }
            }

            if ( allAreTrue ) {
                break;
            }

        }

        //results.stream().map(Arrays::toString).forEach(System.out::println);

        // TODO
        return results;
    }
}
