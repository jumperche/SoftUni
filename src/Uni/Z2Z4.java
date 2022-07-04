package Uni;

import java.util.Scanner;

public class Z2Z4 {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        double sum = 0;
        int count = 0;
        int[][] numbers = { { 1 , 2 , 3 } , { 4 , 5 , 6 } , { 7 , 8 , 9 } };
        for ( int row = 0; row < numbers.length; row++ ) {
            for ( int col = 0; col < numbers[0].length; col++ ) {
                System.out.print ( numbers[row][col] + " " );
                count++;
                sum += numbers[row][col];
            }
            System.out.println ( );

        }
        System.out.println ( sum / count );
    }
}
