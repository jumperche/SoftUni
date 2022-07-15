package SoftuniFundamentals;
//You will receive n lines. On those lines, you will receive one of the following:
//•	Opening bracket – "(",
//•	Closing bracket – ")" or
//•	Random string
//Your task is to find out if the brackets are balanced. That means after every closing bracket should follow an opening one. Nested parentheses are not valid, and if two consecutive opening brackets exist, the expression should be marked as unbalanced.
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
