package Algorithms;

import java.io.*;
import java.util.*;

public class CombinationWithRepetition {
public static  int count=0;
    public static int[] elements;
    public static int n,k;
    public static void main ( String[] args ) throws IOException {
        Scanner scanner = new Scanner ( System.in );
        n = Integer.parseInt ( scanner.nextLine ( ) );
        k = Integer.parseInt ( scanner.nextLine ( ) );

        elements=new int[k];

        loops ( 0,1);
    }

    private static void loops ( int index,int start ) {
        if ( index == elements.length ) {
            printArr ( );
        } else {
            for ( int i = start ; i <= n ; i++ ) {
                elements[ index ] = i;
                loops ( index + 1,i );
            }
        }
    }
    public static void printArr(){

        for ( int i = 0 ; i < elements.length ; i++ ) {

            System.out.print (elements[i]+" " );
            count++;
        }
        System.out.println ( );
        System.out.println (count );
    }

}
