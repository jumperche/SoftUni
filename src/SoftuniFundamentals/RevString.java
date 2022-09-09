package SoftuniFundamentals;
//You will be given a series of strings until you receive an "end" command. Write a program that reverses strings and prints each pair on a separate line in the format "{word} = {reversed word}".
import java.util.*;

public class RevString {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String name = scanner.nextLine ( );
        while ( !name.equals ( "end" ) ) {
            System.out.print ( name + " = " );
            for ( int i = name.length ( ) - 1 ; i >= 0 ; i-- ) {
                System.out.print ( name.charAt ( i ) );
            }
            System.out.println ( );
            name = scanner.nextLine ( );
        }

    }
}
