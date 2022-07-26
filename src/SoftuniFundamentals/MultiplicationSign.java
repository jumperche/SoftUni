package SoftuniFundamentals;

import java.util.*;

//You are given a number num1, num2, and num3. Write a program that finds if num1 * num2 * num3 (the product) is negative, positive, or zero.
// Try to do this WITHOUT multiplying the 3 numbers.
public class MultiplicationSign {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int a = Integer.parseInt ( scanner.nextLine ( ) );
        int b = Integer.parseInt ( scanner.nextLine ( ) );
        int c = Integer.parseInt ( scanner.nextLine ( ) );
        multi ( a,b,c );
    }
    public static void multi(int a,int b,int c){
        if (a*b*c<0){
            System.out.println ("negative" );
        } else if ( a*b*c==0 ) {
            System.out.println ("zero" );

        }
        else {
            System.out.println ("positive" );
        }
    }
}
