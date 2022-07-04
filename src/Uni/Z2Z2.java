package Uni;

import java.util.Scanner;

public class Z2Z2 {
    public static void main ( String[] args ) {
        Scanner scan= new Scanner ( System.in );
int row= scan.nextInt ( );

        for ( int i = 1; i <=10; i++ ) {
            System.out.print ((row*i)%2+" ");
        }
    }
}
