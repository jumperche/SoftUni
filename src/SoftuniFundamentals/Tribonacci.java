package SoftuniFundamentals;

import java.util.*;

//In the "Tribonacci" sequence, every number is formed by the sum of the previous 3.
//You are given a number num. Write a program that prints num numbers from the Tribonacci sequence, each on a new line, starting from 1.
// The input comes as a parameter named num. The value num will always be a positive integer.
public class Tribonacci {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int num = Integer.parseInt ( scanner.nextLine ( ) );
        tribonacci ( num );

    }
    public static void tribonacci(int num){
        for (int i = 1; i <= num; i++)
            System.out.print(printTribRec(i)+" ");
    }

    static int printTribRec(int n)
    {
        if ( n == 0 )
            //returns 0 if the user enter 0, 1, and 2nd term of the series
            return 0;
        if (n == 1||n==2)
            return 1;
        else
            //calculates and returns the next term of the series
            return printTribRec(n - 1) + printTribRec(n - 2) + printTribRec(n - 3);
    }
}
