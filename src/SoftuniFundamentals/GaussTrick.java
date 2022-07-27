package SoftuniFundamentals;

import java.text.*;
import java.util.*;
import java.util.stream.*;

//Write a program that sum all numbers in a list in the following order:
//first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n.
public class GaussTrick {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List<Integer>list=Arrays.stream(scanner.nextLine ().split ( " " )).map ( value->Integer.parseInt (value  ) )
                .collect( Collectors.toList());
        int x= list.size ( )-1;
        for ( int i = 0 ; i <= list.size ( ) / 2 ; i++ ) {
            list.set ( i,( list.get ( i)+ list.get ( x) ));
            list.remove ( list.size ()-1 );
            x= list.size ( )-1;
        }
        printList ( list );
    }
    public static void printList(List<Integer> list){
        String output="";
        for ( Integer item:list
        ) {

            output=output+new DecimalFormat ("0.#").format ( item) +" ";

        }
        System.out.println (output );
    }
}
