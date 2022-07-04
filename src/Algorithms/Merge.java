package Algorithms;

import java.io.*;
import java.util.*;

public class Merge {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
       // BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );

        int[]arr=Arrays.stream ( scanner.nextLine ().split ( "\\s+" ) )
                .mapToInt ( Integer::parseInt )
                .toArray ();
        sort(arr);
        StringBuilder builder=new StringBuilder (  );
        for ( int number:arr        ) {
            builder.append (number).append (  " " );
        }
        System.out.println (builder.toString () );
    }


    public static void sort(int[]arr) {
       mergeSort(arr,0,arr.length-1);
    }

public static void mergeSort(int []arr,int start,int end){
        if (start>=end){
            return;
        }
        int mid=(start+end)/2;
        
        mergeSort ( arr,start,mid );
        mergeSort ( arr,mid+1,end );
        merge(arr,start,mid,end);
}

    private static void merge ( int[] arr , int start , int mid , int end ) {
        if ( mid < 0 || mid >= arr.length || arr[ mid ] < arr[ mid + 1 ] ) {
            return;
        }
        int left = start;
        int right = mid + 1;
        int[] helper = new int[ arr.length ];
        for ( int i = start ; i <= end ; i++ ) {
            helper[ i ] = arr[ i ];
        }
        for ( int i = start ; i <= end ; i++ ) {
            if ( left > mid ) {
                arr[ i ] = helper[ right++ ];
            } else if ( right > end ) {
                arr[ i ] = helper[ left++ ];
            } else if ( helper[ left ] < helper[ right ] ) {
                arr[ i ] = helper[ left++ ];
            } else {
                arr[ i ] = helper[ right++ ];
            }
        }
    }

    public static void swap(int[]arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[ second ];
        arr[second]=temp;
    }
}
