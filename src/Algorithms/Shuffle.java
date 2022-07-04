package Algorithms;

import java.util.*;
import java.util.concurrent.*;

public class Shuffle {
    public static int[] count;

    public static void main ( String[] args ) {
        int[] arr = { 13 , 15 , 12 , 24 , 59 };

        Arrays.sort ( arr );
        //sort ( arr );
        int[] random = getAsRand ( arr );
        for ( int rand:random               ) {
            System.out.print (rand +" " );
        }
    }

    public static int[] getAsRand ( int[] array ) {
        int[] result = new int[ array.length ];
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current ( );
        for ( int i = 0 ; i < array.length ; i++ ) {
            result[ i ] = array[ threadLocalRandom.nextInt ( array.length  ) ];
        }
        return result;
    }

    public static void sort ( int[] arr ) {
        for ( int i = 0 ; i < arr.length ; i++ ) {
            count[ arr[ i ] ]++;
        }
    }

    public static void swap ( int[] array , int first , int second ) {
        int temp = array[ first ];
        array[ first ] = array[ second ];
        array[ second ] = temp;
    }

}
