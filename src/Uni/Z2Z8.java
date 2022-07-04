package Uni;

import java.util.Scanner;

public class Z2Z8 {
    public static void main ( String[] args ) {
        Scanner scanner=new Scanner ( System.in );
        int value=Integer.parseInt ( scanner.nextLine ( ) );
        if (value==7){
            System.out.println ("That's lucky!" );
        }
        else if (value==13){
            System.out.println ("That's unlucky" );
        }
        else {
            System.out.println ("That number is neither lucky nor unlucky! ");
        }
    }
}
