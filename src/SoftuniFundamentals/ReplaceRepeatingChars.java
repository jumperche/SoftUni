package SoftuniFundamentals;
//Write a program that reads a string from the console and replaces any sequence of the same letters with a single corresponding letter.
import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        StringBuilder input = new StringBuilder ( scanner.nextLine ( ) );
        StringBuilder out = new StringBuilder ( );
        char start = input.charAt ( 0 );
        out.append ( start );
        for ( int i = 1 ; i < input.length ( ) ; i++ ) {
            char next = input.charAt ( i );
            if ( start != next ) {
                start = next;
                out.append ( start );
            }
        }

        System.out.println ( out );
    }
}
