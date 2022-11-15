package SoftuniFundamentals;
//Write a program to append several arrays of numbers.
//	Arrays are separated by "|".
//	Values are separated by spaces (" ", one or several).
//	Order the arrays from the last to the first and their values from left to right.


//1 2 3 |4 5 6 |  7  8
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendArrays {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String[] input = scanner.nextLine ( ).split ( "\\|" );
        List< Integer > list = new ArrayList<> ( );
        for ( int i = 0 ; i < input.length ; i++ ) {

            String x = input[ i ].trim ( );
            String[] Input = x.split ( "\\s+" );

            for ( int j = Input.length - 1 ; j >= 0 ; j-- ) {

                list.add ( 0 , Integer.parseInt ( Input[ j ] ) );
            }
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}
