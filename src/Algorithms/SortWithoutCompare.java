package Algorithms;

import java.util.*;

public class SortWithoutCompare {
    public static int[] count;

    public static void main ( String[] args ) {
        int[] arr = { 13 , 5 , 2 , 2 , 5 };
        Integer max = Collections.max ( Arrays.asList ( 13 , 5 , 2 , 2 , 5 ) );
        count = new int[ max + 1 ];
        sort ( arr );
        for ( int index = 0 ; index < count.length ; index++ ) {
            if ( count[ index ] != 0 ) {
                for ( int i = 0 ; i < count[ index ] ; i++ ) {
                    System.out.print ( index + " " );
                }
            }
        }
    }

    public static void sort ( int[] arr ) {
        for ( int i = 0 ; i < arr.length ; i++ ) {
            count[ arr[ i ] ]++;
        }

    }
}
