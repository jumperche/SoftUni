package SoftuniFundamentals;
//Write a program that determines if an element exists in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, their sum is considered to be 0. Print the index that satisfies the required condition or "no" if there is no such index.
import java.util.*;

public class EqualsSum {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        int[]arr=Arrays.stream ( scanner.nextLine ().split ( " " ) ).mapToInt ( value -> Integer.parseInt ( value ) ).toArray ();
        int counter=0;
        for ( int i = 0 ; i < arr.length ; i++ ) {
            int sumLeft = 0;
            int sumRigth = 0;



                for ( int left = 0 ; left < i ; left++ ) {
                    sumLeft += arr[ left ];
                }
                for ( int rigth = i + 1 ; rigth < arr.length ; rigth++ ) {
                    sumRigth += arr[ rigth ];
                }
                if ( sumLeft == sumRigth ) {
                    counter = i;
                    System.out.println (counter );
                    return;
                }


        }

            System.out.println ("no" );

    }



}
