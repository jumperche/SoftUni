package SoftuniFundamentals;

import java.util.*;
import java.util.stream.*;

//Read a list of integers, remove all negative numbers from it and print the remaining elements in reversed order. In case of no elements left in the list, print "empty".
public class RemoveNegativesAndReverse {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< Integer > list = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map ( value -> Integer.parseInt ( value ) )
                .collect ( Collectors.toList ( ) );
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {
            if (list.get ( i )<0){
                list.remove ( i );
                i=i-1;
            }
        }
        if (list.size ()!=0) {


            Collections.reverse ( list );
            System.out.println ( list.toString ( ).replaceAll ( "[\\[\\],]" , "" ) );
        }
        else {
            System.out.println ("empty" );
        }
    }
}
