package SoftuniFundamentals;

import java.text.*;
import java.util.*;
import java.util.stream.*;

//Write a program to sum all adjacent equal numbers in a list of decimal numbers, starting from left to right.
//	After two numbers are summed, the obtained result could be equal to some of its neighbors and should be summed as well (see the examples below).
//	Always sum the leftmost two equal neighbors (if several couples of equal neighbors are available).
public class SumAdjacentEqualNumbers {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
       List<Double>list=Arrays.stream(scanner.nextLine ().split ( " " )).map ( value->Double.parseDouble (value  ) )
               .collect( Collectors.toList());
        for ( int i = 0 ; i < list.size ( )-1 ; i++ ) {
           double first=list.get ( i );
           double sec=list.get ( i +1);
           if ( first== sec){
               list.set(i,(list.get ( i )+ list.get ( i+1)));
               list.remove ( i+1 );
i=-1;
           }
        }
        printList ( list );

    }
    public static void printList(List<Double> list){
        String output="";
        for ( Double item:list
        ) {

            output=output+new DecimalFormat("0.#").format ( item) +" ";

        }
        System.out.println (output );
    }
}
