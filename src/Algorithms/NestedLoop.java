package Algorithms;

import java.io.*;
import java.util.*;



public class NestedLoop {
    public static StringBuilder out=new StringBuilder ();
    public static int[] elements;
    public static int n;
    public static void main ( String[] args ) throws IOException {
        //Scanner scanner = new Scanner ( System.in );
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );

        n = Integer.parseInt (reader.readLine () );
elements=new int[n];

        loops ( 0);
    }

    private static void loops ( int index ) {
        if ( index == elements.length ) {
            printArr ( );
        } else {
            for ( int i = 1 ; i <= n ; i++ ) {
                elements[ index ] = i;
                loops ( index + 1 );
            }
        }
    }
public static void printArr(){
    for ( int i = 0 ; i < elements.length ; i++ ) {
        //out.append ( elements[i] ).append ( System.lineSeparator () );
        System.out.print (elements[i]+" " );
    }
    System.out.println ( );
    }

}
