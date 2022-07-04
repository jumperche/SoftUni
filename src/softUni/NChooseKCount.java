package softUni;

import java.util.*;

public class NChooseKCount {
    public static void main ( String[] args ) {

                Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        int k = Integer.parseInt ( scanner.nextLine ( ) );
        int binom=binom(n,k);
        System.out.println (binom );
    }

    private static int binom ( int n , int k ) {
        if(k==0||k==n)
            return 1;

        if (k>n)
            return 0;

        return binom ( n-1,k-1)+binom ( n-1,k) ;

    }
}
