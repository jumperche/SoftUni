package Uni;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Z2Z6 {
    public static void main ( String[] args ) {

        Scanner scan = new Scanner ( System.in );
        int n = 0;


        int i=0;

        do {
            System.out.print ( "N: " );
            n = scan.nextInt ( );
        }
        while ( n > 100 );
        Integer[] numbers=new Integer[n];
        for ( i = 0; i < n; i++ ) {
            int x = scan.nextInt ( );
            numbers[i] = x;


        }
        Arrays.sort(numbers, Collections.reverseOrder());
        for ( int j = 0; j < numbers.length; j++ ) {


            System.out.print ( numbers[j] + " " );
        }
    }
}
