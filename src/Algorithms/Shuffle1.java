package Algorithms;
//дава винаги еднакви стойности, не работи
import java.util.*;
import java.util.concurrent.*;

public class Shuffle1 {
    public static int[] count;

    public static void main ( String[] args ) {
        int[] arr = { 13 , 15 , 12 , 24 , 59 };

        Arrays.sort ( arr );
        //sort ( arr );

        for ( int rand:arr               ) {
            System.out.print (rand+" " );
        }
    }

    public static void getAsRand ( int[] array ) {
        int[] result = new int[ array.length ];
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current ( );
        for ( int i = 0 ; i < array.length ; i++ ) {

            swap ( array,i,threadLocalRandom.nextInt ( array.length ));
            //result[ i ] = array[ threadLocalRandom.nextInt ( array.length - 1 ) ];
        }

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
