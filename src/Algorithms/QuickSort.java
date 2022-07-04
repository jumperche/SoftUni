package Algorithms;

import java.util.*;

public class QuickSort {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        // BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );

        int[]arr=Arrays.stream ( scanner.nextLine ().split ( "\\s+" ) )
                .mapToInt ( Integer::parseInt )
                .toArray ();
        sort(arr,0, arr.length -1);
        StringBuilder builder=new StringBuilder (  );
        for ( int number:arr        ) {
            builder.append (number).append (  " " );
        }
        System.out.println (builder.toString () );
    }

    private static void sort ( int[] arr,int low, int high ) {

        if (low<high  ) {
            int pi = partition ( arr , low , high );
            sort ( arr , low , pi - 1 );
            sort ( arr , pi + 1 , high );
        }
    }

    private static int partition ( int[] arr , int low , int high ) {
        int pivot=arr[high];
        int i=(low-1);
        for ( int j = low ; j <high  ; j++ ) {

            if ( arr[ j] <= pivot  ) {
                i++;
                int temp = arr[ i ];
                arr[ i ] = arr[ j ];
                arr[ j ] = temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }


}
