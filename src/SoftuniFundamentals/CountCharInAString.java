package SoftuniFundamentals;
//Write a program, which counts all characters in a string except space (' ').
//Print all occurrences in the following format:
//"{char} -> {occurrences}"

import java.util.*;
import java.util.stream.Collectors;

public class CountCharInAString {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< String > input = (List< String >) Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).collect ( Collectors.toList ( ) );
        Map< Character, Integer > out = new LinkedHashMap<> ( );
        for ( int i = 0 ; i < input.size ( ) ; i++ ) {
            int one = input.get ( i ).length ( );
            for ( int j = 0 ; j < one ; j++ ) {


                String help = input.get ( i );
                char char0 = help.charAt ( j );
                out.putIfAbsent ( char0 , 0 );
                out.put ( char0 , out.get ( char0 ) + 1 );
            }
        }
        for ( Map.Entry< Character, Integer > entry : out.entrySet ( ) ) {
            System.out.printf ( "%s -> %d%n" , entry.getKey ( ) , entry.getValue ( ) );
        }

    }
}
