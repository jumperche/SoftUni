package SoftuniFundamentals;

import java.util.*;

public class BalancedBrackets {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int line = Integer.parseInt ( scanner.nextLine ( ) );
        boolean open=false;
        boolean close=false;
        boolean is=false;
        String isT="";
        for ( int i = 0 ; i < line ; i++ ) {
            String input=scanner.nextLine ();

            if (input.charAt ( 0 )=='('){
                isT=isT+input.charAt ( 0 );
            }else if (input.charAt ( 0 )==')'){
                isT=isT+input.charAt ( 0 );
            }
            if (isT.equals ( "()" )){
                is=true;

            }

        }
        if (is){
            System.out.println ("BALANCED" );
        }
        else {
            System.out.println ("UNBALANCED" );
        }
    }
}
