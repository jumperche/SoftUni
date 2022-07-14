package SoftuniFundamentals;

import java.util.*;

public class EqualsSum {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        int[]arr=Arrays.stream ( scanner.nextLine ().split ( " " ) ).mapToInt ( value -> Integer.parseInt ( value ) ).toArray ();
        int counter=0;
        for ( int i = 0 ; i < arr.length ; i++ ) {
            int sumLeft = 0;
            int sumRigth = 0;
            if ( arr.length > 1 ) {


                for ( int left = 0 ; left < i ; left++ ) {
                    sumLeft += arr[ left ];
                }
                for ( int rigth = i + 1 ; rigth < arr.length ; rigth++ ) {
                    sumRigth += arr[ rigth ];
                }
                if ( sumLeft == sumRigth ) {
                    counter = i;
                }
            }
            else {
                counter=9;
            }
        }
        if (counter==9){
            System.out.println ("0" );
        }
        else if (counter!=0){
            System.out.println (counter );
        }
        else {
            System.out.println ("no" );
        }



    }



}
