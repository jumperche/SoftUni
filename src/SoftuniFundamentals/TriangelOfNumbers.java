package SoftuniFundamentals;
//Write a program that receives a number – n and prints a triangle from 1 to n as in the examples.
import java.util.*;

public class TriangelOfNumbers {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        for ( int i = 1 ; i <=n  ; i++ ) {
            for ( int j = 1 ; j <=i  ; j++ ) {
                System.out.print (i+" " );
            }
            System.out.println ( );
        }
    }
}
