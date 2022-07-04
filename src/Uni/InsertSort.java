package Uni;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class InsertSort {


/*
https://www.geeksforgeeks.org/what-is-the-difference-between-i-and-i-in-java/
 */
/*
Insertion sort
 */


        /*Function to sort array using insertion sort*/
        public static void sort(int arr[]) {
            int n = arr.length;
            for ( int i = 1 ; i < n ; ++i ) {
                int key = arr[ i ];
                int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
                while ( j >= 0 && arr[ j ] > key ) {
                    arr[ j + 1 ] = arr[ j ];
                    j = j - 1;
                }
                arr[ j + 1 ] = key;
            }
        }

        public static void main ( String[]args){
            int array[] = { 10 , 40 , 432 , 543 , 54 , 432 , 32 , 65 , 76 , 234 };
            System.out.println ( Arrays.toString ( array ) );
            sort ( array );
            System.out.println ( Arrays.toString ( array ) );
        }
    }


