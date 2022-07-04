package Algorithms;

import java.util.*;

public class BubbleSort {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int []arr ={5,4,7,2,1};
        sort(arr);
        for ( int i:arr
        ) {
            System.out.print (i+" " );
        }
    }


    public static void sort(int[]arr) {
        for ( int i = 0 ; i < arr.length ; i++ ) {
            for ( int j = 0 ; j < arr.length-1 ; j++ ) {
              if (arr[i]<arr[j]){   //for > reverse
                  swap(arr,i,j);
              }
            }
        }
    }



    public static void swap(int[]arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[ second ];
        arr[second]=temp;
    }
}
