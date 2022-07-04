package Algorithms;

import java.io.*;

public class PrintReverseArray {
    public static String[] elements;

    public static void main ( String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );

        elements = reader.readLine ( ).split ( "\\s+" );


        reverse ( elements , elements.length - 1 );
    }

    public static void reverse ( String[] elements , int index ) {
        if ( index < 0 ) {
            return;
        }
        System.out.print ( elements[ index ] + " " );
        reverse ( elements , index - 1 );

    }
}

