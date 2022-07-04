package SoftuniFundamentals;

import java.util.*;

public class RefactorProgram {
    public static void main ( String[] args ) {


        Scanner sc = new Scanner ( System.in );
        int n = Integer.parseInt ( sc.nextLine ( ) );
        int sum = 0;
        for ( int i = 1 ; i <= n ; i++ ) {
            System.out.print ( 2 * i + 1 );
            sum += 2 * i;
        }
        System.out.printf ( "Sum: %d%n" , sum );
    }
}
