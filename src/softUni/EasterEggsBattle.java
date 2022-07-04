package softUni;

import java.util.Scanner;

public class EasterEggsBattle {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );
        int player1 = Integer.parseInt ( scanner.nextLine ( ) );
        int player2 = Integer.parseInt ( scanner.nextLine ( ) );
        String input = scanner.nextLine ( );
        while ( !"End".equals ( input ) ) {
            if ( input.equals ( "one" ) ) {
                player2 = player2 - 1;
            } else if ( input.equals ( "two" ) ) {
                player1 = player1 - 1;
            }
            if ( player1 == 0 ) {
                System.out.printf ( " Player one is out of eggs. Player two has %d eggs left." , player2 );
                break;
            }
            if ( player2 == 0 ) {
                System.out.printf ( " Player two is out of eggs. Player one has %d eggs left." , player1 );
                break;
            }
            input = scanner.nextLine ( );
        }
        if ( player1 == 0 || player2 == 0 ) {
        }
        else {

            System.out.printf ( "Player one has %d eggs left.%n" , player1 );
            System.out.printf ( "Player two has %d eggs left.%n" , player2 );
        }
    }
}