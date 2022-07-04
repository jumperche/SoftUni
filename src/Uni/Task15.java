package Uni;

import java.util.Arrays;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int array[] = { 10, 20, 30, 40, 50, 60, 70 };
        int newArray[] = new int[array.length - 1];
        Scanner scan = new Scanner(System.in);
        System.out.println("Array:");
        System.out.println( Arrays.toString(array));
        System.out.println("Enter element to remove:");
        int elementToRemove = scan.nextInt();
        int index = 0;
        boolean foundElement = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToRemove) {
                foundElement = true;
                index = i;
                break;
            }
        }
        if (foundElement) {
            for (int i = 0; i < newArray.length; i++) {
                if (i == index) {
                    for (int j = index; j < newArray.length; j++) {
                        newArray[j] = array[j+1];
                    }
                    break;
                }
                else {
                    newArray[i] = array[i];
                }
            }
            System.out.println(Arrays.toString(newArray));
        }
        else {
            System.out.println("No such element found in the array.");
        }
    }
}
