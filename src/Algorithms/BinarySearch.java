package Algorithms;

import java.util.*;

public class BinarySearch {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        int[]arr=Arrays.stream ( scanner.nextLine ().split ( "\\s+" ) )
                .mapToInt ( Integer::parseInt )
                .toArray ();
        Arrays.sort ( arr );
        int key=Integer.parseInt ( scanner.nextLine () );
        int a=indexOf(arr,key);
        System.out.println (a );
    }
    public static int indexOf(int[]arr,int key){
        int start=0;
        int end= arr.length-1;

        while ( start<=end ) {

            int mid=(start+end)/2;
            int current=arr[mid];
            if ( current > key ) {
                end = mid - 1;
            } else if ( current < key ) {
                start = mid + 1;
            }
            else return mid;
        }
        return -1;
    }

}
