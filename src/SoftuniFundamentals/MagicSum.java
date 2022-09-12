package SoftuniFundamentals;
//Write a program that prints all unique pairs in an array of integers whose sum is equal to a given number.
import java.util.*;

public class MagicSum {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        int[] number=Arrays.stream ( scanner.nextLine ().split ( " " ) ).mapToInt ( value -> Integer.parseInt ( value ) ).toArray ();
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        for ( int i = 0 ; i < number.length-1; i++ ) {
            for ( int j = i+1 ; j < number.length ; j++ ) {


                if ( number[ i ] + number[ j ] == n ) {
                    System.out.println ( number[ i ] + " " + number[ j] );
                }
            }
            }

    }
}
