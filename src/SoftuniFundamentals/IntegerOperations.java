package SoftuniFundamentals;
//Read four integer numbers. Add first to the second, divide (integer) the sum by the third number, and multiply the result by the fourth number. Print the result.
import java.util.*;

public class IntegerOperations {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int first = Integer.parseInt ( scanner.nextLine ( ) );
        int second = Integer.parseInt ( scanner.nextLine ( ) );
        int thirth = Integer.parseInt ( scanner.nextLine ( ) );
        int fourth = Integer.parseInt ( scanner.nextLine ( ) );

        int sum=((first+second)/thirth)*fourth;
        System.out.println (sum );
    }
}
