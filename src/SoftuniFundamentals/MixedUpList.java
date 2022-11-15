package SoftuniFundamentals;
//Write a program that mixes up two lists by some rules. You will receive two lines of input, each one being a list of numbers. The mixing rules are:
//•	Start from the beginning of the first list and the ending of the second.
//•	Add element from the first and element from the second.
//•	In the end, there will always be a list in which there are 2 elements remaining.
//•	These elements will be the range of the elements you need to print.
//•	Loop through the result list and take only the elements that fulfill the condition.
//•	Print the elements ordered in ascending order and separated by a space.

//1 5 23 64 2 3 34 54 12
//43 23 12 31 54 51 92
import java.util.*;
import java.util.stream.Collectors;

public class MixedUpList {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< Integer > list1 = Arrays
                .stream ( scanner.nextLine ( ).split ( "\\s+" ) )
                .map ( Integer::parseInt )
                .collect ( Collectors.toList ( ) );
        List< Integer > list2 = Arrays
                .stream ( scanner.nextLine ( ).split ( "\\s+" ) )
                .map ( Integer::parseInt )
                .collect ( Collectors.toList ( ) );
        List< Integer > out = new ArrayList< Integer > ( );
        int number1 = 0;
        int number2 = 0;

        if ( list1.size ( ) > list2.size ( ) ) {
            number1 = list1.get ( list1.size ( ) - 1 );
            number2 = list1.get ( list1.size ( ) - 2 );
            for ( int i = 0 ; i < list1.size ( ) ; i++ ) {
                out.add ( list1.get ( i ) );
            }
            int index = 1;
            for ( int i = list2.size ( ) - 1 ; i >= 0 ; i-- ) {
                out.add ( index , list2.get ( i ) );
                index = index + 2;
            }
        } else {
            number1 = list2.get ( 0 );
            number2 = list2.get ( 1 );
            for ( int i = 0 ; i < list2.size ( ) ; i++ ) {
                out.add ( list2.get ( i ) );
            }
            int index = 1;
            for ( int i = list1.size ( ) - 1 ; i >= 0 ; i-- ) {
                out.add ( index , list1.get ( i ) );
                index = index + 2;
            }
        }
        Collections.sort ( out );
        for ( int i = 0 ; i < out.size ( ) ; i++ ) {
            if ( number1 > number2 ) {
                if ( out.get ( i ) > number2 & out.get ( i ) < number1 ) {

                    System.out.printf ( " %s" , out.get ( i ) );
                }
            } else {
                if ( out.get ( i ) < number2 & out.get ( i ) > number1 ) {

                    System.out.printf ( " %s" , out.get ( i ) );
                }
            }
        }
    }
}

