package SoftuniFundamentals;

import java.math.*;
import java.util.*;

public class Exactsum {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        BigDecimal sum=new BigDecimal ( 0 );
        for ( int i = 0 ; i < n ; i++ ) {
            BigDecimal input=new BigDecimal ( scanner.nextLine ( ) );
            sum=sum.add ( input );
        }
        System.out.println (sum );
    }
}
