package SoftuniFundamentals;
//Create a method that prints the sign of an integer number
import java.util.*;

public class SignofInteger {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        printSign ( n );
    }
    public static void printSign(int number){
        if (number>0){
            System.out.printf ("The number %d is positive.",number );
        } else if ( number==0 ) {
            System.out.printf ("The number 0 is zero."  );
        } else if ( number<0 ) {
            System.out.printf ("The number %d is negative.",number  );
        }
    }
}
