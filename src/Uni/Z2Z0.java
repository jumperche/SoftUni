package Uni;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Z2Z0 {
    public static void main ( String[] args ) {
        Integer[] x={23,35,2,43,12};
        System.out.println ("Array is:  "+ Arrays.toString ( x ) );
        List<Integer> lx=Arrays.asList ( x );
        Collections.shuffle ( lx );

        System.out.println ("Shuffled array is: "+lx.toString () );
        Arrays.sort ( x );
        System.out.println ("Sorted array is: "+Arrays.toString ( x ) );
    }
}
