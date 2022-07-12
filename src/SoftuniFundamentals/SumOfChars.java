package SoftuniFundamentals;

import java.util.*;

public class SumOfChars {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        //String chars=scanner.nextLine ();
        int sum=0;
        for ( int i = 0 ; i < n ; i++ ) {
            String chars=scanner.nextLine ();
            int ch=chars.charAt ( 0 );
            sum=sum+ch;

        }
        System.out.println ("The sum equals: "+sum );
    }
}
