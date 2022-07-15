package SoftuniFundamentals;

import java.util.*;

public class BalancedBrackets {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int line = Integer.parseInt ( scanner.nextLine ( ) );
        boolean open = false;
        boolean close = false;
        boolean is = false;
        String isT = "";
        int counterO = 0;
        int counterC = 0;
        String input = scanner.nextLine ( );
        for ( int i = 0 ; i < line-1 ; i++ ) {


            if ( input.charAt ( 0 ) == '(' ) {
                isT = isT + input.charAt ( 0 );

                open = true;
            } else if ( input.charAt ( 0 ) == ')' ) {
                isT = isT + input.charAt ( 0 );

                close = true;
            }
            if ( isT.equals ( "()" ) ) {
                is = true;

            }input = scanner.nextLine ( );
            if ( is==true&&(input.equals ( "(" )||input.equals ( ")" ))) {

                open = false;
                close = false;
                isT = "";

                is = false;
            }

        }
        if ( is ) {
            System.out.println ( "BALANCED" );
        } else {
            System.out.println ( "UNBALANCED" );
        }
    }
}
