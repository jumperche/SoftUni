package SoftuniFundamentals;
//You will receive a number that represents how many lines we will get as input. On the next N lines, you will receive a string with 2 numbers separated by a single space. You need to compare them. If the left number is greater than the right number, you need to print the sum of all digits in the left number, otherwise, print the sum of all digits in the right number

import java.math.BigInteger;
import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        int sum = 0;
        for ( int i = 0 ; i < n ; i++ ) {
            String[] input = scanner.nextLine ( ).split ( " " );
            BigInteger x = new BigInteger ( input[ 0 ] );
            BigInteger y = new BigInteger ( input[ 1 ] );
            BigInteger zero = new BigInteger ( String.valueOf ( 0 ) );
            if ( x.max ( y ) == x ) {
                while ( !x.equals ( zero ) ) {
                    BigInteger modulo = new BigInteger ( String.valueOf ( 10 ) );
                    BigInteger a = x.mod ( modulo );
                    sum = sum + a.intValue ( );
                    x = x.divide ( modulo );
                }

            } else {
                while ( !y.equals ( zero ) ) {
                    BigInteger modulo = new BigInteger ( String.valueOf ( 10 ) );
                    BigInteger a = y.mod ( modulo );
                    sum = sum + a.intValue ( );
                    y = y.divide ( modulo );
                }
            }
            System.out.println ( sum );
            sum = 0;
        }
    }
}




