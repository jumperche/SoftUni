package SoftuniFundamentals;

import java.util.*;
//You will be given a count of wagons in a train n. On the next n lines,
// you will receive how many people are going to get on that wagon.
// At the end print the whole train and after that the sum of the people
// on the train.
public class Train {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        int[]number=new int[n];
        int sum=0;
        for ( int i = 0 ; i < n ; i++ ) {
            number[i]=Integer.parseInt ( scanner.nextLine () );
            sum=sum+number[i];

        }
        for ( int i = 0 ; i < n ; i++ ) {
            System.out.printf ( number[i]+" " );
        }
        System.out.println ( );
        System.out.println (sum );
    }
}
