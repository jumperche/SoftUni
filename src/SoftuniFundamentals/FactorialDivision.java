package SoftuniFundamentals;

import java.util.*;

//Read two integer numbers. Calculate the factorial of each number. Divide the first result by the second
// and print the division formatted to the second decimal point.
public class FactorialDivision {
    public static int sum=0;
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int a = Integer.parseInt ( scanner.nextLine ( ) );
        int b = Integer.parseInt ( scanner.nextLine ( ) );
        long sumA=factorial ( a );
        long sumB=factorial ( b );
        double sum=sumA/sumB;
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
