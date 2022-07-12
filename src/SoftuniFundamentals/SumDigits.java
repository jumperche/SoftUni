package SoftuniFundamentals;

import java.util.*;

public class SumDigits {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input= scanner.nextLine ( );
        int x=input.length ();
        int n = Integer.parseInt ( input );
        int sum=0;
        for ( int i = 0 ; i < x ; i++ ) {
            int helper=n%10;
            sum=sum+helper;
            n=n/10;
        }
        System.out.println (sum );
    }
}
