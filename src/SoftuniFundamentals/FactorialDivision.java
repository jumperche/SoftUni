package SoftuniFundamentals;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//Read two integer numbers. Calculate the factorial of each number. Divide the first result by the second
// and print the division formatted to the second decimal point.
public class FactorialDivision {
    public static int sum=0;
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int a = Integer.parseInt ( scanner.nextLine ( ) );
        int b = Integer.parseInt ( scanner.nextLine ( ) );
        long sumA=factorial ( a );
        BigDecimal sA= BigDecimal.valueOf ( sumA );
        long sumB=factorial ( b );
        BigDecimal sB= BigDecimal.valueOf ( sumB );

        //double sum=sumA/sumB;
       BigDecimal sum=new BigDecimal ( 1.0 );

       sum= sA.divide(sB,2, RoundingMode.HALF_UP);
        System.out.printf ("%.2f",sum);

    }
    public static long factorial(int n){
        long factorial = 1;
// Perform an “infinite loop"
        while (true) {
            if (n == 1) {
                break;
            }

            factorial *= n;
            n--;
        }
        return factorial;
    }
}
