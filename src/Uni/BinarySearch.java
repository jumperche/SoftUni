package Uni;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main( String[] args) {
        int array[] = { 10, 40, 432, 543, 54, 32, 65, 76, 234 };
        Scanner scanner = new Scanner(System.in);
        java.lang.String input = "";
        System.out.println("Enter value to search in the array:");
        input = scanner.nextLine();
        //Сортирането трябва да се извърши преди двоичното търсене.
        Arrays.sort(array);
        int result = Arrays.binarySearch(array, Integer.parseInt(input));
        /*
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();*/
        if (result >= 0) {
            System.out.println(result + " " + array[result]);
        }
        else
            System.out.println("Value not found.");
    }
}
