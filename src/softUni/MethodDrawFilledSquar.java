package softUni;

import java.util.Scanner;

public class MethodDrawFilledSquar{

    static void printHeaderFooter(int n){
        System.out.println (new String (new char[2*n]) .replace("\0","-"));
    }


static void printBody(int n){
    System.out.print( "-");
    for ( int i = 0 ; i < n-1 ; i++ ) {
        System.out.print ("\\/" );
    }
    System.out.println ("-" );
}


    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
printHeaderFooter ( n );
        for ( int i = 0 ; i < n-2 ; i++ ) {
            printBody ( n );
        }


printHeaderFooter ( n );
    }

}
