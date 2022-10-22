package SoftuniFundamentals;
//Write a program to read a sequence of integers and find and print the top 5 numbers greater than the average value in the sequence, sorted in descending order.
//Input
//•	Read from the console a single line holding space-separated integers.
//Output
//•	Print the above-described numbers on a single line, space-separated.
//•	If less than 5 numbers hold the property mentioned above, print less than 5 numbers.
//•	Print "No" if no numbers hold the above property.
//Constraints
//•	All input numbers are integers in the range [-1 000 000 … 1 000 000].
//•	The count of numbers is in the range [1…10 000].

//5 2 3 4 -10 30 40 50 20 50 60 60 51
import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );
        List< Integer > list = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map ( value -> Integer.parseInt ( value ) )
                .collect ( Collectors.toList ( ) );
        double sum=0;
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {
            sum=sum+ list.get ( i);
        }
        double average=sum/list.size();
        Collections.sort ( list );
        List output=new ArrayList ();
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {
            if (list.get(i)>average){
                output.add(list.get(i));
            }
        }
        Collections.reverse (output);
        if (!output.isEmpty ()) {
            for ( int i = 0 ; i < output.size ( ) ; i++ ) {
                if ( i > 4 ) {
                    break;
                }

                System.out.printf ( " %d" , output.get ( i ) );
            }
        }else {
            System.out.println ("No" );
        }

    }
}
