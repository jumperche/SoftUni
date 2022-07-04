package Uni;

import java.util.Scanner;

public class Array2Dim {
    public static void main ( String[] args ) {
        // Declare and initialize a matrix of size 2 x 4
       // int[][] matrix = {
       //         { 1, 2, 3, 4 }, // row 0 values
        //        { 5, 6, 7, 8 }, // row 1 values
       // };
        Scanner input = new Scanner(System.in);
        int count=1;
        int rows = input.nextInt();
        int cols = input.nextInt();
        int[][] matrix = new int[rows][cols];
// Print the matrix on the console
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col]=count;
                count++;
                System.out.printf("%d ", matrix[row][col]);
            }
            System.out.println();
        }
    }
}
