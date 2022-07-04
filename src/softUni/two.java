package softUni;

import java.util.Arrays;


public class two {
    public static void main ( String[] args ) {


        Integer[] array1 = { 7 , 3 , 1 , 8 , 4 , 1 , 9 , 5 , 1 };
        Integer[] array2 = new Integer[ array1.length ];
        Arrays.sort ( array1 );
        array2[ 0 ] = array1[ 0 ];
        for ( int i = 1; i < array1.length - i; i++ ) {
            if ( array1[ i ] == array2[ 0 ] ) {
                array2[ i ] = array1[ i ];
            } else {
                continue;
            }
        }
        for ( int j = 0; j < array2.length; j++ ) {
            System.out.print ( array2[ j ] + " " );
        }
    }
}

