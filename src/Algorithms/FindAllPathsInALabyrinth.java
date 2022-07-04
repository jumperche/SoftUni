package Algorithms;

import java.util.*;
import java.util.concurrent.atomic.*;


public class FindAllPathsInALabyrinth {

    public static char[][] matrix;
    public static List< int[] > area = new ArrayList<> ( );

    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );
        int rows = Integer.parseInt ( scanner.nextLine ( ) );
        int cols = Integer.parseInt ( scanner.nextLine ( ) );
        matrix = new char[ rows ][ cols ];
        for ( int row = 0 ; row < rows ; row++ ) {
            matrix[ row ] = scanner.nextLine ( ).toCharArray ( );
        }

        for ( int row = 0 ; row < matrix.length ; row++ ) {
            for ( int col = 0 ; col < matrix[ row ].length ; col++ ) {
                if ( matrix[ row ][ col ] == '-' ) {
                    area.add ( new int[]{ row , col , 0} );
                    findArea ( row , col );
                }
            }
        }
        System.out.println ( "Total areas found: " + area.size ( ) );
        AtomicInteger counter = new AtomicInteger ( 1 );
        area.stream ( ).sorted ( ( f , s ) -> Integer.compare ( s[ 2 ] , f[ 2 ] ) ).forEach ( a -> {
            System.out.println ( "Area #" + counter.getAndIncrement ( ) + " at(" + a[ 0 ] + ", " + a[ 1 ] + "), size: " + a[ 2 ] );
        } );
    }

    private static void findArea ( int row , int col ) {
        if ( isInBounds ( row , col ) || isNotTraversal ( row , col ) ) {
            return;
        }
        matrix[ row ][ col ] = 'V';
        area.get ( area.size ( ) - 1 )[ 2 ]++;
        findArea ( row , col + 1 );
        findArea ( row + 1 , col );
        findArea ( row - 1 , col );
        findArea ( row , col - 1 );

    }

    private static boolean isNotTraversal ( int row , int col ) {
        return matrix[ row ][ col ] == 'V' || matrix[ row ][ col ] == '*';
    }


    private static boolean isInBounds ( int row , int col ) {
        return row>= matrix.length
                && row < 0
                && col >= matrix[ row ].length
                && col < 0;

    }
}
