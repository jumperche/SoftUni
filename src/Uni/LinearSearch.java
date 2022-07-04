package Uni;

import java.util.Scanner;

public class LinearSearch {
    public static int search ( int a[] , int search ) {
        int i = 0;
        boolean found = false;
        for ( i = 0; i < a.length ; i++ ) {
            if ( a[ i ] == search ) {
                found = true;
                break;
            }
        }
        if ( found )
            return i;
        else
            return -1;
    }

    public static void main ( String[] args ) {
        int array[] = { 10 , 40 , 432 , 543 , 54 , 432 , 32 , 65 , 76 , 234 };
        boolean found = false;
        Scanner scanner = new Scanner ( System.in );
        java.lang.String input = "";
        System.out.println ( "Enter value to search:" );
        input = scanner.nextLine ( );
        int searchval = Integer.parseInt ( input );
        for ( int i = 0 ; i < array.length ; i++ ) {
            if ( array[ i ] == searchval ) {
                found = true;
                System.out.println ( "index:" + i + " val:" + array[ i ] );
            }
        }
        if ( !found ) {
            System.out.println ( "Element not found." );
        }

        int result = search ( array , searchval );
        if ( result != -1 )
            System.out.println ( "index:" + result + " val:" + array[ result ] );
        else
            System.out.println ( "Element not found" );
    }
}
