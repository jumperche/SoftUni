package SoftuniFundamentals;
//Write a program that takes a text and a string of banned words. All words included in the ban list should be replaced with asterisks "*", equal to the word's length. The entries in the ban list will be separated by a comma and space ", ".
//The ban list should be entered on the first input line and the text on the second input line.
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TextFilter {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< String > input = (List< String >) Arrays.stream ( scanner.nextLine ( ).split ( ", " ) ).collect ( Collectors.toList ( ) );
        String text = scanner.nextLine ( );
        //String input = scanner.nextLine ( );
        StringBuilder result = new StringBuilder ( text );

        StringBuilder star = new StringBuilder ( );
        for ( int i = 0 ; i < input.size ( ) ; i++ ) {
            star = new StringBuilder ( );
            for ( int j = 0 ; j < input.get ( i ).length ( ) ; j++ ) {
                star.append ( "*" );
            }

            String helper = String.valueOf ( star );
            String help=input.get ( i);
            while ( result.indexOf ( help )!=-1 ) {
                int index = result.indexOf ( help );
                result.replace ( index , index + help.length (), helper );
            }

        }

        System.out.println ( result );
    }
}
