package SoftuniFundamentals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam2 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );


        for ( int i = 0 ; i < n ; i++ ) {
            String input = scanner.nextLine ( );

            Pattern pattern = Pattern.compile ( "(\\|)([A-Z]{4,})\\1:(#)([A-Za-z]+\\s[A-Za-z]+)\\3" );
            Matcher matcher = pattern.matcher ( input );
            if ( matcher.find ( ) ) {
                String name = matcher.group ( 2 );
                String job = matcher.group ( 4 );
                System.out.println ( name + ", The " + job );
                System.out.println ( ">> Strength: " + name.length ( ) );
                System.out.println ( ">> Armor: " + job.length ( ) );
            } else {
                System.out.println ( "Access denied!" );
            }


        }
    }
}
