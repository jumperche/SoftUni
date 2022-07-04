package softUni;

import java.util.*;

public class ResursiveFactorial {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );

        long result=factorial ( n );
        System.out.println (result );

    }


    public static long factorial ( int n ) {
        if ( n <= 1 ) {
            return 1;
        }
        //factorial ( n-1 );
        return n*factorial ( n-1 );
    }
}

