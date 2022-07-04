package Uni;

import java.util.Scanner;

public class Labor {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        int start = Integer.parseInt ( scan.nextLine ( ) );
        int count = 0;
        while ( start != 1 ) {
            if ( start % 2 == 0 ) {
                start = start / 2;
                count++;
            } else {
                start = start * 3 + 1;
                count++;
            }
            System.out.print (start+" " );
        }
        System.out.println ( );
        System.out.println ("Interaction: "+count );
    }
}
