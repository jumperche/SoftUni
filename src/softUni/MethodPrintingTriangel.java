package softUni;

import java.util.Scanner;

public class MethodPrintingTriangel {

    static void printLine ( int start , int end ) {
        for ( int i = start ; i <= end ; i++ ) {
            System.out.print ( i + " " );
        }
        System.out.println ( );
    }






    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        for ( int i = 0 ; i < n ; i++ ) {
            printLine(1,i);
        }
        printLine ( 1,n );
        for ( int i = n-1 ; i >0  ; i-- ) {
            printLine ( 1,i );
        }
    }
}
