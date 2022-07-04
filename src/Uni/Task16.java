package Uni;

import java.util.Arrays;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int array[] = { 10, 20, 30, 40, 50, 60, 70 };
        int newArray[] = new int[array.length + 1];
        Scanner scan = new Scanner(System.in);
        System.out.println("Array:");
        System.out.println( Arrays.toString(array));
        System.out.println("Add integer element:");
        int elementToAdd = scan.nextInt();
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = elementToAdd;
        System.out.print(Arrays.toString(newArray));
    }
}
