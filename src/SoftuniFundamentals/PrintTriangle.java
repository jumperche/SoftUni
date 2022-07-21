package SoftuniFundamentals;
//Create a method for printing triangles
import java.util.*;

public class PrintTriangle {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        printTriangle ( n );
    }
    public static void printTriangle(int n){
        for ( int i = 1 ; i <= n ; i++ ) {
            printLine ( i );
        }
        for ( int i = n-1 ; i >=1  ; i-- ) {
            printLine ( i );
        }
    }
    public static void printLine(int number){
        for ( int i = 1 ; i <=number  ; i++ ) {
            System.out.print (i +" ");
        }
        System.out.println ( );
    }
}
