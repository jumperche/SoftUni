package softUni;

import java.util.Scanner;

public class Building {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int stock=Integer.parseInt ( scanner.nextLine ( ) );
        int quantity=Integer.parseInt ( scanner.nextLine ( ) );
        for ( int i = 0; i < quantity; i++ ) {
            System.out.print ("L"+stock+i +" ");
        }

        for ( int i = stock-1; i >0; i-- ) {
            System.out.println ("" );

            for ( int j = 0; j < quantity; j++ ) {


                if ( i % 2 == 0 ) {
                    System.out.print ( "O" + i+j+" " );

                }
                else {
                    System.out.print ("A"+i+j +" ");
                }
            }
        }
    }
}
