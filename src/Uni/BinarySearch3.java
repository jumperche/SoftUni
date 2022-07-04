package Uni;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch3 {
    public static int binarySearchIteratively(int[] sortedArray, int key) {
        int low = 0;
        int high = sortedArray.length - 1;
        int index = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void main( String[] args) {
        int array[] = { 10, 40, 432, 543, 54, 432, 32, 65, 76, 234 };
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        Scanner scan = new Scanner (System.in);
        int search = Integer.parseInt(scan.nextLine());
        int index = binarySearchIteratively(array, search);
        if (index != -1)
            System.out.println("Found: " + array[index] + " at " + index);
        else
            System.out.println("Not found.");
    }
}
