package SoftuniFundamentals;
//You will receive two numbers (0 to 1050), print their sum.
import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        BigInteger first=new BigInteger ( scanner.nextLine () );
        BigInteger second=new BigInteger ( scanner.nextLine () );
        BigInteger sum=first.add ( second );
        System.out.println (sum );
    }
}
