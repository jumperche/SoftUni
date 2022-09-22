package SoftuniFundamentals;
//Write a program that keeps track of the guests that are going to a house party.
//On the first input line, you are going to receive how many commands you are going to have. On the next lines you are going to receive some of the following inputs:
//•	"{name} is going!"
//•	"{name} is not going!"
//If you receive the first type of input, you have to add the person if he/she is not on the list. (If he/she is in the list print on the console: "{name} is already in the list!"). If you receive the second type of input, you have to remove the person if he/she is on the list. (If not print: "{name} is not in the list!"). At the end print all guests.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int commands = Integer.parseInt ( scanner.nextLine ( ) );
        List< String > list = new ArrayList<> ( );
        for ( int i = 0 ; i < commands ; i++ ) {
            List< String > input = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map ( value -> value )
                    .collect ( Collectors.toList ( ) );
            String help = input.get ( 0 );
            if ( input.get ( 2 ).equals ( "not" ) ) {
                Predicate< String > filter = n -> ( n.equals ( help ) );
                boolean isNot = list.removeIf ( filter );
                if ( !isNot ) {
                    System.out.printf ( "%s is not in the list!%n" , help );
                }
            } else {
                boolean is = true;
                for ( int j = 0 ; j < list.size ( ) ; j++ ) {
                    String h = list.get ( j );
                    if ( h.equals ( help ) ) {
                        is = false;
                        break;
                    }
                }
                if ( is == false ) {
                    System.out.printf ( "%s is already in the list!%n" , help );
                } else {
                    list.add ( help );
                }

            }
        }
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {
            System.out.println ( list.get ( i ) + " " );
        }

    }
}

