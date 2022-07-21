package SoftuniFundamentals;

import java.util.*;

//Write a method to print the smallest of three integer numbers. Use an appropriate name for
// the method.Write a method to print the smallest of three integer numbers. Use an appropriate name
// for the method.
public class SmallestOfThreeNumbers {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int a = Integer.parseInt ( scanner.nextLine ( ) );
        int  b= Integer.parseInt ( scanner.nextLine ( ) );
        int c = Integer.parseInt ( scanner.nextLine ( ) );
        System.out.println (findSmallesNumber ( a,b,c ) );
    }
    public static int findSmallesNumber(int a,int b,int c){
        return Math.min ( Math.min ( a,b ),c);
    }
}
