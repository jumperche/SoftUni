package SoftuniFundamentals;
//You are given two lines – the first one can be a really big number (0 to 1050). The second one will be a single-digit number (0 to 9). You must display the product of these numbers.
//Note: do not use the BigInteger class.
import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );
        BigInteger input = new BigInteger ( scanner.nextLine ( ) );
        BigInteger n = new BigInteger ( scanner.nextLine ( ) );
BigInteger sum=input.multiply ( n );
        System.out.println ( sum);

    }
}
