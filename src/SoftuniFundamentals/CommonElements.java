package SoftuniFundamentals;
//Write a program, which prints common elements in two arrays.
// You have to compare the elements of the second array to the elements
// of the first.
import java.util.*;

public class CommonElements {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String[] input = scanner.nextLine ( ).split ( " " );
        String[] input1 = scanner.nextLine ( ).split ( " " );
        for ( int i = 0 ; i < input.length ; i++ ) {
            for ( int j = 0 ; j < input1.length ; j++ ) {


                if ( input[ i ].equals ( input1[ j ] )) {
                    System.out.print ( input[ i ] + " " );
                }
            }
        }
    }
}
