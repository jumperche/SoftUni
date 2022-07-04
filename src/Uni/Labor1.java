package Uni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Labor1 {
    public static void main ( String[] args ) {

        List< Double > temperature = new ArrayList< Double > ( );
        temperature.add ( 3.0 );
        temperature.add ( 3.00 );
        temperature.add ( 15.5 );
        temperature.add ( 26.0 );
        temperature.add ( 3.5 );
        temperature.add ( 26.0 );
        int number = temperature.size ( );
        double sum = 0;
        for ( int i = 0 ; i < number ; i++ ) {
            sum += temperature.get ( i );
        }

        Collections.sort ( temperature );
        System.out.println (temperature );
        System.out.println ( "smallest : " + temperature.get ( 0 ) );
        System.out.println ( "highest :" + temperature.get ( temperature.size ( ) - 1 ) );
        int size = temperature.size ( );
        for ( int i = 1 ; i < size - 1 ; i++ ) {
            System.out.println ( temperature.get ( i ) );
        }

    }
}

