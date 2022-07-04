package Uni;

import java.util.Arrays;
import java.util.Collections;

public class SubarraySort {
    public static void main( String[] args)
    {
        // Custom input array
        // It contains 8 elements as follows
        Integer [] arr = { 13, 7, 6, 45, 21, 9, 2, 100 ,13};

        // Sort subarray from index 1 to 4, i.e.,
        // only sort subarray {7, 6, 45, 21} and
        // keep other elements as it is.
        Arrays.sort(arr, 0, arr.length);

        // Sorts arr[] in descending order using
        // reverseOrder() method of Collections class
        // in Array.sort() as an argument to it
        Arrays.sort(arr, Collections.reverseOrder());


        // Printing the updated array which is
        // sorted after 2 index inclusive till 5th index
        System.out.println("Modified arr[] : "+Arrays.toString(arr));
    }
}
