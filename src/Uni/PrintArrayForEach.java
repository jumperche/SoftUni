package Uni;

import java.util.Scanner;

public class PrintArrayForEach {
    public static void main( String args[])
    {
        Scanner scan = new Scanner (System.in);
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
        System.out.println("The array elements are : ");
        // For-each loop to print the string elements
        for( String i : arr)
        {
            System.out.println(i);
        }
    }
}
