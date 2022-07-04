package Uni;

import java.util.Arrays;
import java.util.Scanner;

public class Z2Z10 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        Integer[] numbers = { 0,0,0,0,0};
        int num = 0;
        int numValues = 0;
        boolean valid = true;

//num=Integer.parseInt ( scanner.nextLine ( ) );
        //while ( num != numbers.length ) {

            for ( int i = 0 ; i < numbers.length ; i++ ) {
                System.out.println ( "enter value: " );
                num = Integer.parseInt ( scanner.nextLine ( ) );
                for ( int j = 0 ; j < numbers.length ; j++ ) {
                    if ( num != numbers[ j] ) {
                        numbers[ i] = num;
                        break;
                    }
                    else {
                        System.out.println ( "enter new value: " );
                        num = Integer.parseInt ( scanner.nextLine ( ) );
                    }
                }

                }


        System.out.println ("Sorted array is: "+ Arrays.toString ( numbers ) );
    }
}
