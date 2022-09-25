package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int[] n =  Arrays.stream (  scanner.nextLine ( ).split ( " " ) ).mapToInt ( e->Integer.parseInt ( e ) ).toArray ();
        int index=0;
        int sum=findSum ( n,index );
        System.out.println (sum );
    }
    public static int findSum( int[] arr, int index){
        if (index>=arr.length){
            return 0;
        }

        return arr[ index ]+findSum ( arr,index+1 );
    }
}
