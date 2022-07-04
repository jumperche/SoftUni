package softUni;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayReverseOfStrings {

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        // Asking the user for array size
        System.out.println("Enter the array size : ");
        int size = scan.nextInt();
        // Creating the array
        String arr[] = new String[size];
        System.out.println("Enter the array elements : ");
        // Takes the string as input from the user
        for(int i = 0;i<size;i++)
        {
            arr[i] = scan.next();
        }
        Arrays.sort(arr, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        System.out.println("The array elements are : ");
        // Array elements printed using Stream API
        Arrays.stream(arr).forEach(System.out::println);
    }
}
